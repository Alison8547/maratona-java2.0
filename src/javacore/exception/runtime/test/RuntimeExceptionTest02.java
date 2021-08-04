package javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

    }

    /**
     * @param a
     * @param b não pode ser por zero
     * @return
     * @throws IllegalArgumentException caso você vc divida por zero
     */

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por zero! ");
        }
        return a / b;
    }
}
