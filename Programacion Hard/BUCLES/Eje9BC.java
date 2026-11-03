import java.util.Scanner;

public class Eje9BC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un numero para el tamaño");
        int lado = entrada.nextInt();Math.abs(lado);
        
        for (int i = 0; i <= lado; i++)
        {
            System.out.print("*".repeat(i));
            System.out.println();
        }

        entrada.close();
    }
}
