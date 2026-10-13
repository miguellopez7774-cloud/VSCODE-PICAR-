import java.util.Scanner;

public class EjerciciosIFyElse6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Sumar");
        System.out.println("2. Dividir");
        System.out.println("3. Potencia tipo 1");
        System.out.println("4. Potencia tipo 2");
        System.out.print("Elige una opcion del 1 al 4: ");

        if (entrada.hasNextInt()) {
            int opcion = entrada.nextInt();

            if (opcion == 1) {

                System.out.print("Dame el primer numero: ");
                double N1 = entrada.nextDouble();

                System.out.print("Dame el segundo numero: ");
                double N2 = entrada.nextDouble();

                double suma = N1 + N2;

                System.out.println("El resultado de la suma es: " + suma);

            } else 
                if (opcion == 2) {

                System.out.print("Dame el dividendo: ");
                double N1 = entrada.nextDouble();

                System.out.print("Dame el divisor: ");
                double N2 = entrada.nextDouble();

                if (N2 != 0) {
                    double division = N1 / N2;
                    System.out.println("El resultado de la division es: " + division);
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }

            } else 
                if (opcion == 3) {

                System.out.print("Dame un numero: ");
                double N1 = entrada.nextDouble();

                double potencia = Math.pow(N1, N1);

                System.out.println("La potencia tipo 1 es: " + potencia);

            } else 
                if (opcion == 4) {

                System.out.print("Dame la base: ");
                double base = entrada.nextDouble();

                System.out.print("Dame el exponente: ");
                double exponente = entrada.nextDouble();

                if (exponente > 0) {
                    double potencia = Math.pow(base, exponente);
                    System.out.println("El resultado de la potencia es: " + potencia);

                } else 
                    if (exponente == 0) {
                    System.out.println("El resultado de la potencia es: 1");

                } else {
                    double potencia = 1 / Math.pow(base, -exponente);
                    System.out.println("El resultado de la potencia es: " + potencia);
                }

            } else {
                System.out.println("Error: debes elegir una opcion del 1 al 4.");
            }

        } else {
            System.out.println("Error: debes introducir un numero entero.");
        }

        entrada.close();
    }
}