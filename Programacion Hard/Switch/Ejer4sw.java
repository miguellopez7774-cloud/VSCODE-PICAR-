import java.util.Scanner;

public class Ejer4sw {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("1= Saludar");
        System.out.println("2= Par o impar");
        System.out.println("3= Salir");
        int respuesta = entrada.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("Hola buenas, Soy miguel lopez");
                break;
            case 2:
                System.out.println("Dime un numero y te digo si es par o impar");
                int N = entrada.nextInt();
                if (N % 2 == 0) {
                    System.out.println("es par");
                }else {
                    System.out.println("es impar");
                }
                break;
            case 3:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        
        entrada.close();
    }
}