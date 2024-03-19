package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDeNumeros() {
        System.out.println(10 + 11 + 15);
    }

    public void subtrDeNumeros() {
        System.out.println(100 - 10 - 20);
    }

    public void multiplicaNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(int num, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num / num2;
    }

    public double divideDoisNumeros02(int num, int num2) {
        if (num2 != 0) {
            return num / num2;

        }
        System.out.println("Não existe divisão por zero!");
        return 0;
    }

    public void imprimeDivisaoDoisNumeros(int num, int num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num / num2);
    }
}
