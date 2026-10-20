import java.util.Scanner;

public class EjerciciosIFyElse2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Que nota has sacadoooo???");

        if (entrada.hasNextDouble()) {

            double N1 = entrada.nextDouble();

            if (N1 < 3) {

                System.out.println("Muy deficiente");

            } else {

                if (N1 < 5) {

                    System.out.println("Insuficiente");

                } else {

                    if (N1 < 6) {

                        System.out.println("Bien");

                    } else {

                        if (N1 < 9) {

                            System.out.println("Notable");

                        } else {

                            if (N1 <= 10) {

                                System.out.println("Sobresaliente");

                            }

                        }

                    }

                }

            }

        } else {

            System.out.println("Esto no es un numero");

        }

        entrada.close();
    }
}