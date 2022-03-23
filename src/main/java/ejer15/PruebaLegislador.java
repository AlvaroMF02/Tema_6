package ejer15;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class PruebaLegislador {
    public static void main(String[] args) {
        
        ArrayList <Legislador> camara = new ArrayList<>();
        
        camara.add(new Diputado(3, "Jaén", "7w7", "Ramon", "Romero"));
        camara.add(new Diputado(5, "Granada", "UwU", "Jimeno", "Moreno"));
        camara.add(new Diputado(7, "Málaga", "TwT", "Mari", "Paz"));
        
        camara.add(new Senador(40, "Cádiz", "OwO", "Mari", "Jose"));
        camara.add(new Senador(52, "Almería", "miau", "Antonio", "Fernando"));
        camara.add(new Senador(165, "Cádiz", "wau", "Perico", "Palotes"));
        

        for (Legislador legislador : camara) {
            System.out.println(legislador.getCamara());
        }
        
        
    }
}
