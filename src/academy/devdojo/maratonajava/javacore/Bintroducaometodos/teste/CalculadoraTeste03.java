package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 10);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("--------");
        calculadora.imprimeDivisaoDoisNumeros(86,0);
    }
}
