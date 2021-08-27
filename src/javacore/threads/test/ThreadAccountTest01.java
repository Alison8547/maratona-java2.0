package javacore.threads.test;

import javacore.threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Alison");
        Thread t2 = new Thread(threadAccountTest01, "Ellie");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Deu errado");
            }
        }
    }

    public void withdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " está indo sacar o dinheiro");
            account.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, o valor atual da sua conta é: " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}
