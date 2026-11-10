import java.util.Scanner;

public class Eje3AR {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        final int TAMANO = 10;
        double[] numeros = new double[TAMANO];
        Scanner scanner = new Scanner(System.in);

        // Lectura de los 10 números reales
        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        entrada.close();
    }
}