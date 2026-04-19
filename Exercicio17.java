import java.util.Scanner;

public class Exercicio17 {

    static int kadane(int[] arr) {
        int maxAtual = arr[0], maxGlobal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxAtual = Math.max(arr[i], maxAtual + arr[i]);
            if (maxAtual > maxGlobal) maxGlobal = maxAtual;
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int maiorLinha = Integer.MIN_VALUE, idxLinha = 0;
        for (int i = 0; i < l; i++) {
            int val = kadane(mat[i]);
            if (val > maiorLinha) { maiorLinha = val; idxLinha = i; }
        }

        int maiorColuna = Integer.MIN_VALUE, idxColuna = 0;
        for (int j = 0; j < c; j++) {
            int[] col = new int[l];
            for (int i = 0; i < l; i++) col[i] = mat[i][j];
            int val = kadane(col);
            if (val > maiorColuna) { maiorColuna = val; idxColuna = j; }
        }

        System.out.println("Maior soma contigua em linha: " + maiorLinha);
        System.out.println("Linha da maior soma contigua: " + idxLinha);
        System.out.println("Maior soma contigua em coluna: " + maiorColuna);
        System.out.println("Coluna da maior soma contigua: " + idxColuna);
    }
}
