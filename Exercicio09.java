import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int somaP = 0, somaS = 0;
        for (int i = 0; i < n; i++) {
            somaP += mat[i][i];
            somaS += mat[i][n - 1 - i];
        }

        int somaTotal;
        if (n % 2 == 1) {
            // centro pertence às duas diagonais, evitar duplicata
            somaTotal = somaP + somaS - mat[n / 2][n / 2];
        } else {
            somaTotal = somaP + somaS;
        }

        System.out.println("Soma da diagonal principal: " + somaP);
        System.out.println("Soma da diagonal secundaria: " + somaS);
        System.out.println("Soma total das diagonais sem repetir o centro: " + somaTotal);
    }
}
