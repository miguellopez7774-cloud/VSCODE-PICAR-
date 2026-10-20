import java.util.Scanner;

public class Eje1sw {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Utiliza una estructura switch-case para determinar el nombre del día de la semana a partir de un número del 1 al 7.
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido. Introduce un número del 1 al 7.");
        }
        entrada.close();
    }
}
