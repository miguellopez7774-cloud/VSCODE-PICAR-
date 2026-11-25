
import java.util.Scanner;

public class Eje6AR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, M;

        System.out.print("Introduce el valor de N: ");
        N = teclado.nextInt();

        System.out.print("Introduce el valor de M: ");
        M = teclado.nextInt();

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            numeros[i] = M;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(numeros[i]);
        }

        teclado.close();
    }
}
