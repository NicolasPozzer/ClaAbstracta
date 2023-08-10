
package claabstracta;

public abstract class Figura {
    
    protected double x; //pos en x
    protected double y; //pos en y
    
    

    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    
    /*
    =========================================================
    ===Declarando un metodo abstracto, ya que un triangulo===
    ===no va a utilizar el mismo calculo que circulo=========
    ===uno calculo los lados y el otro el radio==============
    ===para eso se utilizan las clases abstractas============
    =========================================================
    */
    public abstract double calcularArea();
    
    
    
}
