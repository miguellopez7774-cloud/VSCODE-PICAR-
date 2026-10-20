import java.util.Scanner;

public class EjerciciosIFyElse7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int añoActual = 2026;
        int mesActual = 10; // Octubre
        int diaActual = 13;

        System.out.print("Dime tu año de nacimiento: ");
        int añoNacimiento = entrada.nextInt();
        
        System.out.print("Dime tu mes de nacimiento (en número): ");
        int mesNacimiento = entrada.nextInt();
        
        System.out.print("Dime tu día de nacimiento: ");
        int diaNacimiento = entrada.nextInt();

        int edad = añoActual - añoNacimiento;

        if (mesActual < mesNacimiento) {
            edad--; // Restamos un año
        } else 
            if (mesActual == mesNacimiento) {
            if (diaActual < diaNacimiento) {
                edad--; // Restamos un año
            }
        }

        System.out.println("Entonces tu edad exacta es: " + edad + " años.");
        
        entrada.close();
    }
}