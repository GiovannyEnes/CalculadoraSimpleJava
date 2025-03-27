package Main.App;

import Main.Service.CalculadoraService;

import java.util.Scanner;

// Classe responsável por interagir com o usuário e capturar os dados via console.

public class CalculadoraInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraService calculadora = new CalculadoraService();

        System.out.println("Calculadora Basica");
        System.out.println();

        int operacao;

        do {
            // Captura da operação desejada
            System.out.print("Digite a operação desejada: \n \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 9-Sair ");
            System.out.println();
            operacao = scanner.nextInt();

            double resultado = 0;

            if (operacao == 1) {
                // Captura do primeiro número
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                // Captura do segundo número
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = calculadora.somar(num1, num2);
                System.out.println();
                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
            else if (operacao == 2) {
                // Captura do primeiro número
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                // Captura do segundo número
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = calculadora.subtrair(num1, num2);
                System.out.println();
                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
            else if (operacao == 3) {
                // Captura do primeiro número
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                // Captura do segundo número
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = calculadora.multiplicar(num1, num2);
                System.out.println();
                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
            else if (operacao == 4) {
                // Captura do primeiro número
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                // Captura do segundo número
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                resultado = calculadora.dividir(num1, num2);
                System.out.println();
                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
            else if (operacao != 9) {
                System.out.println("Operação invalida, escolha novamente!");
            }
            else {
                System.out.println("Obrigado por utilizar a calculadora!");
            }

        } while (operacao != 9);
        scanner.close(); // Garante que o Scanner será fechado
    }
}
