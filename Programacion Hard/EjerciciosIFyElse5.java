import java.util.Scanner;

public class EjerciciosIFyElse5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.print("Introduce las horas: ");

        if (teclado.hasNextInt()) {
            horas = teclado.nextInt();

            System.out.print("Introduce los minutos: ");

            if (teclado.hasNextInt()) {
                minutos = teclado.nextInt();

                System.out.print("Introduce los segundos: ");

                if (teclado.hasNextInt()) {
                    segundos = teclado.nextInt();

                    segundos++;

                    if (segundos == 60) {

                        segundos = 0;

                        minutos++;

                        if (minutos == 60) {

                            minutos = 0;

                            horas++;

                            if (horas == 24) {
                                horas = 0;
                            }
                        }
                    }

                    System.out.println("La hora después de un segundo es: "

                            + horas + ":" + minutos + ":" + segundos);

                } else {

                    System.out.println("Los segundos deben ser un número.");

                }

            } else {

                System.out.println("Los minutos deben ser un número.");

            }

        } else {

            System.out.println("Las horas deben ser un número.");
            
        }

        teclado.close();
    }
}