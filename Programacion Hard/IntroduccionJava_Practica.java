import java.io.Reader;
import java.util.Scanner;

/**
 * UT1.3 - Introducción a Java
 * Plantilla para realizar en clase con ayuda de los apuntes.
 *
 * Completa cada apartado siguiendo las indicaciones de los comentarios.
 */
public class IntroduccionJava_Practica {

    public static void main(String[] args) {

        // ================================================================
        // 1. PRIMER PROGRAMA Y SALIDA POR PANTALLA
        // ================================================================
        // TODO 1: Muestra por pantalla el texto "Hola, mundo!".
        System.out.println("Hola, mundo!");

        // TODO 2: Escribe aquí un comentario de una sola línea.
        // Este es un comentario de una sola línea.
        // TODO 3: Escribe aquí un comentario de varias líneas.
        /* Este es un comentario de varias líneas.
         * Puedes escribir varias líneas de texto
         * y se considerará parte del mismo comentario.
         */

        // ================================================================
        // 2. IDENTIFICADORES
        // ================================================================
        // TODO 4: Declara tres variables con identificadores correctos:
        //         - una edad
        int edad = 67;
        //         - un sueldo neto
        float Neto = 6769.0f;
        //         - una letra del DNI
        char DNI = 'A';
        //         Inicialízalas con valores de ejemplo y muéstralas por pantalla.
        System.out.println("-Edad:" + edad + "   -Salario Neto:" + Neto + "   -Letra DNI:" + DNI);

        // ================================================================
        // 3. TIPOS DE DATOS SIMPLES Y STRING
        // ================================================================
        // TODO 5: Declara e inicializa una variable de cada tipo:
        //         byte, short, int, long, float, double, char y boolean.
        byte MiDinero = 12;
        short salario = 1250;
        int Dados = 2;
        long Jornada = 40;
        float DeudaEEUU = 123200.67f;
        double N1 = 33;
        char Letrademinombre = 'M';
        boolean mbappe = true;

        
        //         Declara también un String.
        String miCadena = "Hola Alberto";
        //         Después muestra todos sus valores por pantalla.
        System.out.println("-Mi dinero: " + MiDinero + "\n-Salario: " + salario + "\n-Dados: " + Dados + "\n-Jornada en horas: " + Jornada +  
        "\n-Deuda de EEUU: " + DeudaEEUU + "\n-Numerin: " + N1 + "\n-Letra de mi nombre: " + Letrademinombre + "\n-Mbappe es malisimo: " + mbappe);

        // TODO 6: Crea un short con valor 32767, súmale 1 y muestra el resultado.
        //         Observa qué ocurre.
        short Eje6 = 32767;
        System.out.println("-Ejercicio 3.6: " + (Eje6 + 1));


        // ================================================================
        // 4. DECLARACIÓN, INICIALIZACIÓN Y ASIGNACIÓN
        // ================================================================
        // TODO 7: Declara una variable int sin inicializar y asígnale un valor después.
        //         Declara otra variable int inicializándola en la misma línea.
        //         Muestra ambas por pantalla.
        int SN;
        SN = 1;
        int ing = 1;
        System.out.println("-Suma de Variables: " + SN + ing);


        // TODO 8: Declara tres variables float en una sola línea e inicialízalas.
        float V1 = 2, V2 = 4, V3 = 6;

        // ================================================================
        // 5. ÁMBITO DE UNA VARIABLE
        // ================================================================
        // TODO 9: Declara una variable en main.
        //         Después crea un bloque { } y declara dentro otra variable.
        //         Comprueba cuáles pueden utilizarse dentro y fuera del bloque.
        int Fuera = 69;
        {
            int Dentro = 67;
            System.out.println("-Ejercico 5.9: " + Dentro + Fuera);
        }


        // ================================================================
        // 6. CONSTANTES CON final
        // ================================================================
        // TODO 10: Declara una constante llamada IVA con valor 0.21.
        //          Declara otra constante para la mayoría de edad.
        //          Muestra ambas por pantalla.
        final double IVA = 0.21;
        final int edadMIN = 18;
        System.out.println("-IVA: " + IVA + "\n-Edad Minima: " + edadMIN);
        // TODO 11: Intenta modificar una constante.
        //          Deja la línea comentada para que el programa pueda compilar
        //          y escribe al lado qué error provoca.
        
        //IVA = 0.22;

        //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        //The final local variable IVA cannot be assigned. It must be blank and not using a compound assignment

        // ================================================================
        // 7. OPERADORES ARITMÉTICOS
        // ================================================================
        // TODO 12: Crea dos enteros, por ejemplo 17 y 5.
        //          Muestra el resultado de +, -, *, / y %.
        int N17 = 17;
        int N5 = 5;
        System.out.println("-Suma: " + (N5 + N17) + "   -Resta: " + (N17 - N5) + "   -Multiplicacion: " + (N17 * N5) + "   -Division: " + (N17 / N5) + 
        "   -Resto de la division: " + (N17 % N5));

        // TODO 13: Prueba el operador unario - y los operadores ++ y --.
        //          Prueba al menos una vez la forma prefija y la postfija.
        System.out.println("EJERCICIO 7.13");
        int x = 1;
        x++;
        System.out.println(x);
        --x;
        System.out.println(x);
        // ================================================================
        // 8. OPERADORES RELACIONALES
        // ================================================================
        // TODO 14: Con dos variables numéricas muestra el resultado de:
        //          >, <, >=, <=, == y !=
        System.out.println("Ejercicio 8.14:");
        double y = 42;
        double y2 = 99;
        System.out.println("-Y: " + y + "  -Y2: " + y2);
        System.out.println("y>y2: " + (y > y2));
        System.out.println("y<y2: " + (y < y2));
        System.out.println("y=y2: " + (y == y2));
        System.out.println("y Es diferente y2: " + (y != y2));
        // ================================================================
        // 9. OPERADORES LÓGICOS
        // ================================================================
        // TODO 15: Declara dos booleanos, uno true y otro false.
        //          Prueba &&, || y !.
        //          Prueba también una expresión como: (10 > 5) && (3 < 8)
        System.out.println("Ejercicio 9.15");
        System.out.println((10 > 5) && (3 < 8));
        System.out.println((10 > 5) || (3 < 8));
        

        // ================================================================
        // 10. OPERADORES DE ASIGNACIÓN
        // ====================================================+============
        // TODO 16: Crea una variable entera y prueba sobre ella:
        //          +=, -=, *=, /= y %=
        //          Muestra el valor después de cada operación.
        System.out.println("Ejercicio 10.16");
        int Prueba1 = 28;
        int Prueba2 = 96;
        Prueba1 += Prueba2;
        System.out.println(Prueba1);
        Prueba1 -= Prueba2;
        System.out.println(Prueba1);
        Prueba1 *= Prueba2;
        System.out.println(Prueba1);
        Prueba1 /= Prueba2;
        System.out.println(Prueba1);
        Prueba1 %= Prueba2;
        System.out.println(Prueba1);
        // ================================================================
        // 11. EXPRESIONES Y PRECEDENCIA
        // ================================================================
        // TODO 17: Calcula y muestra el resultado de:
        //          7 + 5 * 4 - 2
        //          (7 + 5) * (4 - 2)
        //          Explica con un comentario por qué son diferentes.
        System.out.println("Ejercicio 11.17");
        System.out.println(7 + 5 * 4 - 2);
        System.out.println((7 + 5) * (4 - 2));
        //Nos diferentes por matematica basica, la de arriba primero hace el 5 x 4 y la de abajo primero hace los parentesis

        // ================================================================
        // 12. CLASE Math
        // ================================================================
        // TODO 18: Utiliza Math para calcular y mostrar:
        System.out.println("Ejercicio 12.18");
        
        //          - 3 elevado a 3
        double a = Math.pow(3, 3);
        //          - raíz cuadrada de 81
        double b = Math.sqrt(9);
        //          - valor absoluto de -25.5
        double c = Math.abs(-25.5);
        //          - Math.PI
        double d = Math.PI;
        //          - Math.E
        double e = Math.E;

        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        

        // ================================================================
        // 13. LITERALES
        // ================================================================
        // TODO 19: Crea ejemplos de literales:
        System.out.println("Ejercicio 13.19");
        //          - boolean
        boolean Activado = false;
        //          - entero decimal
        double decimal = 3.14;
        //          - entero octal
        int octal = 012;
        //          - entero hexadecimal
        int hexadecimal = 0x1A;
        //          - long usando L
        long largo = 1000000L;
        //          - double normal
        double normal = 3.14;
        //          - double en notación científica
        double cientifico = 3.14e10;
        //          - float usando F
        float flotante = 3.14F; 
        //          - char
        char letra = 'A';
        //          - String
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        System.out.println(hexadecimal);
        System.out.println(flotante);

        // TODO 20: Crea Strings que utilicen estas secuencias de escape:
        //          \n   \t   \\   \" 
        //          Muéstralos por pantalla.
        System.out.println("Ejercicio 13.20");
        String Alberto = "\ncacahuete";
        System.out.println(Alberto);
        Alberto = "\tcacahuete";
        System.out.println(Alberto);
        Alberto = "\\cacahuete";
        System.out.println(Alberto);
        Alberto = "\'cacahuete";
        System.out.println(Alberto);


        // TODO 21: Divide un String largo en dos líneas de código utilizando +.
        System.out.println("Ejercicio 13.21");

        String Anticonstitucionalísimamente = "Anticonstituciona\nlísimamente";
        System.out.println(Anticonstitucionalísimamente);
        // ================================================================
        // 14. SALIDA ESTÁNDAR
        // ================================================================
        // TODO 22: Prueba la diferencia entre System.out.print y System.out.println.
        System.out.println("Ejercicio 14.22");
        System.out.println(3);
        System.out.print(2);
        //Es un imprimir el print sin un salto de linea y se coloca al lado del nombre de la terminal
        // TODO 23: Muestra un mensaje utilizando System.err.println.
        System.out.println("Ejercicio 14.23");
        System.err.println("HOLAAAAA esto es el Errr");

        // ================================================================
        // 15. ENTRADA ESTÁNDAR CON Scanner
        // ================================================================
        Scanner entrada = new Scanner(System.in);

        // TODO 24: Pide al usuario su nombre y guárdalo en un String.
        System.out.println("Introduce tu nombre:");
        String nombre32 = entrada.nextLine();
        System.out.println("Holaaaa señor " + nombre32);


        // TODO 25: Pide al usuario su edad y guárdala en un int.
        System.out.println("Señor " + nombre32 + " que edad tiene usted?");
       int EDADUSER = entrada.nextInt();
       

        // TODO 26: Pide al usuario su altura y guárdala en un double.
        System.out.println("Deme su altura");
        double AlTURAUSER = entrada.nextDouble();

        // TODO 27: Muestra los tres datos introducidos.
        System.out.println("Esta es tu altura: " + AlTURAUSER + "  -Esta es tu edad: " + EDADUSER + "  -Entado señor " + nombre32);

        // ================================================================
        // 16. EJERCICIO FINAL: CÍRCULO
        // ================================================================
        // TODO 28: Pide por teclado el radio de un círculo.
        //          Calcula su área usando Math.PI y Math.pow.
        //          Calcula su circunferencia.
        //          Muestra ambos resultados.
        System.out.println("Ejercicio 16.28");
        System.out.println("Deme el radio del circulo");
        double radio = entrada.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + area + "  -La circunferencia del circulo es: " + circunferencia);
        entrada.close();
    }
}