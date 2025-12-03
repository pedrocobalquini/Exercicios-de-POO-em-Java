import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();
        int[] vect1 = new int[x];
        int[] vect2 = new int[x];
        int[] vect3 = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.print("vet1: ");
            vect1[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            System.out.print("vet2: ");
            vect2[i] = sc.nextInt();
        }
        System.out.print("\nValores somados: ");
        for (int i = 0; i < x; i++) {
            vect3[i] = vect1[i] + vect2[i];
            System.out.print("\n" + vect3[i]);
        }

    }
}