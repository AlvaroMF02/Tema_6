package ejer16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
                
        ArrayList<Robot>robot=new ArrayList<>();
                    Robot pepe = new Robot();  //explicita
        for (int i = 0; i < 20; i++) {  //crea 20 robots
            robot.add(new Robot());
        }
        
        for (Robot r : robot) {         //muestra los robots
            System.out.println(r);
        }
        
        //ordenar el array con Comparable
        Collections.sort(robot);  
        
        //ordenar el array con Comparator
        //Collections.sort(robot, (Robot r1 , Robot r2)-> r1.getVida().compareTo(r2.getVida())); da error
        //Comparator<Robot> vidaRobot = (Robot r1 , Robot r2) -> r1.getVida().compareTo(r2.getVida()); error
                
                
        System.out.println("Ordenado por vida");
        
        for (Robot r : robot) {         //muestra los robots
            System.out.println(r);
        }

        if () {
            
        }
        
        
    }
    
    
//    
//    public void ordenarVidaRobot(){
//     Collections.sort(robot, (Robot r1 , Robot r2)-> r1.getVida().compareTo(r2.getVida()));
//
//    }
    
    
}
