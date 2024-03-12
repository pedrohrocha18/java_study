package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao_04 {
    public static void main(String[] args) {
        double vlrCarro = 65000;
        for (int parcela = 1; parcela <= vlrCarro; parcela++) {
            double vlrParcela = vlrCarro / parcela;
            if (vlrParcela < 1000) {
                break;
            }
            if (vlrParcela >= 1500) {
                System.out.println("parcela " + parcela + " R$" + vlrParcela);
            }
        }
    }
}
