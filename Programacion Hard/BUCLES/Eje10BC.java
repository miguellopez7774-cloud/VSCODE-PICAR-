public class Eje10BC {
    public static void main(String[] args) {
        System.out.println("te voy a decir los primeros numeros de fibonacci");
        long N = 0;
        long F = 1;
        int contador = 0;
        while (contador < 51) {
            System.out.println(N);
            long temp = N + F;
            N = F;
            F = temp;
            contador++;
        }
    }   
}