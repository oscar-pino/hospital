
package dto;

public class TipoUsuarioDTO {   
    
    private int idTipoUsuario;
    private String rol;  

    public TipoUsuarioDTO(){    
        
    }
    
    public TipoUsuarioDTO(String rol){
    
        this.rol = rol;
    }
    
    public TipoUsuarioDTO(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }    
    
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }
    
    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString(){
    
        return"idTipoUsuario: "+idTipoUsuario+", rol: "+rol;
    }
}
