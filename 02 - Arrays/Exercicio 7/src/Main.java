import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();
        int[] vect = new int[x];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite o numero: ");
            vect[i] = sc.nextInt();
        }
        int valorPar = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.println("Pares: " + vect[i]);
                valorPar++;
            }
        }
        System.out.println("Quantidade: " + valorPar);

    }
}