import java.util.Scanner;

public class Eje5BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame el valor de A");
        int A = entrada.nextInt();

        System.out.println("Dame el valor de B");
        int B = entrada.nextInt();

        int resultado = 1;

        for (int i = 1; i <= B; i++) {
            resultado = resultado * A;
        }

        System.out.println(A + " elevado a " + B + " es " + resultado);

        entrada.close();
    }
}