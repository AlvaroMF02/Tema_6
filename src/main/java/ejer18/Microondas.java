package ejer18;

/**
 *
 * @author Álvaro
 */
public class Microondas extends Electrodomestico implements Silencioso,Comparable<Microondas>{

    private Double potMax;

    public Microondas(double potMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potMax = potMax;
    }

    public double getPotMax() {
        return potMax;
    }

    public void setPotMax(double potMax) {
        this.potMax = potMax;
    }

    @Override
    public void silencio() {
        System.out.println("El microondas de consumo diesel emite 40dB");
    }

    @Override
    public String toString() {
        return super.toString()
                + "Microondas{" + "potMax=" + potMax + '}';
    }

    @Override
    public int compareTo(Microondas o) {
        return this.potMax.compareTo(potMax);
    }

}
