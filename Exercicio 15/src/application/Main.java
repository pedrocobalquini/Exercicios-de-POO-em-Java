package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Client data");
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data: ");
        String data = sc.next();
        Client client = new Client(nome, email, data);

        System.out.print("Status: ");
        String status = sc.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        System.out.print("Quantos itens: ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++){
            System.out.print("\nNome do produto: ");
            String produtoNome = sc.next();
            System.out.print("Preco: ");
            double precoProduto = sc.nextDouble();
            Product product = new Product(produtoNome, precoProduto);

            System.out.print("Quantidade itens: ");
            int qtdItens = sc.nextInt();
            OrderItem orderItem = new OrderItem(qtdItens, precoProduto, product);
            order.addPedidos(orderItem);

        }
        System.out.println(order);
    }
}