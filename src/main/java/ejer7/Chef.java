package ejer7;

/**
 *
 * @author Álvaro
 */
public class Chef extends Trabajador {
    private String experiencia;

    
    
    public Chef(String experiencia, String nombre, String apellido1, String nif) {
        super(nombre, apellido1, nif);
        this.experiencia = experiencia;
    }
    
    
    public void prepararPlato(){
        System.out.println("El chef esta preparando tu plato bb");
    }
    
    
    
    //si no pones el metodo te da fallo
    public int cotizar(){
        int cotiza=90000;
        return cotiza;
    }
    
}
