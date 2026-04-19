import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int qtd = 0, maiorPico = Integer.MIN_VALUE, pi = -1, pj = -1;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                boolean pico = true;
                for (int[] d : dirs) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < l && nj >= 0 && nj < c) {
                        if (mat[ni][nj] >= mat[i][j]) { pico = false; break; }
                    }
                }
                if (pico) {
                    qtd++;
                    if (mat[i][j] > maiorPico) {
                        maiorPico = mat[i][j]; pi = i; pj = j;
                    }
                }
            }
        }

        System.out.println("Quantidade de pontos de pico: " + qtd);
        System.out.println("Posicao do maior ponto de pico: " + pi + " " + pj);
        System.out.println("Valor do maior ponto de pico: " + maiorPico);
    }
}
