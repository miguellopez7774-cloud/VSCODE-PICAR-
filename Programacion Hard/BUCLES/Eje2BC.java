import java.util.Scanner;

public class Eje2BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero y cuento hasta el");
        double Numero = entrada.nextDouble();
        double Cero = 0;
        for (Cero = 0; Cero <= Numero; Cero++) {
            System.out.println("Numero: " + Cero);
        }
        

    }
}