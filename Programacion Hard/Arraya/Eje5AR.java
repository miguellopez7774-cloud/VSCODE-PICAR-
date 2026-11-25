
import java.util.Scanner;

public class Eje5AR {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[20];
        double suma = 0;
        double media;

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        
        for (int i = 0; i < 20; i++) {
            suma += numeros[i];
        }
        media = suma / 20;
        System.out.println("La media es: " + media);

        teclado.close();
    }
}
