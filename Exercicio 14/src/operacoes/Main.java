package operacoes;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantidade: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, salario, nome));
        }

        System.out.print("Qual Id deseja incrementar? ");
        int idProcurar = sc.nextInt();

        Funcionario emp = list.stream().filter(id -> id.getId() == idProcurar).findFirst().orElse(null);

        if (emp == null){
            System.out.print("O ID nao existe");
        }
        else {
            System.out.print("Qual a porcentagem? ");
            int percent = sc.nextInt();
            emp.aumentoSalario(percent);
        }

        for (Funcionario obj : list){
            System.out.print("\n" + obj);
        }
    }
}