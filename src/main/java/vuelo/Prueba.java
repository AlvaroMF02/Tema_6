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

        Vuelo vuelo1 = new Vuelo("85937", "Cancún", "Corea", 5);
        Vuelo vuelo2 = new Vuelo("94363", "China", "España", 9);

        listaPasajeros.add(new Pasajero("Pedro", "Carmona", "823746K"));
        listaPasajeros.add(new Pasajero("Adrian", "Laras", "93487I"));
        listaPasajeros.add(new Pasajero("Álvaro", "Alguacil", "234234G"));
        listaPasajeros.add(new Pasajero("Angel", "Sanchez", "239746L"));
        listaPasajeros.add(new Pasajero("Cinthya", "Navarro", "208342L"));
        listaPasajeros.add(new Pasajero("Lara", "Perez", "234986F"));
        listaPasajeros.add(new Pasajero("Alba", "Lopez", "238764D"));
        listaPasajeros.add(new Pasajero("Paco", "Me", "273849P"));

        vuelo1.aniadirPasajero(listaPasajeros.get(0));
        vuelo1.aniadirPasajero(listaPasajeros.get(1));
        vuelo1.aniadirPasajero(listaPasajeros.get(2));
        vuelo1.aniadirPasajero(listaPasajeros.get(3));

        vuelo2.aniadirPasajero(listaPasajeros.get(4));
        vuelo2.aniadirPasajero(listaPasajeros.get(5));
        vuelo2.aniadirPasajero(listaPasajeros.get(6));

        ArrayList<Vuelo> listaVuelo = new ArrayList<>();
        listaVuelo.add(vuelo1);
        listaVuelo.add(vuelo2);

        System.out.println(pasajerosVuelo(listaVuelo));
        System.out.println(vuelosPasajeros(listaVuelo));
        System.out.println(vuelosPasajerosOrden(listaVuelo));

    }

    //muesta los pasajeros que van a cada ciudad
    public static Map<String, Integer> vuelosPasajeros(ArrayList<Vuelo> listaVuelo) {
        Map<String, Integer> mapAuxListaVuelo = new HashMap<>();

        for (Vuelo v : listaVuelo) {
            mapAuxListaVuelo.put(v.getCiudadDestino(), v.getPasajero().size());
        }

        return mapAuxListaVuelo;
    }

    //ciudades ordenadas alfabeticamente
    public static Map<String, Integer> vuelosPasajerosOrden(ArrayList<Vuelo> listaVuelo) {
        Map<String, Integer> mapAuxListaVuelo = new TreeMap<>();

        for (Vuelo v : listaVuelo) {
            mapAuxListaVuelo.put(v.getCiudadDestino(), v.getPasajero().size());
        }

        return mapAuxListaVuelo;
    }

    //muestra los pasajeros que hay mediante el codigo de vuelo
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
