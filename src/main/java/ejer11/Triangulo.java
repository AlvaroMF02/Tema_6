package ejer11;

/**
 *
 * @author alvaro
 */
public class Triangulo extends Figura {

    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo() {
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
    
    
    public double calcularArea(){
        return 0;
    }
    
    public double calcularArea(double base, double altura){
        double area=(this.base*this.altura)/2;
        return area;
    }

    
}
