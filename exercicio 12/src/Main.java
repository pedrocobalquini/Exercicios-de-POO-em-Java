import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int x = sc.nextInt();

        double[] vectNota = new double[x];
        double[] vectNota2 = new double[x];
        String[] vectNome = new String[x];

        for (int i = 0; i < x; i++){
            System.out.print("Digite o nome: ");
            vectNome[i] = sc.next();
            System.out.print("Digite a nota: ");
            vectNota[i] = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            vectNota2[i] = sc.nextDouble();
        }
        double[] vectSoma = new double[x];
        double[] vectMedia = new double[x];

        for (int i = 0; i < x; i++){
            vectSoma[i] = vectNota[i] + vectNota2[i];
            vectMedia[i] = vectSoma[i] / x;
        }
        System.out.print("\nAprovados: ");
        for (int i = 0; i < x; i++){
            if (vectMedia[i] > 6){
                System.out.print("\n" + vectNome[i]);
            }
        }




    }
}