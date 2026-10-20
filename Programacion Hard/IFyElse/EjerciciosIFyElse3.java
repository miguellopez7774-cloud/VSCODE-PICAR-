
import java.util.Scanner;

public class EjerciciosIFyElse3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un año:");

        if (entrada.hasNextInt()) {

            int año = entrada.nextInt();

            if (año % 400 == 0) {
                System.out.println("El año es bisiesto");

            } else if (año % 4 == 0) {
                System.out.println("El año es bisiesto");

            } else if (año % 100 == 0) {
                System.out.println("El año no es bisiesto");

            } else {
                System.out.println("El año no es bisiesto");

            }

        } else {
            System.out.println("Eso no es un año válido.");
        }

        entrada.close();
    }
}