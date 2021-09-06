package javacore.exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked and Unchecked
        int[] numbers = {1,2};
        System.out.println(numbers[2]); // Erro ArrayIndexOutOfBoundsException  Unchecked exception o erro foi vc
    }
}
