import java.util.Scanner;

public class Eje6sw {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //hay que calcular el DNI para poder saber la letra haz un switch con diferentes casos para poner la letra que es segun el numero
        System.out.println("Introduce los numeros de tu DNI y te digo yo la letra");
        String dni = entrada.nextLine();
        int numDni = Integer.parseInt(dni);
        int resto = numDni % 23;
        String letra;

        switch (resto) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
            default:
				letra = "Gatdammit";
				break;

        }

        System.out.println("La letra de tu DNI es: " + letra);

        entrada.close();
    }
}