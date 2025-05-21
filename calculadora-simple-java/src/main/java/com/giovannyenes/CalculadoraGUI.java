package com.giovannyenes;

import com.giovannyenes.service.CalculadoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField display;  // Campo onde os números e o resultado aparecem.
    private double num1, num2;  //  Atributos para armazenar os números da operação.
    private String operador;    //  Variável para armazenar o operador.
    private CalculadoraService calculadora; // Instância da classe que realiza os cálculos.

    // Construtor da classe.
    public CalculadoraGUI() {
        calculadora = new CalculadoraService();

        // Configuração da Janela Principal.
        setTitle("Calculadora");
        setSize(400, 500); // Largura e altura.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cria o botão de fechar a aplicação.
        setLayout(new BorderLayout()); // Define o layout principal.

        // Campo de exibição
        display = new JTextField(); // Cria a tela onde os números aparecem.
        display.setEditable(false); // Isto não deixa o usuário digitar pelo teclado, apenas clicando na tela.
        display.setFont(new Font("Arial", Font.BOLD, 24)); // Define a fonte e o tamanho do texto.
        display.setHorizontalAlignment(JTextField.RIGHT); // Deixa o texto no lado direito.
        add(display, BorderLayout.NORTH); // Adiciona o display onde aparecem os números digitados.

        // Painel de botões
        JPanel panel = new JPanel(); // Cria um painel para organizar os botões.
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // Cria uma grade (4 linhas, 4 colunas) com espaçamento de 5px.

        // Botões da calculadora
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
        };

        for (String text : buttons) {  // Cria um botão para cada elemento do array.
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18)); // Define fonte.
            button.setBackground(Color.lightGray); // Cor de fundo do botão.
            button.setForeground(Color.BLACK);      // Cor do texto.
            button.addActionListener(new ButtonClickListener()); // Adiciona um evento ao botão.
            panel.add(button); // Adiciona o botão ao painel.
        }

        add(panel, BorderLayout.CENTER); //  Coloca os botões no centro da janela.
        setVisible(true); // Exibe a interface para o usuário.
    }

    // Classe interna para tratar eventos dos botões
    private class ButtonClickListener implements ActionListener {  // O ActionListener serve para capturar cliques nos botões.
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); // Obtém o texto do botão clicado.

            if ("0123456789".contains(command)) {  // Se o botão clicado for um número (0-9), ele é adicionado ao display.
                display.setText(display.getText() + command);
            } else if ("+-*/".contains(command)) {  // Salva o primeiro atributo escolhido.
                num1 = Double.parseDouble(display.getText());
                operador = command;
                display.setText(display.getText() + " " + operador + " ");
            } else if (command.equals("=")) {
                String[] partes = display.getText().split(" ");
                if (partes.length == 3) {
                    num1 = Double.parseDouble(partes[0]);
                    operador = partes[1];
                    num2 = Double.parseDouble(partes[2]);
                    double resultado = calcular(num1, num2, operador);
                    display.setText(display.getText() + " = " + resultado);
                }
            } else if (command.equals("C")) {  // Botão para limpar a tela.
                display.setText("");
            }
        }
    }

    // Metodo para chamar os cálculos da CalculadoraService
    private double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+": return calculadora.somar(num1, num2);
            case "-": return calculadora.subtrair(num1, num2);
            case "*": return calculadora.multiplicar(num1, num2);
            case "/":
                try {
                    return calculadora.dividir(num1, num2);
                } catch (ArithmeticException ex) {  // Trata a exceção de divisão por zero
                    JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return 0;
                }
            default: return 0;
        }
    }

    // Metodo principal para rodar a calculadora gráfica;
    public static void main(String[] args) {
        new CalculadoraGUI();
    }
}
