import java.util.Scanner;

public class Eje11BC {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es primo, 0 para terminar");
        int numero = entrada.nextInt();Math.abs(numero);
        while (numero != 0) {

            if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0) {
                System.out.println("No es primo");
            } else {
                System.out.println("Es primo");
            }
            
            

            numero = entrada.nextInt();
        }        
        
        entrada.close();
    }
}