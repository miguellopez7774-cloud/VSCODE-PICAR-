import java.util.Scanner;

public class EjerciciosIFyElse4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número:");

        if (entrada.hasNextDouble()) {

            double N1 = entrada.nextDouble();

            System.out.println("Introduce el segundo número:");

            if (entrada.hasNextDouble()) {

                double N2 = entrada.nextDouble();

                System.out.println("Introduce el tercer número:");

                if (entrada.hasNextDouble()) {

                    double N3 = entrada.nextDouble();

                    
                    if (N1 <= N2 && N2 <= N3) {

                        System.out.println(N1 + " " + N2 + " " + N3);

                    } else if (N1 <= N3 && N3 <= N2) {

                        System.out.println(N1 + " " + N3 + " " + N2);

                    } else if (N2 <= N1 && N1 <= N3) {

                        System.out.println(N2 + " " + N1 + " " + N3);

                    } else if (N2 <= N3 && N3 <= N1) {

                        System.out.println(N2 + " " + N3 + " " + N1);

                    } else if (N3 <= N1 && N1 <= N2) {

                        System.out.println(N3 + " " + N1 + " " + N2);

                    } else {

                        System.out.println(N3 + " " + N2 + " " + N1);

                    }

                } else {

                    System.out.println("El tercero no es un numero");

                }

            } else {

                System.out.println("El segundo no es un numero");

            }

        } else {

            System.out.println("El primero no es un numero");

        }

        entrada.close();
    }
}