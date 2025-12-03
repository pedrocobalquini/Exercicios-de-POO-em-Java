package application;

import model.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Account account;


        System.out.print("CONTA\n");
        System.out.print("numero da conta: ");
        int num = sc.nextInt();
        System.out.print("nome: ");
        String nome = sc.next();
        System.out.print("saldo: ");
        double balance = sc.nextDouble();
        System.out.print("limite: ");
        double limite = sc.nextDouble();

        account = new Account(num, nome, balance, limite);

        System.out.print("Saque: ");
        double saque = sc.nextDouble();

        try {
            account.withdraw(saque);
            System.out.print("\n" + account);
        }
        catch (IllegalArgumentException e){
            System.out.print("Erro: " + e.getMessage());
        }


    }
}