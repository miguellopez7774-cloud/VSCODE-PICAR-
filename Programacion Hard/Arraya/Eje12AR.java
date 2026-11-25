import java.util.Arrays;
import java.util.Scanner;

public class Eje12AR {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int TAM = 10;
        int [] NUM = new int[TAM];
        for (int i = 0; i < NUM.length; i++) {
            NUM [i] = (int) (Math.random() * 10);
        }
        char RES;
        do{
        System.out.println("a.Mostrar valores \nb.introducir valores \nc.Salir");
        RES = entrada.next().charAt(0);
        RES = Character.toLowerCase(RES);
        if (RES == 'a') {
            System.out.println(Arrays.toString(NUM));
        }
        if (RES == 'b') {
            System.out.println("Dame la V");
            int V = entrada.nextInt();
            System.out.println("Dame la P");
            int P = entrada.nextInt();
            NUM[P] = V;
        }
        
        } while (RES != 'c');
        entrada.close();
    }
}