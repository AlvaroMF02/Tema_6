package ejer18;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Prueba {
    public static void main(String[] args) {
        
        ArrayList<Silencioso> silencioso = new ArrayList<>();
        
        silencioso.add(new Frigorifico(50, 70, "pitbull"));
        silencioso.add(new Microondas(23, 67, "pepito"));
        //silencioso.add(new CampanaExtractora(12, 34, "si"));
        
        //no me deja crear CampanaExtractora basicamente porque esa clase no tiene implementada la interfaz Silencioso
    }
}
