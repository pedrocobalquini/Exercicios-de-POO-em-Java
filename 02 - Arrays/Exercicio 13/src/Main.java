import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade: ");
        int x = sc.nextInt();

        double[] vectAltura = new double[x];
        char[] vectSexo = new char[x];

        for (int i = 0; i < x; i++){
            System.out.print("Sexo: ");
            vectSexo[i] = sc.next().charAt(0);
            System.out.print("Altura: ");
            vectAltura[i] = sc.nextDouble();
        }

        double maior = 0.0;
        double menor = 0.0;

        maior = menor = vectAltura[0];

        for (int i = 1; i < x; i++) {
            if (vectAltura[i] > maior) {
                maior = vectAltura[i];
            }
            if (vectAltura[i] < menor) {
                menor = vectAltura[i];
            }
        }

        double media = 0.0;
        double soma = 0.0;
        for (int i = 0; i<x;i++){
            if (vectSexo[i] == 'f'){
                soma += vectAltura[i];
            }
        }
        media = soma / x;

        int count = 0;
        for (int i = 0; i<x;i++){
            if (vectSexo[i] == 'm'){
                count++;
            }
        }
        System.out.print("\nnumero de homens: " + count);
        System.out.printf("\nmedia das mulheres: %.2f", media);
        System.out.print("\nmaior: " + maior);
        System.out.print("\nmenor: " + menor);
    }
}