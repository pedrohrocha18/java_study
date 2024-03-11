package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salary > 5000
        double salary = 4000;
        String msgDoar = "Eu vou doar R$ 500,00 para DevDojo";
        String msgNãoDoar = "Ainda não tenho condições, mas, um dia eu vou ter!";
        String resultado = salary > 5000 ? msgDoar : msgNãoDoar;

        System.out.println(resultado);
    }
}
