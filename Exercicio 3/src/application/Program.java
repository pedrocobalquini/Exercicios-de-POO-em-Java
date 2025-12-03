package application;
import util.dolar;

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dolar: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor da conversao: ");
        double y = sc.nextDouble();

        double z = dolar.converteEmDolar(x, y);
        double w = dolar.calculaIOF(z);

        System.out.println(w);
    }
}