import java.util.Scanner;

public class Eje8AR {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double [100];
        int cont = 0;


        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (double) (Math.random() * 100);
        }
        System.out.println("Introduce un valor del 1 al 100");
        int R = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (R >= numeros[i]) {
                cont++;
                
            }
            
        }
        System.out.println("He encontrado " + cont + " Numeros mayores o iguales");
        entrada.close();
    }
}