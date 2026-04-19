import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            notas[i] = sc.nextDouble();
        }

        double maior = notas[0], menor = notas[0], soma = 0;
        int aprovados = 0;

        for (double nota : notas) {
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
            soma += nota;
            if (nota >= 7.0) aprovados++;
        }

        double media = soma / n;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);
    }
}
