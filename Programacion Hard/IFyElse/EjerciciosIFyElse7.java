import java.util.Scanner;

public class EjerciciosIFyElse7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu año de nacimiento");
        double Año = entrada.nextDouble();
        System.out.println("Dime tu dia de nacimiento");
        double Dia = entrada.nextDouble();
        System.out.println("Dime tu mes de nacimiento");
        System.out.println("Entonces tienes: " + (Año - 2026) );
        entrada.close();
    }
}