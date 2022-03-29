package ejer13;

import java.util.ArrayList;

/**
 *
 * @author Álvaro
 */
public class Prueba {

    public static void main(String[] args) {

        ArrayList<Persona> persona = new ArrayList<>();

        persona.add(new Profesor("Mates", "Jose", "Antonio", "476523T", new Direccion("Flores", "Madrid", 23343, "España")));
        persona.add(new Profesor("Lengua", "Lourdes", "Garrido", "346723P", new Direccion("Huelva", "Ubeda", 84745, "España")));
        persona.add(new Profesor("Musica", "Chema", "Ortiz", "294736L", new Direccion("Marin", "Moyet", 84652, "España")));

        persona.add(new Estudiante("p1", "Ramon", "Perez", "2398476E", new Direccion("direc.", "ciudad", 29378, "España")));
        persona.add(new Estudiante("a4", "Cinthya", "Navarro", "287364L", new Direccion("direc.", "ciudad", 29378, "España")));
        persona.add(new Estudiante("m5", "Irene", "Jimenez", "293846V", new Direccion("direc.", "ciudad", 29378, "España")));

        //Recorrer el array
        for (Persona p : persona) {
            System.out.println(p);
        }
        //Utiliozar el metodo de la interfaz
        for (Persona p : persona) {
            p.identificate();
        }

        //Mostrar los atributos propios de cada clase
        //Profesor
        for (Persona p : persona) {
            if (p instanceof Profesor) {
                ((Profesor) p).getEspecialidad();   //lo hace solo, poniendo "p." buscas el que quieras y tabulas
            }
        }

        //Estudiante
        for (Persona p : persona) {
            if (p instanceof Estudiante) {
                ((Estudiante) p).getIdEstudiante();
            }
        }
        
        
        //Persona pepe = new Persona(); no se pueden crear objetos Persona porque la clase es abstract

        //Crear array con Identificable
        ArrayList<Identificable> id = new ArrayList<>();
        
        id.add(new Profesor("Mates", "Jose", "Antonio", "476523T", new Direccion("Flores", "Madrid", 23343, "España")));
        id.add(new Profesor("Lengua", "Lourdes", "Garrido", "346723P", new Direccion("Huelva", "Ubeda", 84745, "España")));
        id.add(new Profesor("Musica", "Chema", "Ortiz", "294736L", new Direccion("Marin", "Moyet", 84652, "España")));

        id.add(new Estudiante("p1", "Ramon", "Perez", "2398476E", new Direccion("direc.", "ciudad", 29378, "España")));
        id.add(new Estudiante("a4", "Cinthya", "Navarro", "287364L", new Direccion("direc.", "ciudad", 29378, "España")));
        id.add(new Estudiante("m5", "Irene", "Jimenez", "293846V", new Direccion("direc.", "ciudad", 29378, "España")));
        
        //es posible porque si :)
    }

}
