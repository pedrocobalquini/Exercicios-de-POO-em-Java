import entities.Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Alunos aluno = new Alunos();
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite 3 notas do aluno: ");
        aluno.a = sc.nextDouble();
        aluno.b = sc.nextDouble();
        aluno.c = sc.nextDouble();

        System.out.println(aluno);
    }
}
