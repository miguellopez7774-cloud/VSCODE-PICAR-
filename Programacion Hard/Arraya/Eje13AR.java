
import java.util.Scanner;

public class Eje13AR {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor inicial:");
        int V = entrada.nextInt();

        System.out.println("Introduce el incremento:");
        int I = entrada.nextInt();

        System.out.println("Introduce el número de valores:");
        int N = entrada.nextInt();

        int[] Numeros = new int[N];

        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = V + (i * I);
        }

        for (int i = 0; i < Numeros.length; i++) {
            System.out.println(Numeros[i]);
        }

        entrada.close();
    }
}
