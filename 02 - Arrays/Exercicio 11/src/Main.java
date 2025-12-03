import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();

        int[] vectIdade = new int[x];
        String[] vectNome = new String[x];

        for (int i = 0; i < x; i++){
            System.out.println("\nDigite");
            System.out.print("Nome da pessoa " + i + " :");
            vectNome[i] = sc.next();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
        }
        int maior = 0;
        int posi = 0;

        for (int i = 0; i < x; i++){
            if (vectIdade[i] > maior){
                maior = vectIdade[i];
                posi = i;
            }
        }
        System.out.print(vectNome[posi]); //identificou a posicao do maior
    }
}