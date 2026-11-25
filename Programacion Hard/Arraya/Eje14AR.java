
import java.util.Arrays;
import java.util.Scanner;

public class Eje14AR {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor inicial:");
        int V = entrada.nextInt();
        int TAM = 55;
        int[] Numeros = new int[TAM];
        int cont = 0;

        for (int i = 0; i <= 10; i++){
            
            for (int j = 0; j < i; j++) {
                Numeros[cont] = i;
                cont++;
            }
        }

       System.out.println(Arrays.toString(Numeros));

        entrada.close();
    }
}
