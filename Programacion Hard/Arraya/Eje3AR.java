import java.util.Arrays;
import java.util.Scanner;

public class Eje3AR {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        final int TAMANO = 10;
        double[] numeros = new double[TAMANO];

     
        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        
        double maximo = Integer.MIN_VALUE;
        double minimo = Integer.MAX_VALUE;

        
        for (int i = 0; i < TAMANO; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

      
        System.out.println("\nArray completo: " + Arrays.toString(numeros));
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        
        scanner.close();
    }
}