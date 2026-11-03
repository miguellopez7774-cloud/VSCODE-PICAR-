import java.util.Scanner;

public class Eje8BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame el tamaño del lado");
        int lado = entrada.nextInt();

        for (int altura = 1; altura <= lado; altura++) {
            for (int ancho = 1; ancho <= lado; ancho++) {

                if (altura == 1 || altura == lado || ancho == 1 || ancho == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        entrada.close();
    }
}
