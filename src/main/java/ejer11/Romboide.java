package ejer11;

/**
 *
 * @author alvaro
 */
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    public Romboide() {
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
    
//    public void calcularArea(double base, double altura){
//        double area=(base*altura);
//         System.out.println("El area del romboide es " + area);
//     }
    
    
}
