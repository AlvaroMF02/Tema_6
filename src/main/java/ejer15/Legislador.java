package ejer15;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public abstract class Legislador extends Persona {

    protected String provinciaQueRepresenta;
    protected String partidoPolitico;

    
    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellido) {
        super(nombre, apellido);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

    public Legislador() {
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

    
    
    
    @Override
    public String toString() {
        return super.toString()+
                "\n \nLegislador:\n" + "\t provinciaQueRepresenta=" + provinciaQueRepresenta + "\t partidoPolitico=" + partidoPolitico + '}';
    }

    
    
    public abstract void getCamaraEnQueTrabaja();
    
    
    

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.provinciaQueRepresenta);
        hash = 89 * hash + Objects.hashCode(this.partidoPolitico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Legislador other = (Legislador) obj;
        if (!Objects.equals(this.provinciaQueRepresenta, other.provinciaQueRepresenta)) {
            return false;
        }
        return Objects.equals(this.partidoPolitico, other.partidoPolitico);
    }
    

    
    
    
    
    
    
    
}
