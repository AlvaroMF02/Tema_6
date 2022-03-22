package ejer15;

/**
 *
 * @author alvaro
 */
public class Senador extends Legislador{
    
    
    private double complemento;

    
    
    
    public Senador(double complemento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellido);
        this.complemento = complemento;
    }

    public Senador() {
    }

    
    
    
    
    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
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
        System.out.println("Este tio es un SENADOR");
    }

    
    
    
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\n \nSenador: \n" + "\t complemento=" + complemento;
    }
    
}
