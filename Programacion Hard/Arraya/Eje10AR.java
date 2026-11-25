
import java.util.Scanner;

public class Eje10AR {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número de personas:");
        int N = entrada.nextInt();

        double[] Alturas = new double[N];

        for (int i = 0; i < Alturas.length; i++) {
            System.out.println("Introduce la altura:");
            Alturas[i] = entrada.nextDouble();
        }

        double suma = 0;
        double max = Alturas[0];
        double min = Alturas[0];

        for (int i = 0; i < Alturas.length; i++) {

            suma = suma + Alturas[i];

            if (Alturas[i] > max) {
                max = Alturas[i];
            }

            if (Alturas[i] < min) {
                min = Alturas[i];
            }
        }

        double media = suma / N;

        int encima = 0;
        int debajo = 0;

        for (int i = 0; i < Alturas.length; i++) {

            if (Alturas[i] > media) {
                encima++;
            }

            if (Alturas[i] < media) {
                debajo++;
            }
        }

        System.out.println("Altura media: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Personas por encima: " + encima);
        System.out.println("Personas por debajo: " + debajo);

        entrada.close();
    }
}
