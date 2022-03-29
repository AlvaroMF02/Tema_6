package ejer13;

/**
 *
 * @author Álvaro
 */
public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Profesor{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }
    
    
}
