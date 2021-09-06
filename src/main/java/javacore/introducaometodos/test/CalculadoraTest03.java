package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        calc.imprimeDivisaoDeDoisNumeros(25, 0);
    }
}
