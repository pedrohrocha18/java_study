package academy.devdojo.maratonajava.introducao;

public class Aula08_ArraysMultiDimensionais_Aula02 {
    public static void main(String[] args) {
        String[] arrayTeste = {"Pedro", "Adrielle", "Amor"};

        String[][] arrayName = new String[3][];

        arrayName[0] = new String[2];
        arrayName[1] = arrayTeste;
        arrayName[2] = new String[]{"Pedro", "Adrielle", "Amor", "Eterno"};

        int[][] arrayTeste2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] name : arrayTeste2) {
            System.out.println("-------");
            for (int nameE : name) {
                System.out.println(nameE + "");
            }
        }
    }
}
