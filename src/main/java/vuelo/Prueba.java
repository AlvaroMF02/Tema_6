package vuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Álvaro
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Pasajero> listaPasajeros = new ArrayList<>();
        
        //creamos vuelos
        Vuelo vuelo1 = new Vuelo("85937", "Cancún", "Corea", 5);
        Vuelo vuelo2 = new Vuelo("94363", "China", "España", 9);
        Vuelo vuelo3 = new Vuelo("52632", "Chile", "Argentina", 2);
        
        //todos los pasajeros
        listaPasajeros.add(new Pasajero("Pedro", "Carmona", "823746K"));
        listaPasajeros.add(new Pasajero("Adrián", "Laras", "93487I"));
        listaPasajeros.add(new Pasajero("Álvaro", "Alguacil", "234234G"));
        listaPasajeros.add(new Pasajero("Ángel", "Sanchez", "239746L"));
        listaPasajeros.add(new Pasajero("Cinthya", "Navarro", "208342L"));
        listaPasajeros.add(new Pasajero("Lara", "Perez", "234986F"));
        listaPasajeros.add(new Pasajero("Alba", "Lopez", "238764D"));
        listaPasajeros.add(new Pasajero("Paco", "Me", "273849P"));
        listaPasajeros.add(new Pasajero("Ana", "Coronado", "478945J"));
        listaPasajeros.add(new Pasajero("Roberto", "Manzaneda", "123678O"));
        listaPasajeros.add(new Pasajero("Javier", "Flores", "745639D"));

        //pasajeros del vuelo1
        vuelo1.aniadirPasajero(listaPasajeros.get(0));
        vuelo1.aniadirPasajero(listaPasajeros.get(1));
        vuelo1.aniadirPasajero(listaPasajeros.get(2));
        vuelo1.aniadirPasajero(listaPasajeros.get(3));
        
        //pasajeros del vuelo2
        vuelo2.aniadirPasajero(listaPasajeros.get(4));
        vuelo2.aniadirPasajero(listaPasajeros.get(5));
        vuelo2.aniadirPasajero(listaPasajeros.get(6));
        
        //pasajeros del vuelo3
        vuelo3.aniadirPasajero(listaPasajeros.get(7));
        vuelo3.aniadirPasajero(listaPasajeros.get(8));
        vuelo3.aniadirPasajero(listaPasajeros.get(9));
        vuelo3.aniadirPasajero(listaPasajeros.get(10));
        
        //creamos una lista con los vuelos
        ArrayList<Vuelo> listaVuelo = new ArrayList<>();
        listaVuelo.add(vuelo1);
        listaVuelo.add(vuelo2);
        listaVuelo.add(vuelo3);

        
        System.out.println(vuelosPasajeros(listaVuelo));
        System.out.println(vuelosPasajerosOrden(listaVuelo));
//        System.out.println(vuelosPasajerosOrden(listaVuelo));

    }

    //muestra el numero de pasajeros que van a cada ciudad
    public static Map<String, Integer> vuelosPasajeros(ArrayList<Vuelo> listaVuelo) {
        Map<String, Integer> pasajerosVuelo = new HashMap<>();
        for (Vuelo vuelo : listaVuelo) {

            if (pasajerosVuelo.containsKey(vuelo.getCiudadDestino())) {
                pasajerosVuelo.put(vuelo.getCiudadDestino(), pasajerosVuelo.get(vuelo.getCiudadDestino()) + vuelo.getPasajero().size());
            } else {
                pasajerosVuelo.put(vuelo.getCiudadDestino(), vuelo.getPasajero().size());
            }
        }
        return pasajerosVuelo;
    }

    //ciudades ordenadas alfabeticamente
    public static Map<String, Integer> vuelosPasajerosOrden(ArrayList<Vuelo> listaVuelo) {
        Map<String, Integer> mapAuxListaVuelo = new TreeMap<>();

        for (Vuelo v : listaVuelo) {
            mapAuxListaVuelo.put(v.getCiudadDestino(), v.getPasajero().size());
        }

        return mapAuxListaVuelo;
    }

    //muestra los pasajeros que hay mediante el codigo de vuelo ORDENADO
    public static Map<String, Integer> pasajerosVuelo(ArrayList<Vuelo> listaVuelo) {

        Map<String, Integer> pasajerosVuelo = new TreeMap<>();

        for (Vuelo vuelo : listaVuelo) {

            if (pasajerosVuelo.containsKey(vuelo.getCiudadDestino())) {
                pasajerosVuelo.put(vuelo.getCiudadDestino(), pasajerosVuelo.get(vuelo.getCiudadDestino()) + vuelo.getPasajero().size());
            } else {
                pasajerosVuelo.put(vuelo.getCiudadDestino(), vuelo.getPasajero().size());
            }
        }

        return pasajerosVuelo;
    }

}
