import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int[] saidas = new int[n], chegadas = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                saidas[i] += mat[i][j];
                chegadas[j] += mat[i][j];
            }

        for (int i = 0; i < n; i++) System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        for (int i = 0; i < n; i++) System.out.println("Chegadas no terminal " + i + ": " + chegadas[i]);

        int idxMaiorDiff = 0;
        int maiorDiff = Math.abs(saidas[0] - chegadas[0]);
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(saidas[i] - chegadas[i]);
            if (diff > maiorDiff) { maiorDiff = diff; idxMaiorDiff = i; }
        }

        boolean simetrica = true;
        outer:
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] != mat[j][i]) { simetrica = false; break outer; }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + idxMaiorDiff);
        System.out.println("Matriz simetrica: " + (simetrica ? "sim" : "nao"));
    }
}
