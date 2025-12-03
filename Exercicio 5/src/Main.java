import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um numero? ");
        x = sc.nextInt();
        int[] vect = new int[x];

        for (int i = 0; i<vect.length; i++){
            System.out.print("digite valores ");
            vect[i] = sc.nextInt();
        }
        for (int i = 0; i<vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }
}