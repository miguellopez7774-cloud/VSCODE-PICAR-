import java.util.Arrays;
import java.util.Scanner;

public class Eje11AR {
    public static void main(String[] args) {
        final int TAMANO = 100;
        double[] numeros = new double[TAMANO];
        double[] numeros1 = new double[TAMANO];
        Scanner scanner = new Scanner(System.in);

        
        // Lectura de los 10 números reales
        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros1 [i] = numeros [i];
        }
        System.out.println(Arrays.toString(numeros1));
        scanner.close();
    }
}