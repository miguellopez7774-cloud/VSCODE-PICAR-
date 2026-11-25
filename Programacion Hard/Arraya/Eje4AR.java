import java.util.Scanner;

public class Eje4AR {
    public static void main(String[] args) {

        final int TAMANO = 20;
        int[] numeros = new int[TAMANO];
        Scanner scanner = new Scanner(System.in);
        
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Por favor, introduce " + TAMANO + " números enteros:");

        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Clasificamos y sumamos por separado
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
            // Si es 0, no afecta a ninguna de las dos sumas
        }

        System.out.println("\nResultados ");
        System.out.println("Suma de los positivos: " + sumaPositivos);
        System.out.println("Suma de los negativos: " + sumaNegativos);

        scanner.close();
    }
}