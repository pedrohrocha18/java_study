package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        calculator.somaDeNumeros();
        calculator.subtrDeNumeros();
        System.out.println("Finalizando Calculadora");
    }
}
