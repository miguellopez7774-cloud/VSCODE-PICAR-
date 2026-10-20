
import java.util.Scanner;

public class EjerciciosIFyElse8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Dime las horas trabajadas:");
        double horas = entrada.nextDouble();

        double bruto;
        double impuesto25 = 0;
        double impuesto45 = 0;
        double impuesto;

        if (horas <= 35) {
            bruto = horas * 12;
        } else {
            bruto = 35 * 12 + (horas - 35) * 18;
        }

        if (bruto <= 500) {
            impuesto25 = 0;
            impuesto45 = 0;
        } else if (bruto <= 900) {
            impuesto25 = (bruto - 500) * 25 / 100;
            impuesto45 = 0;
        } else {
            impuesto25 = 400 * 25 / 100;
            impuesto45 = (bruto - 900) * 45 / 100;
        }

        impuesto = impuesto25 + impuesto45;

        System.out.println("Empleado: " + nombre);

        System.out.println("Salario bruto: " + bruto + " euros");

        System.out.println("Impuesto del 25%: " + impuesto25 + " euros");

        System.out.println("Impuesto del 45%: " + impuesto45 + " euros");

        System.out.println("Total de impuestos: " + impuesto + " euros");
        
        System.out.println("Salario neto: " + (bruto - impuesto) + " euros");

        entrada.close();
    }
}

