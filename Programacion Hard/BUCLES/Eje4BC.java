import java.util.Scanner;

public class Eje4BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un numerin");
        int N = entrada.nextInt();

        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + N + " es " + factorial);

        entrada.close();
    }
}
