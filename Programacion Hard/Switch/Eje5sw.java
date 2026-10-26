import java.util.Scanner;

public class Eje5sw {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("1= Sumar");
        System.out.println("2= Dividir");
        System.out.println("3= Potencia (tipo 1)");
        System.out.println("4= Potencia (tipo 2)");
        int respuesta = entrada.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("Dime dos números");
                int a = entrada.nextInt();
                int b = entrada.nextInt();
                System.out.println("El resultado es: " + (a + b));
                break;
            case 2:
                System.out.println("Dime dos números");
                int c = entrada.nextInt();
                int d = entrada.nextInt();
                if (d == 0) {
                    System.out.println("Error: división entre 0");
                } else {
                    System.out.println("El resultado es: " + (c / d));
                }
                break;
            case 3:
                System.out.println("Dime un número");
                int e = entrada.nextInt();
                System.out.println("El resultado es: " + Math.pow(e, e));
                break;
            case 4:
                System.out.println("Dime la base y el exponente");
                int f = entrada.nextInt();
                int g = entrada.nextInt();
                if (g > 0) {
                    System.out.println("El resultado es: " + Math.pow(f, g));
                } else if (g == 0) {
                    System.out.println("El resultado es: 1");
                } else {
                    System.out.println("El resultado es: " + (1 / Math.pow(f, -g)));
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        
        entrada.close();
    }
}