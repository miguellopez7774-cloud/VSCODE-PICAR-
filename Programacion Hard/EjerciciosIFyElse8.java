import java.util.Scanner;

public class EjerciciosIFyElse8 {
    public static void main(String[] args) {   

        Scanner entrada = new Scanner(System.in);

        double Money = 0;
        double Impuesto1 = 25;
        double Impuesto2 = 45;
        System.out.println("Dime tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Buenas " + nombre + " Dime cuantas horas tienes trabajadas");
        double Horas = entrada.nextDouble();
        System.out.println("Perfecto tienes trabajas " + Horas + " Horas");
        double TarifaNormal = 12;
        
        if (Horas <= 35) {
            System.out.println("Dinero: " + (Horas * TarifaNormal));
        }if (Horas > 35) {
            Money = ((35 * TarifaNormal) + ((Horas - 35) * (TarifaNormal * 1.5)));
            System.out.println("Dinero: " + Money);
        }
        
        if (Money <= 500) {
            System.out.println("Estas libre de impuestos");
        } if (Money <= 900 ) {
            System.out.println("Tienes un impuesto del 25%: " + (((Money - 500) / Impuesto1) * 100));
        }
       
        entrada.close();
    }
}