package ejer12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */

/*linea 7 despues de version
<dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.8.1</version>
            <type>jar</type>
        </dependency>
    </dependencies>
*/
public abstract class Cuenta {
    
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    
    
    
    public Cuenta(String numeroCuenta, double saldo, Persona cliente) {
        this.numeroCuenta =RandomStringUtils.randomNumeric(20).toUpperCase();
        this.saldo = 0.0;
        this.cliente = cliente;
    }
    
    
    
    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double cant);
    
    public abstract void interes();
}
