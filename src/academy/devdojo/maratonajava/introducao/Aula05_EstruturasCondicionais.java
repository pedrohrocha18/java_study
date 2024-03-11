package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais {

    public static void main(String[] args) {
        int age = 16;
        boolean podeComprarBebida = age >= 18;
        if (podeComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }
        if (!podeComprarBebida) {
            System.out.println("Você não está autorizado a comprar bebida alcoólica!");
        }
        System.out.println("Fora do IF");
    }
}
