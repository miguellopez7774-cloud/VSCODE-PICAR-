import java.util.Scanner;

public class Eje3BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("te calculo los pares del 1 al 200");
        double Numero = 200;
        double Cero = 1;
        for (Cero = 1; Cero <= Numero; Cero++) {
            if (Cero % 2 == 0) {
                System.out.println("Numero: " + Cero);
            }
            
        }
        

    }
}