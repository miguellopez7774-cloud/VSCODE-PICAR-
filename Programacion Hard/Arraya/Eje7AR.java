import java.util.Scanner;

public class Eje7AR {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce 2 valores enteros");

        int P = entrada.nextInt();
        int Q = entrada.nextInt();
        int[] Numeros = new int[Q - P +1];  

        for (int i = 0; i < Numeros.length; i++) {
        Numeros[i] = P + i;
        }
        for (int i = 0; i < Numeros.length;i++){
            System.out.println("Estos son los numeros: " + Numeros[i]);
        }
        entrada.close();
    }
}