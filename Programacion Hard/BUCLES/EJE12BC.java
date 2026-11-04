import java.util.Scanner;

public class EJE12BC {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numerin del 1 al 100 y lo adivino");
        System.out.println("1 es que es mas bajo, 2 es que es mas alto y 3 es que es el numero");
        int N = entrada.nextInt();
        int adivinar = 0;
        if (N <= 100  && N >= 0) {
            while (N != adivinar) {
                System.out.println("tu numero es" + (N - 10));
            }
        }else {
            System.out.println("Es del 1 al 100 gracioso");
        }
        entrada.close();
    }
}