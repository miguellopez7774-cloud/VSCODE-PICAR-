import java.util.Scanner;

public class Eje3sw {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una letra");
        char Letra = entrada.nextLine().charAt(0);
        switch (Letra) {
            case 'a':
                System.out.println("Es una vocal");
                break;
            case 'e':
                System.out.println("Es una vocal");
                break;
            case 'i':
                System.out.println("Es una vocal");
                break;
            case 'o':
                System.out.println("Es una vocal");
                break;
            case 'u':
                System.out.println("Es una vocal");
                break;

            default:
                System.out.println("Es una consonante");
        }
        
        entrada.close();
    }
}