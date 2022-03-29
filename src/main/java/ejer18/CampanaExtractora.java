package ejer18;

/**
 *
 * @author Álvaro
 */
public class CampanaExtractora extends Electrodomestico{
    
    private double dB;

    public CampanaExtractora(double dB, double consumo, String modelo) {
        super(consumo, modelo);
        this.dB = dB;
        if (dB<50) {
            System.out.println("Debe ser superior a 50dB");
        }
    }

    public double getdB() {
        return dB;
    }

    public void setdB(double dB) {
        this.dB = dB;
        if (dB<50) {
            System.out.println("Debe ser superior a 50dB");
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "CampanaExtractora{" + "dB=" + dB + '}';
    }
    
}
