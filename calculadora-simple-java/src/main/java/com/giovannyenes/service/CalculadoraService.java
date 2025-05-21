package com.giovannyenes.service;

//Classe responsável por realizar os calculos.

public class CalculadoraService {
    //Metodo para calcular somas
    public double somar(double a, double b) {
        return a + b;
    }
    //Metodo para calcular subtrações
    public double subtrair(double a, double b) {
        return a - b;
    }
    //Metodo para calcular multiplicações
    public double multiplicar(double a, double b) {
        return a * b;
    }
    //Metodo para calcular divisões
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
