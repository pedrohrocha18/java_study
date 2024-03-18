package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Exercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Dodge Ram";
        carro.modelo = "Caminhoneta";
        carro.ano = 2023;

        carro2.nome = "Nivus";
        carro2.modelo = "SUV";
        carro2.ano = 2023;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
