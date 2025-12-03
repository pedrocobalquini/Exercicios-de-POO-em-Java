package Caixa;
import Operacao.Operacoes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes operacoes; // instanciar fora do if para usar em qualquer lugar da classe

        System.out.print("ID da conta: ");
        int id = sc.nextInt();
        System.out.print("Nome da conta: ");
        String nome = sc.next();
        System.out.print("Tem dinheiro na conta? (s/n)");
        char op = sc.next().charAt(0);
        if (op == 's'){
            System.out.print("Dinheiro da conta: ");
            double dinheiro = sc.nextDouble();
            operacoes = new Operacoes(id, nome, dinheiro); //erro nessas duas partes
        }
        else {
            operacoes = new Operacoes(id, nome);
        }

        System.out.println(operacoes.toString());

        System.out.print("Deposito da conta: ");
        double deposito = sc.nextDouble();
        operacoes.depositoConta(deposito);

        System.out.println(operacoes.toString());

        System.out.print("Saque da conta: ");
        double saque = sc.nextDouble();
        operacoes.saqueConta(saque);

        System.out.println(operacoes.toString());

        sc.close();
    }
}