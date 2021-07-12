package introducao.arrays;

public class ArraysMultidimensionais04 {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 8;
        dias[0][2] = 5;

        dias[1][0] = 2;
        dias[1][1] = 9;
        dias[1][2] = 15;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
