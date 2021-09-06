package javacore.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        // abreConexao();
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no sistema");
            return "Conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();
        } finally { // finally sempre será executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no sistema");
            throw new RuntimeException();

        } finally { // finally sempre será executado
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}
