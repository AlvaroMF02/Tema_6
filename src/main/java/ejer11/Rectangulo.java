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
        double area=(this.base*this.altura);
        return area;
    }

    @Override
    public double calcularArea() {
        System.out.println("Se calcula el area del Rectangulo");
        double area=0;
        return area;
    }
    
    
    
}
