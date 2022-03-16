package ejer11;

/**
 *
 * @author alvaro
 */
public class Rectangulo extends Figura {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public Rectangulo() {
    }

    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public double calcularArea(double base, double altura){
        double area=(base*altura);
        return area;
    }
    
}
