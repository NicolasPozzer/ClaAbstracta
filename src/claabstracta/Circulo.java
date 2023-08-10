
package claabstracta;

public class Circulo extends Figura{

    private double radio;

    public Circulo() {
    }
    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    //el valor de pi en programacion es 3.14
    //para calcular el area de un circulo es pi x radio al cuadrado
    /*Pero para hacer la funncion al cuadrado, se multiplica 2 veces
    el radio.*/
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
    
    
    
    
    
}
