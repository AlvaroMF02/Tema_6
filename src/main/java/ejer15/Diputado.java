package ejer15;

/**
 *
 * @author alvaro
 */
public class Diputado extends Legislador{
    
    
    
    private int numeroAsiento;

    
    
    public Diputado(int numeroAsiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellido);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado() {
    }

    
    
    
    
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    
    
    
    public void getCamaraEnQueTrabaja(){
        System.out.println("Este tio es un DIPUTADO");
    }

    
    
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\n \nDiputado: \n" + "\t numeroAsiento=" + numeroAsiento;
    }

    
    
    
    
}
