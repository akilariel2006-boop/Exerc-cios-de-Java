import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int[] somasLinha = new int[l];
        int[] somasColuna = new int[c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++) {
                somasLinha[i] += mat[i][j];
                somasColuna[j] += mat[i][j];
            }

        for (int i = 0; i < l; i++) System.out.println("Soma da linha " + i + ": " + somasLinha[i]);
        for (int j = 0; j < c; j++) System.out.println("Soma da coluna " + j + ": " + somasColuna[j]);

        int idxL = 0, idxC = 0;
        for (int i = 1; i < l; i++) if (somasLinha[i] > somasLinha[idxL]) idxL = i;
        for (int j = 1; j < c; j++) if (somasColuna[j] > somasColuna[idxC]) idxC = j;

        System.out.println("Linha com maior soma: " + idxL);
        System.out.println("Coluna com maior soma: " + idxC);
    }
}
