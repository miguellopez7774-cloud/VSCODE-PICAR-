import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame tu primer numerin");
        if (entrada.hasNextDouble()) {
            double N1 = entrada.nextDouble();

            System.out.println("Dame tu segundo numerin");
            if (entrada.hasNextDouble()) {
                double N2 = entrada.nextDouble();

                double suma = N1 + N2;
                double Resta = N1 - N2;
                double Multiplicacion = N1 * N2;

                System.out.println("ESTA ES LA Suma:  " + suma);
                System.out.println("ESTA ES LA Resta:  " + Resta);
                System.out.println("ESTA ES LA Multiplicacion:  " + Multiplicacion);

                if (N2 != 0) {
                    double division = N1 / N2;
                    System.out.println("ESTA ES LA Division:  " + division);
                } else {
                    System.out.println("Division: Syntax ErRoR ;)");
                }

            } else {
                System.out.println("Eso no es un numero correcto jefe");
            }

        } else {
            System.out.println("Eso no es un numero correcto jefe");
        }

        entrada.close();
    }
}
