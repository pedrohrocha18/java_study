package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores_2 {

    public static void main(String[] args) {
        // = += -= *= /= %=

        double bonus = 1800;
        //bonus = bonus + 1000
        bonus += 1000;
        //saída: 2800
        //bonus = bonus - 1000
        bonus -= 1000;
        //saída: 800
        //e assim por diante...
        System.out.println(bonus);

        // ++
        int contador = 0;
        contador++;
        contador--;
        //++contador (primeiro incrementa depois executa)
        //contador++ (primeiro executa depois incrementa)
        System.out.println(contador);
    }
}
