package introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, long, boolean, short
        int idade = (int) 10000000000L; // cast porem tá maior que o int então ele vai colocar um número estranho
        long numeroGrande = (long) 155.23; // como é um cast pra long ele vai ignorar as casas decimais
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D; // cast normal sem passar os limites então ele vai colocar o número certo
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("Char: " + caractere);
        System.out.println(idade);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);

    }
}
