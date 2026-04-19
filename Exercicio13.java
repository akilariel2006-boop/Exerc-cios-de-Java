import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int k = sc.nextInt();
        int maior = mat[0][0], qtd = 0;
        double soma = 0;

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++) {
                soma += mat[i][j];
                if (mat[i][j] > maior) maior = mat[i][j];
                if (mat[i][j] > k) qtd++;
            }

        double media = soma / (l * c);
        System.out.printf("Media dos elementos: %.2f%n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + qtd);
    }
}
