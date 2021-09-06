package javacore.colecoes.test;

import javacore.colecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("11AB", "Iphone");
        SmartPhone s2 = new SmartPhone("11AB", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
