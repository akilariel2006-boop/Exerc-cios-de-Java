import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("Matriz transposta:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < l; i++) {
                System.out.print(mat[i][j]);
                if (i < l - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
