package ejer8;

/**
 *
 * @author Álvaro
 */
public class Moneda extends Azar{
    
    
    public int lanzar(){
        int num=Math.floor(Math.random()*2+1);      //por que da error???
        return num;
    }
    
    
}
