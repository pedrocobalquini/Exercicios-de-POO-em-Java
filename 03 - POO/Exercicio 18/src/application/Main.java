package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        for (int i =0; i < qtd; i++){
            System.out.print("\nTipo (f/j): ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (tipo == 'f'){
                System.out.print("Gastos com a saude: ");
                double saude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, saude));
            }
            else {
                System.out.print("Numero de funcionarios: ");
                int numFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, numFuncionarios));
            }
        }

        System.out.print("\nRESULTADO");
        for (Pessoa c : list){
            System.out.printf("\n" + c.getNome() + " - R$" + c.calculoImposto());
        }

        double soma = 0.0;
        for (Pessoa c : list){
            soma += c.calculoImposto();
        }
        System.out.print("\n\nRenda Total: " + soma);
    }
}