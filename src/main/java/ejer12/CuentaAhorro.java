package ejer12;

/**
 *
 * @author no Álvaro
 */
public class CuentaAhorro extends Cuenta {
    private double interes;
    private double comisionAnual;

    

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super();
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }
    public CuentaAhorro() {
            super();
        }
    
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void retirar(double dinero) {
        if ((getSaldo() - dinero) > 0 && getSaldo() > 0) {
            setSaldo(getSaldo() - dinero);

        }
    }

    @Override
    public void actualizarSaldo() {
        setSaldo((getSaldo() + (getSaldo() * interes)) - comisionAnual);

    }
}
