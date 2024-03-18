package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.age = 18;
        estudante.sex = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
