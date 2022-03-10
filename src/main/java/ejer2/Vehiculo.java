package ejer2;

/**
 *
 * @author alvaro
 */
public class Vehiculo {
    private Long bastidor;
    private String matricula; 
    private String marca; 
    private String modelo; 
    private String color; 
    private double tarifa; 
    private boolean disponible;
    
    // se suponen creados los métodos ‘get’ y ‘set’ de la clase

    public Vehiculo(Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
       this.bastidor = bastidor;
    this.matricula = matricula;
    this.marca = marca; 
    this.modelo = modelo; 
    this.color = color; 
    this.tarifa = tarifa;
    this.disponible = false;

    }

    public void setBastidor(Long bastidor) {
        this.bastidor = bastidor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    

}
