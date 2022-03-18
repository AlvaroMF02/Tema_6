package ejer8;

import java.util.Random;

/**
 *
 * @author Álvaro
 */
public class Moneda extends Azar{
    private Random alea;
    
    public int lanzar(){
        int num=alea.nextInt(2)+1;      //por que da error???
        return num;
    }
    
    
}
