import java.util.Scanner;
public class EjerciciosIFyElse1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


            
            System.out.println("Ejercicio 2");
            System.out.println("Dime una letra y te digo si es vocal: ");
            String L1 = entrada.nextLine().toLowerCase();

            if (L1.equals("a") || L1.equals("e") || L1.equals("i") || L1.equals("o") || L1.equals("u")) {
            System.out.println("Es una vocal");
            } else {
                System.out.println("Eso no es una vocal compañero");
            }
        
        

        entrada.close();
    }


}
