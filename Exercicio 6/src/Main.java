import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a quantidade: ");
        int x = sc.nextInt();
        double[] vect = new double[x];

        for (int i = 0; i < vect.length; i++){
            System.out.print("digite o numero: ");
            vect[i] = sc.nextDouble();
        }
        double soma = 0.0;

        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }

        double media = soma / vect.length;
        System.out.println("\nmedia: " + media + "\nSoma: " + soma);
    }

}