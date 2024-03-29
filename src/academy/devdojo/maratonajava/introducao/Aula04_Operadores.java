package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        // ' + ' sum
        // ' - ' subtraction
        // ' / ' division
        // ' * ' multiplication
        // ' % ' rest (par ou ímpar, valor numérico)
        // ' < > ' (retorna valor booleano)
        // ' >= <= ' maior igual, menor igual
        // ' == != ' igual, diferente

/*        double numb1 = 10;
        double numb2 = 20;
        boolean isDezIgualVinte = numb1 == numb2;
        boolean isDezIgualDez = numb1 == numb1;
        boolean isDezMaiorQueVinte = numb1 > numb2;
        boolean isDezMenorQueVinte = numb1 < numb2;
        boolean isDezDiferenteDeVinte = numb1 != numb2;
        System.out.println("Dez igual a vinte? " + isDezIgualVinte);
        System.out.println("Dez igual a dez? " + isDezIgualDez);
        System.out.println("Dez maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez menor que vinte? " + isDezMenorQueVinte);
        System.out.println("Dez diferente de vinte? " + isDezDiferenteDeVinte);*/

        // && => todas as condições precisam ser verdadeiras
        // || => uma das condições precisa ser verdadeira
        // ! => operador de negação "ao contrário"

        double saldoContaCorrente = 140;
        double saldoContaPoupança = 3500;
        float valorPlaystation = 5000;

        if (saldoContaCorrente == 5000 || saldoContaPoupança == 5000) {
            System.out.println("Compra realizada com sucesso!");
        } else if (saldoContaCorrente <= 5000 || saldoContaPoupança == 5000) {
            System.out.println("Saldo insuficiente para realizar a compra!");
        } else if (saldoContaCorrente + saldoContaPoupança >= 5000) {
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a compra!");
        }

    }
}
