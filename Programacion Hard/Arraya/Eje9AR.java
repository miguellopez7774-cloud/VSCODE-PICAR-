import java.util.Scanner;

public class Eje9AR {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int [100];


        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random() * 10);
        }

        System.out.println("Introduce un valor del 1 al 10");
        int N = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (N == numeros[i]) {
                System.out.println("Estos son los arrays donde se encontro tu numero: " + i);
                
            }
            
        }
        
        entrada.close();
    }
}