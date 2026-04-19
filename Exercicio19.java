import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        // soma da primeira linha (referencia)
        int ref = 0;
        for (int j = 0; j < n; j++) ref += mat[0][j];

        int diferentes = 0;

        // verifica linhas (pula linha 0)
        for (int i = 1; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < n; j++) soma += mat[i][j];
            if (soma != ref) diferentes++;
        }

        // verifica colunas
        for (int j = 0; j < n; j++) {
            int soma = 0;
            for (int i = 0; i < n; i++) soma += mat[i][j];
            if (soma != ref) diferentes++;
        }

        // diagonal principal
        int somaP = 0;
        for (int i = 0; i < n; i++) somaP += mat[i][i];
        if (somaP != ref) diferentes++;

        // diagonal secundaria
        int somaS = 0;
        for (int i = 0; i < n; i++) somaS += mat[i][n - 1 - i];
        if (somaS != ref) diferentes++;

        if (diferentes == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + ref);
        } else {
            System.out.println("Matriz consistente: nao");
            System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferentes);
        }
    }
}
