package javacore.exception.exception.test;

import javacore.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Alison";
        String passwordDB = "8585";
        System.out.println("Login: ");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String passwordDigitado = scanner.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Login ou senha inválidos");
        }
        System.out.println("Login feito com sucesso!");
    }
}
