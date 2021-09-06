package javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {  // Caso acontecer alguma coisa
            boolean isCreated = file.createNewFile();
            System.out.println("File created ? " + isCreated);
        } catch (IOException e) {  // e aq pega a exception
            e.printStackTrace();  // Nunca deixe em branco
        }
    }
}
