import java.util.Scanner;

public class AlmacenarNumeros {
    public static void main(String[] args) {
        final int TAMANO = 10;
        double[] numeros = new double[TAMANO];
        Scanner scanner = new Scanner(System.in);

        // Lectura de los 10 números reales
        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Muestra de los valores almacenados
        System.out.println("\nLos números introducidos son:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }

        scanner.close();
    }
}