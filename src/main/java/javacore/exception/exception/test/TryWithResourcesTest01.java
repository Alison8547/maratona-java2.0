package javacore.exception.exception.test;

import javacore.exception.exception.dominio.Leitor1;
import javacore.exception.exception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}
