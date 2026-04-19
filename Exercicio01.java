import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] consumo = new int[n];

        for (int i = 0; i < n; i++) {
            consumo[i] = sc.nextInt();
        }

        int total = 0;
        for (int v : consumo) total += v;

        double media = (double) total / n;

        int diasAcima = 0;
        for (int v : consumo) {
            if (v > media) diasAcima++;
        }

        System.out.println("Consumo total: " + total);
        System.out.printf("Consumo medio: %.2f%n", media);
        System.out.println("Dias acima da media: " + diasAcima);
    }
}
