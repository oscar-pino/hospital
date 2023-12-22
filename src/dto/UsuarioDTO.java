package dto;

import java.util.ArrayList;

public class UsuarioDTO {

    private int idUsuario;
    private String run;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String username;
    private String contrasena;
    private String confContrasena;
    private String direccion;
    private TipoUsuarioDTO tipoUsuario;

    public UsuarioDTO() {
        tipoUsuario = new TipoUsuarioDTO("regular");
    }

    public UsuarioDTO(String run, String nombre, String apellido, String username, String contrasena, String confContrasena, String direccion, TipoUsuarioDTO tipoUsuario) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.contrasena = contrasena;
        this.confContrasena = confContrasena;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
    }

    public UsuarioDTO(String run, String nombre, String apellido, String telefono, String correo, String username, String contrasena, String confContrasena, String direccion, TipoUsuarioDTO tipoUsuario) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.username = username;
        this.contrasena = contrasena;
        this.confContrasena = confContrasena;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
    }   

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

   
    public String getRun() {
        return run;
    }

   
    public void setRun(String run) {
        this.run = run;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getConfContrasena() {
        return confContrasena;
    }

    public void setConfContrasena(String confContrasena) {
        this.confContrasena = confContrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoUsuarioDTO getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuarioDTO tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public ArrayList<UsuarioDTO> agregarListaDeUsuarios() {

        ArrayList<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();

        usuarios.add(new UsuarioDTO("1234567-8", "oscar", "pino", "934251630", "oscar@email.com", "spartako", "12345", "12345", "calle falsa 123", new TipoUsuarioDTO(1)));
        usuarios.add(new UsuarioDTO("1239123-2", "juan", "cortes", "95612341", "juan@email.com", "juancho", "1qwe", "1qwe", "america 213", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("2136721-3", "luis", "robles", "93245541", "luis@email.com", "lucho", "32asd", "32asd", "los robles 143", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("3239123-2", "jose", "gatica", "pepe", "zxc12", "zxc12", "los puelles 213", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("5323145-6", "cristian", "golla", "crhiss", "12qwe", "12qwe", "copihues 871", new TipoUsuarioDTO(1)));
        usuarios.add(new UsuarioDTO("1267531-7", "roberto", "mujica", "robert", "zas45", "zas45", "galaxias 982", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("1356742-3", "mario", "cereceda", "9561234", "mario@email.com", "mbross", "zxc12", "zxc12", "los puelles 213", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("1559125-6", "felipe", "becerra", "pipe", "123ert", "123ert", "arica 999", new TipoUsuarioDTO(1)));
        usuarios.add(new UsuarioDTO("1327651-3", "rodrigo", "perez", "98123452", "rigo@email.com", "rigo", "asd234", "asd234", "ovalle 456", new TipoUsuarioDTO(2)));
        usuarios.add(new UsuarioDTO("1154521-6", "carlos", "concha", "caloncho", "123rty", "123rty", "los cerezos 111", new TipoUsuarioDTO(2)));

        return usuarios;
    }
    
     @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + getIdUsuario() + ", run=" + getRun() + ", nombre=" + getNombre() + ", apellido=" + getApellido() + ", telefono=" + getTelefono() + ", correo=" + getCorreo() + ", username=" + getUsername()
                + ", contrasena=" + getContrasena() + ", confContrasena=" + getConfContrasena() + ", direccion=" + getDireccion() + ", idtipo= " + getTipoUsuario().getIdTipoUsuario() + ", rol= " + getTipoUsuario().getRol() + ")";
    }

    @Override
    public boolean equals(Object obj) {

        UsuarioDTO u;

        if (obj instanceof UsuarioDTO) {

            u = (UsuarioDTO) obj;

            if (this.getNombre().equals(u.getNombre()) & this.getApellido().equals(u.getApellido()) & this.getRun().equals(u.getRun())
                    & this.getTelefono().equals(u.getTelefono()) & this.getCorreo().equals(u.getCorreo()) & this.getDireccion().equals(u.getDireccion())
                    & this.getUsername().equals(u.getUsername()) & this.getContrasena().equals(u.getContrasena())
                    & this.getConfContrasena().equals(u.getConfContrasena()) & this.getTipoUsuario().equals(u.getTipoUsuario()) & this.getTipoUsuario().equals(getTipoUsuario())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
