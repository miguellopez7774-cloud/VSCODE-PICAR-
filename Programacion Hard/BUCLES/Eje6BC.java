import java.util.Scanner;

public class Eje6BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce numeros (0 para terminar):");
        int numero = entrada.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
            
            

            numero = entrada.nextInt();
        }

        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);

        if (negativos > 0) {
            System.out.println("Se ha introducido algun numero negativo");
        } else {
            System.out.println("No se ha introducido ningun numero negativo");
        }

        entrada.close();
    }
}