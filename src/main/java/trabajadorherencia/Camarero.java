package trabajadorherencia;

/**
 *
 * @author alvaro
 */
public class Camarero extends Trabajador{
    // Único atributo propio de Camarero
    private String rango;

    public Camarero(String rango, String nombre, String apellido1, 
			String NIF) {
		// Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }
    
    // Solo lo tiene el camarero
    public void servirMesa(String id){
        System.out.println("CAmarero sirviendo la mesa "+id);
    }
 

    @Override
	// Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Camarero");
    }
    
    
    
   }

