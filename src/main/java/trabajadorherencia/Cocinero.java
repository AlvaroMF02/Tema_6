package trabajadorherencia;

/**
 *
 * @author alvaro
 */
public class Cocinero extends Trabajador{
    protected String partida;

    public Cocinero(String partida, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.partida = partida;
    }
    
    

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Cocinero{" + "partida=" + partida + '}';
    }
    
    
    @Override   
    public void cotizar(){
        System.out.println("Cotizando como un trabajador");
    }
    
    
    public void prepararPlato(String plato){
        System.out.println("Cocinero preparando el plato "+ plato);
    }
    
}
