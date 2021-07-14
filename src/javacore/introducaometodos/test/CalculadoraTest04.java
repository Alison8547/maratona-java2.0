package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println();
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1: " + num1);  // como é um valor primitivo ele sempre pega uma cópia
        System.out.println("Num2: " + num2);
    }
}
