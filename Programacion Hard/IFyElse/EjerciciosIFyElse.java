import java.util.Scanner;
public class EjerciciosIFyElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");


            
             System.out.println("Ejercicio 1");
             System.out.println("Dime tu primer numero");
             double N1 = entrada.nextDouble();
             System.out.println("Vale perfecto has elegido el " + N1 + " Ahora elige otro");
             double N2 = entrada.nextDouble();
             System.out.println("Vale perfecto ahora has elegido el " + N2 + " Ahora elige el ultimo para sacar el mayor");
             double N3 = entrada.nextDouble();
             System.out.println("Vale perfecto tus 3 numeros son: " + N1 + " " + N2 + " " + N3);
             if (N1>N2 && N1>N3) {
                 System.out.println("El Numero mas grande es el " + N1);
             }else {
             if (N2>N3) {
             System.out.println("El Numero mas grande es el " + N2);
             }else {
             System.out.println("El Numero mas grande es el " + N3);
             }
             }
        

        


        entrada.close();
    }


}