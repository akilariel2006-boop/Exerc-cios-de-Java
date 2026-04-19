import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        double[][] mat = new double[l][c];

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextDouble();

        int aprovados = 0;

        for (int i = 0; i < l; i++) {
            double soma = 0;
            for (int j = 0; j < c; j++) soma += mat[i][j];
            double media = soma / c;
            System.out.printf("Media do aluno %d: %.2f%n", i, media);
            if (media >= 7.0) aprovados++;
        }

        for (int j = 0; j < c; j++) {
            double soma = 0;
            for (int i = 0; i < l; i++) soma += mat[i][j];
            System.out.printf("Media da avaliacao %d: %.2f%n", j, soma / l);
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);
    }
}
