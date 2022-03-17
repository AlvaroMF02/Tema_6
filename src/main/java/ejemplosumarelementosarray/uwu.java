package ejemplosumarelementosarray;

/**
 *
 * @author alvaro
 */
public class uwu {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(sumar(numeros,numeros.length));
    }
    

    public static int sumar(int[] array, int tamanio) {
        if (tamanio == 1){ // Caso base
            return array[0];
        }else{ // Ciclo activo
            return array[tamanio - 1] + sumar(array, tamanio - 1);
        }
    }

}
