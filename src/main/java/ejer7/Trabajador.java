package ejer7;

/**
 *
 * @author Álvaro
 */
public abstract class Trabajador {
    private String nombre;
    private String apellido1;
    private String nif;

    
    
    public Trabajador(String nombre, String apellido1, String nif) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.nif = nif;
    }
    public Trabajador() {
    }
    
    

    public abstract int cotizar();

    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    
    
    
}
