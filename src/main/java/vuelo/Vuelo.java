package vuelo;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Vuelo {

    private String codVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double tiempVuelo;
    private ArrayList<Pasajero> pasajero=new ArrayList<>();

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, double tiempVuelo, Pasajero pasajero) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.tiempVuelo = tiempVuelo;
        this.pasajero.add(pasajero);
    }
    
    public Vuelo() {
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getTiempVuelo() {
        return tiempVuelo;
    }

    public void setTiempVuelo(double tiempVuelo) {
        this.tiempVuelo = tiempVuelo;
    }

    public ArrayList<Pasajero> getPasajero() {
        return pasajero;
    }

    public void setPasajero(ArrayList<Pasajero> pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "\nVuelo:" + " Codigo Vuelo= " + codVuelo + ", Ciudad Origen= " + ciudadOrigen + ", Ciudad Destino= " + ciudadDestino + ", Tiempo= " + tiempVuelo + " \n\tPasajero= " + pasajero;
    }
    
    
}
