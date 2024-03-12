package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao_03 {
    public static void main(String[] args) {
        //imprima os primeiros 25 números de um dado valor. Por exemplo 50
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
