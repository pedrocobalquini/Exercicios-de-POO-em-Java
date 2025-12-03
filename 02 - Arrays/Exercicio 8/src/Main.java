import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();
        int[] vect = new int[x];

        int maior = 0;
        int posi = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite: ");
            vect[i] = sc.nextInt();
            if (vect[i] > maior){
                maior = vect[i];
                posi = i;
            }
        }
        System.out.println("Maior: " + maior + " e posicao: " + posi);

    }

}