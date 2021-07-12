package introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;

        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > =< => == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);

        // && (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4500;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float playstation = 5000F;
        boolean isPlaystationCompravel = valorContaCorrente >= playstation || valorContaPoupanca >= playstation;
        System.out.println(isPlaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(--contador2);


    }
}
