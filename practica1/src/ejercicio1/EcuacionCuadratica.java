package ejercicio1;

public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return this.b * this.b - 4 * this.a * this.c ;
    }
    public double getRaiz1(){
        return (double) (-this.b + Math.sqrt(getDiscriminante()))/(2*this.a);
    }
    public double getRaiz2(){
        return (double) ((-this.b-Math.sqrt(getDiscriminante()))/(2*this.a));
    }
    public static void mostrarRaices(EcuacionCuadratica ecu) {
    if (ecu.getDiscriminante() < 0) {
        System.out.println(" → La ecuación no tiene raíces reales");
    } else {
        if (ecu.getRaiz1() == ecu.getRaiz2()) {
            System.out.println(" → La ecuación tiene una raíz: " + ecu.getRaiz1());
        } else {
            System.out.println(" → La ecuación tiene dos raíces: " + ecu.getRaiz1() + " y " + ecu.getRaiz2());
        }
    }
    }
	  public static void main(String[] args) {
        EcuacionCuadratica ecu1=new EcuacionCuadratica(1.0, 3,1);
        EcuacionCuadratica ecu2=new EcuacionCuadratica(1, 2.0,1);
        EcuacionCuadratica ecu3=new EcuacionCuadratica(1, 2, 3);
        
		mostrarRaices(ecu1);
        mostrarRaices(ecu2);
        mostrarRaices(ecu3);
    }
}
