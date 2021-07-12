package introducao.arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1}; // mesma coisa q o de cima

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println();

        for (int num : numeros3) {
            System.out.println(num);
        }

    }
}
