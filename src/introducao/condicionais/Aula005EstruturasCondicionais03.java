package introducao.condicionais;

public class Aula005EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Vou dar 500 ao DevDOJO";
        String mensagemNaoDoar = "Não tenho condições. Mas um dia terei!";
        String resultado;
        // Operador ternário
        // (Condição) ? true : false
        resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
