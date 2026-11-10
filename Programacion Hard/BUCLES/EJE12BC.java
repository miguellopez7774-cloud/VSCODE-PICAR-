import java.util.Scanner;

public class EJE12BC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int minimo = 1;
        int maximo = 100;
        int adivinar = 0;
        int respuesta = 0;

        System.out.println("Piensa un numero del 1 al 100.");

        while (respuesta != 3) {

            adivinar = (minimo + maximo) / 2;

            System.out.println("¿Tu numero es " + adivinar + "?");
            System.out.println("1 = Mi numero es menor");
            System.out.println("2 = Mi numero es mayor");
            System.out.println("3 = Has acertado");

            respuesta = entrada.nextInt();

            if (respuesta == 1) {
                maximo = adivinar - 1;
            } else if (respuesta == 2) {
                minimo = adivinar + 1;
            } else if (respuesta == 3) {
                System.out.println("¡He acertado!");
            } else {
                System.out.println("Respuesta incorrecta.");
            }

            if (minimo > maximo && respuesta != 3) {
                System.out.println("¡Te has equivocado con las pistas!");
                break;
            }
        }

        entrada.close();
    }
}