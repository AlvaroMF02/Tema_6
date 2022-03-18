package ejer7;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Prueba {
    public static void main(String[] args) {
        /*
        //objeto creado desde la superclase Trabajador
        Trabajador pepe = new Trabajador("Pepe", "Lopez", "22323D");
                
        //Objeto creado desde la subclase Camarero
        Camarero juan = new Camarero("Jefe Sala", "Juan", "Gil", "23412G");
    
    
        pepe.cotizar();
        
        System.out.println(juan.getRango());
        juan.servirMesa();
    
        //La clase camarero puede usar el metodo getNombre porque pertenece a la superclase
        System.out.println("El camarero se llama " + juan.getNombre());
        juan.cotizar();
        */
        
        ArrayList <Trabajador> trabajadores = new ArrayList<>();
        
        //creacion de dos camareros
        trabajadores.add(new Camarero("Perchero humano", "Benito", "Camela", "12345D"));    //converion implicitas
        trabajadores.add(new Camarero("Jefe sala", "Ana", "Boueles", "66810H"));
        
        //creacion de dos chefs
        trabajadores.add(new Chef("nula", "Albáro", "Ortíz", "8734L"));
        trabajadores.add(new Chef("altisima mi rey", "tua", "buela", "131313K"));
        
        
        for (Trabajador uwu : trabajadores) {
            System.out.println(":) "+uwu.cotizar());    //chef cotiza 90000
        }                                               //camarero cotiza 30000
        
        
        //casting con peligro 
        Camarero c = (Camarero) trabajadores.get(0);
        
        
        //casting bueno :) mas seguro de que sea camarero
        if(trabajadores.get(0) instanceof Camarero){
          ((Camarero) trabajadores.get(0)).servirMesa();
        }
    }
}
