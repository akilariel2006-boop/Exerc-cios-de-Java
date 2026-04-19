import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            precos[i] = sc.nextDouble();
        }

        int p = sc.nextInt();
        double fator = 1 + p / 100.0;

        double totalAntes = 0, totalDepois = 0;
        double[] novos = new double[n];

        for (int i = 0; i < n; i++) {
            totalAntes += precos[i];
            novos[i] = precos[i] * fator;
            totalDepois += novos[i];
        }

        System.out.println("Novos precos:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", novos[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.printf("Total antes do reajuste: %.2f%n", totalAntes);
        System.out.printf("Total depois do reajuste: %.2f%n", totalDepois);
    }
}
