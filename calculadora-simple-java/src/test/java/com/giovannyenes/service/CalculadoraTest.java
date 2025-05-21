package com.giovannyenes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    CalculadoraService calculadora = new CalculadoraService();

    @Test
    void testSoma() {
        assertEquals(5, calculadora.somar(2, 3), 0.0001);
    }

    @Test
    void testSubtracao() {
        assertEquals(1, calculadora.subtrair(3, 2), 0.0001);
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, calculadora.multiplicar(2, 3), 0.0001);
    }

    @Test
    void testDivisao() {
        assertEquals(2, calculadora.dividir(6, 3), 0.0001);
    }

    @Test
    void testDivisaoPorZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
