import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), c = sc.nextInt();
        int total = l * c;
        int[] elementos = new int[total];

        for (int i = 0; i < total; i++) elementos[i] = sc.nextInt();

        int r = sc.nextInt(), s = sc.nextInt();

        if (r * s != total) {
            System.out.println("Reorganizacao impossivel");
            return;
        }

        System.out.println("Matriz reorganizada:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(elementos[i * s + j]);
                if (j < s - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
