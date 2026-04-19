import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] tempos = new double[n];

        for (int i = 0; i < n; i++) {
            tempos[i] = sc.nextDouble();
        }

        double menor = tempos[0], maior = tempos[0];
        for (double t : tempos) {
            if (t < menor) menor = t;
            if (t > maior) maior = t;
        }

        double[] copia = Arrays.copyOf(tempos, n);
        Arrays.sort(copia);

        System.out.println("Melhor tempo: " + menor);
        System.out.println("Pior tempo: " + maior);
        System.out.println("Tres melhores tempos:");
        System.out.println(copia[0] + " " + copia[1] + " " + copia[2]);
    }
}
