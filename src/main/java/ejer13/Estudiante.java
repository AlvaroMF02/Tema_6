package ejer13;

/**
 *
 * @author Álvaro
 */
public class Estudiante extends Persona{
   
    private String idEstudiante;

    public Estudiante(String idEstudiante, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Estudiante{" + "idEstudiante=" + idEstudiante + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un estudiante");
    }
    
    
}
