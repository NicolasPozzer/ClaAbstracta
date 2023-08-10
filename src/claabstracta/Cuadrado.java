
package claabstracta;

public class Cuadrado extends Figura{

    private double lado;

    //Constructores
    public Cuadrado() {
    }
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
