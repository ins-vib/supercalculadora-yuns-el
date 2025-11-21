package org.yourcompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
    @Test
    public void test1() {
        assertEquals(3, Calculadora.nombreDigits(123));
        assertEquals(1, Calculadora.nombreDigits(0));
        assertEquals(6, Calculadora.nombreDigits(111111));
        assertEquals(3, Calculadora.nombreDigits(-344));
        assertEquals(1, Calculadora.nombreDigits(1));
    }

    @Test
    public void test2() {
        assertEquals(55, Calculadora.sumaPrimersNumeros(10));
        assertEquals(0, Calculadora.sumaPrimersNumeros(0));
        assertEquals(1, Calculadora.sumaPrimersNumeros(1));
        assertEquals(6, Calculadora.sumaPrimersNumeros(3));
        assertEquals(5050, Calculadora.sumaPrimersNumeros(100));
    }

    @Test
    public void test3() {
        assertEquals(120, Calculadora.calcularFactorial(5));
        assertEquals(1, Calculadora.calcularFactorial(0));
        assertEquals(1, Calculadora.calcularFactorial(1));
        assertEquals(3628800, Calculadora.calcularFactorial(10));
    }

    @Test
    public void test4() {
        assertEquals(Integer.valueOf(55), Calculadora.sumaQuadrats(5));
        assertEquals(Integer.valueOf(0), Calculadora.sumaQuadrats(0));
        assertEquals(Integer.valueOf(1), Calculadora.sumaQuadrats(1));
        assertEquals(Integer.valueOf(14), Calculadora.sumaQuadrats(3));
        assertEquals(Integer.valueOf(204), Calculadora.sumaQuadrats(8));
    }

    @Test
    public void test5() {
        assertEquals(Double.valueOf(27), Calculadora.calcularPotencia(3, 3));
        assertEquals(Double.valueOf(1), Calculadora.calcularPotencia(5, 0));
        assertEquals(Double.valueOf(5), Calculadora.calcularPotencia(5, 1));
        assertEquals(Double.valueOf(1), Calculadora.calcularPotencia(2, -2));
        assertEquals(Double.valueOf(16), Calculadora.calcularPotencia(-2, 4));
    }
}