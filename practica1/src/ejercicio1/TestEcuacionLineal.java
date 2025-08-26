package ejercicio1;

public class TestEcuacionLineal {

    public static void main(String[] args) {
        // Ejemplo 1: tiene solución
        EcuacionLineal ecuacion1 = new EcuacionLineal(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);

        if (ecuacion1.tieneSolucion()) {
            System.out.println("Ejemplo 1 → x = " + ecuacion1.getX() + ", y = " + ecuacion1.getY());
        } else {
            System.out.println("Ejemplo 1 → La ecuación no tiene solución.");
        }

        // Ejemplo 2: no tiene solución
        EcuacionLineal ecuacion2 = new EcuacionLineal(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);

        if (ecuacion2.tieneSolucion()) {
            System.out.println("Ejemplo 2 → x = " + ecuacion2.getX() + ", y = " + ecuacion2.getY());
        } else {
            System.out.println("Ejemplo 2 → La ecuación no tiene solución.");
        }
    }
}
