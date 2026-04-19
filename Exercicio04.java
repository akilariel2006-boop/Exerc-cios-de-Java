import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] codigos = new int[n];

        for (int i = 0; i < n; i++) {
            codigos[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int primeiraPosicao = -1;

        for (int i = 0; i < n; i++) {
            if (codigos[i] == x) {
                primeiraPosicao = i;
                break;
            }
        }

        if (primeiraPosicao != -1) {
            System.out.println("Codigo encontrado");
            System.out.println("Primeira posicao: " + primeiraPosicao);
        } else {
            System.out.println("Codigo nao encontrado");
        }
    }
}
