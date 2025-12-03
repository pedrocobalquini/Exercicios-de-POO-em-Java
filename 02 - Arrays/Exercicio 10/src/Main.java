import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();
        double[] vect = new double[x];

        for (int i = 0; i< vect.length; i++){
            System.out.print("Digite os valores: ");
            vect[i] = sc.nextDouble();
        }
        double media = 0.0;
        double soma = 0.0;

        for(int i = 0; i< vect.length; i++){
            soma += vect[i];
        }
        media = soma / vect.length;
        System.out.println("media: " + media);

        System.out.println("Abaixo da media: ");
        for (int i = 0; i< vect.length; i++){
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
    }
}