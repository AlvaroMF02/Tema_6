package ejer16;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Robot implements Comparable<Robot>{
    private int numSerie;
    private int vida;
    
    Random alea = new Random();

    public Robot() {
        this.numSerie = alea.nextInt(1001);
        this.vida = alea.nextInt(101);
    }
    

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Robot: " + "Numero de serie=" + numSerie + "\n \t Porcentaje de vida=" + vida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.numSerie;
        hash = 17 * hash + this.vida;
        hash = 17 * hash + Objects.hashCode(this.alea);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        if (this.numSerie != other.numSerie) {
            return false;
        }
        if (this.vida != other.vida) {
            return false;
        }
        return Objects.equals(this.alea, other.alea);
    }

    @Override
    public int compareTo(Robot t) {
        //return this.numSerie.compareTo(numSerie);           //con integer
        return Integer.compare(this.vida, t.vida);    //siendo int 
    }
    
    
}
 
