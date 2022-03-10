package recursividad;

/**
 *
 * @author alvaro
 */
public class EjemploDiapos10 {
    public static void main(String[] args) {
        
    }
    
    
    
    public static int factorial(int num){
        
        //Asegura un número positivo
        num = Math.abs(num);
   	 
    	if (num == 0 || num == 1){ // Caso base
        	return 1;
    	} else{
        	return num*factorial(num-1); // Ciclo activo
    	}
    }
    
}
