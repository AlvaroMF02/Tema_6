package ejer18;

/**
 *
 * @author Álvaro
 */
public class Frigorifico extends Electrodomestico implements Silencioso, Comparable<Frigorifico>{

    private Double capacidad;

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

    @Override
    public int compareTo(Frigorifico o) {
        return this.capacidad.compareTo(capacidad);
    }
    
}
