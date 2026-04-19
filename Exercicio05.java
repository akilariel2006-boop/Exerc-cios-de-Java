import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prod = new int[n];

        for (int i = 0; i < n; i++) {
            prod[i] = sc.nextInt();
        }

        int maior = prod[0], menor = prod[0];
        int maiorCrescimento = 0;

        for (int i = 0; i < n; i++) {
            if (prod[i] > maior) maior = prod[i];
            if (prod[i] < menor) menor = prod[i];
            if (i > 0) {
                int diff = prod[i] - prod[i - 1];
                if (diff > maiorCrescimento) maiorCrescimento = diff;
            }
        }

        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + maiorCrescimento);
    }
}
