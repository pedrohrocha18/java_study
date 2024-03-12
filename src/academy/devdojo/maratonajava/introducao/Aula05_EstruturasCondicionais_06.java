package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais_06 {
    public static void main(String[] args) {
        //dado os valores de 1 a 7 imprima se é dia útil ou final de semana
        //considerando 1 como domingo

        int diaSemana = 0;
        while (diaSemana < 7) {
            diaSemana++;
            switch (diaSemana) {
                case 1:
                case 7:
                    System.out.println("Final de semana");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Dia de semana");
                    break;
                default:
                    System.out.println("Dia inválido");
                    break;
            }
        }
    }
}
