import java.util.Scanner;

public class Eje2AR {
    public static void main(String[] args) {
        final int TAMANO = 10;
        double[] numeros = new double[TAMANO];
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double OP1 = 0;
        // Lectura de los 10 números reales
        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            OP1 = suma += numeros[i];
            
        }
        System.out.println(OP1);

       

        scanner.close();
    }
}