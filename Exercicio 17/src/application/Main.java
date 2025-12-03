package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> list = new ArrayList<>();

        System.out.print("Numero de itens: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            System.out.print("Tipo de item (c/u/i): ");
            char op = sc.next().charAt(0);
            System.out.print("Item: ");
            String item = sc.next();
            System.out.print("Valor: ");
            double preco = sc.nextDouble();

            if (op == 'i'){ //importados
                System.out.print("Valor da taxa: ");
                double tax = sc.nextDouble();
                list.add(new ImportedProduct(item, preco, tax));
            }
            else if(op == 'u'){ //com data
                System.out.print("data: ");
                String data = sc.next();
                list.add(new UsedProduct(item, preco, data));
            }
            else {
                list.add(new Product(item, preco));
            }
        }
        for (Product c : list){
            System.out.print(c.priceTag() + "\n");
        }
    }
}