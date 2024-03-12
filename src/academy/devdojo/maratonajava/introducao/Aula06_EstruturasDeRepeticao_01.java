package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao_01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println("while" + count);
        }
        do {
            System.out.println("do while");
        } while (count < 10);
        for (int i = 0; i < 10; i++) {
            System.out.println("for" + i);
        }
    }
}
