package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jody";
        professor.age = 28;
        professor.sex = 'M';

        System.out.println("Nome: "+ professor.nome + " Idade: " +professor.age +  " Sexo: " + professor.sex);
    }
}
