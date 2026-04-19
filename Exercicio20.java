import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int k = sc.nextInt();

        int maiorComp = 0, idxLinha = -1, inicio = -1, fim = -1;

        for (int i = 0; i < l; i++) {
            int j = 0;
            while (j < c) {
                if (mat[i][j] > k) {
                    int start = j;
                    while (j < c && mat[i][j] > k) j++;
                    int comp = j - start;
                    if (comp > maiorComp) {
                        maiorComp = comp;
                        idxLinha = i;
                        inicio = start;
                        fim = j - 1;
                    }
                } else {
                    j++;
                }
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + maiorComp);
        System.out.println("Linha da sequencia: " + idxLinha);
        System.out.println("Indice inicial: " + inicio);
        System.out.println("Indice final: " + fim);
    }
}
