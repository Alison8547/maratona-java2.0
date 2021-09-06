package introducao.condicionais;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 80000;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;
        double valorimposto;
        if (salario <= 34712) {
            valorimposto = salario * imposto1;
        } else if (salario > 34712 && salario <= 68507) {
            valorimposto = salario * imposto2;
        } else {
            valorimposto = salario * imposto3;
        }
        System.out.println(valorimposto);
    }
}
