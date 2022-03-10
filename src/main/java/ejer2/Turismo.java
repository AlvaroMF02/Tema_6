package ejer2;

/**
 *
 * @author alvaro
 */
public class Turismo extends Vehiculo{
    private int puerta;
    private boolean marchaAutomatica;

    public Turismo(int puerta, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.puerta = puerta;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    
}
