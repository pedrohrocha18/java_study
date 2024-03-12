package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais_04Exercicio {
    public static void main(String[] args) {
        double salary = 70000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto = 0;
        if (salary <= 34712) {
            valorImposto = salary * primeiraFaixa;
        }
        if (salary >= 34713 && salary <= 68507) {
            valorImposto = salary * segundaFaixa;
        }
        if (salary >= 68508) {
            valorImposto = salary * terceiraFaixa;
        }
        System.out.println("Valor do imposto R$" + valorImposto);
    }
}
