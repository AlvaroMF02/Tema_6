package ejer7;

/**
 *
 * @author Álvaro
 */
public class Camarero extends Trabajador{
    private String rango;       //esto debe ser protected??

    
    
    public Camarero(String rango, String nombre, String apellido1, String nif) {
        super(nombre, apellido1, nif);
        this.rango = rango;
    }

    
    
    
    public void servirMesa(){
        System.out.println("Camarero sirviendo una mesa");
    }
    
    
    
    
    public int cotizar(){
        int cotiza=30000;
        return cotiza;
    }

    
    
    
    
    
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
    
}
