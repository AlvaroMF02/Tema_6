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
    private ArrayList<Pasajero> pasajeros;

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, double tiempVuelo) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.tiempVuelo = tiempVuelo;
        this.pasajeros = new ArrayList<>();
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
        return pasajeros;
    }

    public void setPasajero(ArrayList<Pasajero> pasajero) {
        this.pasajeros = pasajero;
    }

    
    public void aniadirPasajero(Pasajero pasajero){
        if (pasajero != null){
            pasajeros.add(pasajero);
        }
    }
    
    
    
    @Override
    public String toString() {
        return "\nVuelo:" + " Codigo Vuelo= " + codVuelo + ", Ciudad Origen= " + ciudadOrigen + ", Ciudad Destino= " + ciudadDestino + ", Tiempo= " + tiempVuelo + " \n\tPasajero= " + pasajeros;
    }
    
    
}
