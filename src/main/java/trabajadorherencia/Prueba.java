package trabajadorherencia;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        Camarero c1 = new Camarero("jefe de seccion", "Manuel", "Fernandez", "123456J");
        
        
        
        System.out.println(c1);
        
        
        Cocinero co1= new Cocinero("Postres", "Luisa", "Perez", "19374623h");
        Trabajador t1= new Trabajador("Paco", "Chocolatero", "2946852h");
        
        
        System.out.println(co1);
        System.out.println(t1);
        
        co1.cotizar();
        c1.cotizar();
        t1.cotizar();
        
        
        ArrayList <Trabajador>  listaTrabajadores = new ArrayList<>();
        listaTrabajadores.add(t1);
        listaTrabajadores.add(co1);
        listaTrabajadores.add(c1);
        
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t);
            t.cotizar();
            
            //si t es una instancia de Camarero
            if (t instanceof Camarero){
                Camarero aux =(Camarero)t; //Converion explicita
                aux.servirMesa("4");
                
            }
            
            
            if (t instanceof Cocinero){
               ((Cocinero) t).prepararPlato("papas");
            }
            
        }
    }
}
