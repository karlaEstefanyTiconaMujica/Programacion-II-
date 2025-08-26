package ejercicio1;
import java.util.*;
public class TestPromedioDesviacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números separados por espacio:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        PromedioDesviacion  est = new PromedioDesviacion (numeros);
        
        System.out.printf("El promedio es %.2f\n", est.getPromedio());
        System.out.printf("La desviación estándar es %.5f\n", est.getDesviacion());
    }
}