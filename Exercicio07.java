import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int maiorSoma = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            int soma = 0;
            for (int j = 0; j < c; j++) soma += mat[i][j];
            System.out.println("Soma da linha " + i + ": " + soma);
            if (soma > maiorSoma) maiorSoma = soma;
        }
        System.out.println("Maior soma: " + maiorSoma);
    }
}
