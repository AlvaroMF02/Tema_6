package vuelo;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Álvaro
 */
public class Prueba {
    public static void main(String[] args) {
       SortedMap<String ,Vuelo> listaVuelo = new TreeMap<>();
        
        //Distintos vuelos con pasajero
        //Los primeros String despues del put son las "claves primarias"
        listaVuelo.put(("92038"),new Vuelo("92038", "Brasil", "España", 8,new Pasajero("Pedro", "Carmona", "823746K")));
        listaVuelo.put(("83726"),new Vuelo("83726", "Portugal", "Italia", 4,new Pasajero("Adrian", "Laras", "93487I")));
        listaVuelo.put(("12239"),new Vuelo("12239", "China", "Perú", 5,new Pasajero("Álvaro", "Alguacil", "234234G")));
        listaVuelo.put(("12837"),new Vuelo("12837", "Francia", "Japón", 8,new Pasajero("Angel", "Sanchez", "239746L")));
        listaVuelo.put(("34969"),new Vuelo("34969", "Chile", "Inglaterra", 9,new Pasajero("Cinthya", "Navarro", "208342L")));
        listaVuelo.put(("67853"),new Vuelo("67853", "Argentina", "Suecia", 10,new Pasajero("Lara", "Perez", "234986F")));
        listaVuelo.put(("59283"),new Vuelo("59283", "USA", "Canada", 1,new Pasajero("Alba", "Lopez", "238764D")));
        
        //recorrer el MAP
        for (String codigo : listaVuelo.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n", codigo, listaVuelo.get(codigo));
        }
        
    }
    
    
    
}
