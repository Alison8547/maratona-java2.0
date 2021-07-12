package introducao.repeticao;

public class EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorCarro = 30000;
        for (int parcela = 0; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " valor: R$ " + valorParcela);

        }
    }
}
