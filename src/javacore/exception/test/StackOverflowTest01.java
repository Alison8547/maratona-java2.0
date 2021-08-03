package javacore.exception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();  // Erro estorou a memoria não tem como concertar em tempo de execução
    }
    public static void recursividade(){
        recursividade();
    }
}
