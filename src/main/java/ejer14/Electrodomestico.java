package ejer14;

/**
 *
 * @author Álvaro
 */
public abstract class Electrodomestico{

    private double consumo;
    private String modelo;

    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }
}
