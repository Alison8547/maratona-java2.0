package introducao.arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char '\u0000'
        // boolean false
        // String null
        String[] nomes = new String[4];

        nomes[0] = "Alison";
        nomes[1] = "Breno";
        nomes[2] = "Bruno";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
