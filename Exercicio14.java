import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int[] somaL = new int[l], somaC = new int[c];
        double somaTotal = 0;

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++) {
                somaL[i] += mat[i][j];
                somaC[j] += mat[i][j];
                somaTotal += mat[i][j];
            }

        int idxMaiorL = 0, idxMenorC = 0;
        for (int i = 1; i < l; i++) if (somaL[i] > somaL[idxMaiorL]) idxMaiorL = i;
        for (int j = 1; j < c; j++) if (somaC[j] < somaC[idxMenorC]) idxMenorC = j;

        double media = somaTotal / (l * c);
        int qtdAcima = 0;
        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] > media) qtdAcima++;

        System.out.println("Linha com maior soma: " + idxMaiorL);
        System.out.println("Coluna com menor soma: " + idxMenorC);
        System.out.printf("Media geral: %.2f%n", media);
        System.out.println("Quantidade acima da media: " + qtdAcima);
    }
}
