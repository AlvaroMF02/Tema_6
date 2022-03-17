package ejer8;

/**
 *
 * @author Álvaro
 */
public class Dado extends Azar {
    
    
    
    
    
    public int lanzar(){
        int num=Math.floor(Math.random()*6+1);      //por que da error???
        return num;
    }

}
