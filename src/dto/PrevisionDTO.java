
package dto;

public class PrevisionDTO {
    
    private int idPrevision;
    private String tipo;   

    public PrevisionDTO(){    
        
    }
    
    public PrevisionDTO(String tipo){
    
        this.tipo = tipo;
    }
    
    public PrevisionDTO(int idPrevision) {
        this.idPrevision = idPrevision;
    }

    public int getIdPrevision() {
        return idPrevision;
    }

    public void setIdPrevision(int idPrevision) {
        this.idPrevision = idPrevision;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
    
        return"idPrevision: "+idPrevision+", tipo: "+tipo;
    }
}
