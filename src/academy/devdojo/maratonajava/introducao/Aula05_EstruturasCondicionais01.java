package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {

    public static void main(String[] args) {
        int age = 16;
        boolean podeComprarBebida = age >= 18;
//        if (podeComprarBebida) {
//            System.out.println("Autorizado a comprar bebida alcoólica!");
//        }
//        if (!podeComprarBebida) {
//            System.out.println("Você não está autorizado a comprar bebida alcoólica!");
//        }
//        System.out.println("Fora do IF");
        if (podeComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica!");
        } else {
            System.out.println("Não está autorizado a comprar bebida alcoólica!");
        }
    }
}
