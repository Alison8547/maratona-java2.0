package introducao.condicionais;

public class Aula005EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoBeber = idade >= 18;
        if (isAutorizadoBeber) {
            System.out.println("Você está autorizado a beber!");
        }
        if (!isAutorizadoBeber) { // ! valor de negação.  a mesma coisa q fazer isAtorizado == false
            System.out.println("Você não está autorizado a beber!");
        }
        System.out.println("Fora do if");
    }
}
