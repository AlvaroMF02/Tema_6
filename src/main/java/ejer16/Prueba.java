package ejer16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int busqueda;
        
        ArrayList<Robot>robot=new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {  //crea 20 robots
            robot.add(new Robot());
        }
        
        for (Robot r : robot) {         //muestra los robots
            System.out.println(r);
        }
        
        //ordenar el array
        Collections.sort(robot);
        
        System.out.println("¿Que robot quieres buscar?");
        busqueda=teclado.nextInt();

        //buscar
        Collections.binarySearch(robot, busqueda);
        
    }
}
