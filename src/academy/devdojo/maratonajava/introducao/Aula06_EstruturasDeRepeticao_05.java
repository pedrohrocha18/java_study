package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao_05 {
    public static void main(String[] args) {
        double vlrCarro = 65000;
        for (int parcela = (int) vlrCarro; parcela >= 1; parcela--) {
            double vlrParcela = vlrCarro / parcela;
            if (vlrParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + " R$" + vlrParcela);
        }
    }
}
