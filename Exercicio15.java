import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        boolean diagZeros = true;
        for (int i = 0; i < n; i++)
            if (mat[i][i] != 0) { diagZeros = false; break; }

        int maior = Integer.MIN_VALUE, mi = 0, mj = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i != j && mat[i][j] > maior) {
                    maior = mat[i][j]; mi = i; mj = j;
                }

        int[] somaL = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                somaL[i] += mat[i][j];

        int idxMenorL = 0;
        for (int i = 1; i < n; i++)
            if (somaL[i] < somaL[idxMenorL]) idxMenorL = i;

        System.out.println("Diagonal principal com zeros: " + (diagZeros ? "sim" : "nao"));
        System.out.println("Maior valor fora da diagonal: " + maior + " (" + mi + "," + mj + ")");
        System.out.println("Linha com menor soma: " + idxMenorL);
    }
}
