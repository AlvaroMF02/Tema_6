package ejer14;

/**
 *
 * @author Álvaro
 */
public class Frigorifico extends Electrodomestico implements Silencioso{

    private double capacidad;

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void silencio() {
        System.out.println(" El frigorífico de modelo 202122 emite 50dB");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Frigorifico{" + "capacidad=" + capacidad + '}';
    }
    
}
