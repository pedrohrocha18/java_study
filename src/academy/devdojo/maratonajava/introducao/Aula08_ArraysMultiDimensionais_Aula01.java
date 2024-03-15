package academy.devdojo.maratonajava.introducao;

public class Aula08_ArraysMultiDimensionais_Aula01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        //   i  j
        dias[0][0] = 31;
        dias[0][1] = 15;
        dias[0][2] = 16;

        dias[1][0] = 10;
        dias[1][1] = 12;
        dias[1][2] = 17;

        dias[2][0] = 360;
        dias[2][1] = 180;
        dias[2][2] = 500;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
