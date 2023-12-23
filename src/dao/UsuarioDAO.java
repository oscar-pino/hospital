package dao;

import dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO {

    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private UsuarioDTO user;

    public UsuarioDTO crearUsuario(UsuarioDTO usuario) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO usuario (username,run,nombre,apellido,direccion,telefono,correo,contrasena,conf_contrasena, id_tipo_usuario) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getRun());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getApellido());
            ps.setString(5, usuario.getDireccion());

            if (usuario.getTelefono() == null) {
                ps.setString(6, null);
            } else {
                ps.setString(6, usuario.getTelefono());
            }

            if (usuario.getCorreo() == null) {
                ps.setString(7, null);
            } else {
                ps.setString(7, usuario.getCorreo());
            }

            ps.setString(8, usuario.getContrasena());
            ps.setString(9, usuario.getConfContrasena());
            ps.setInt(10, usuario.getTipoUsuario().getIdTipoUsuario());
            ps.execute();
            
            conn.close();
            ps.close();

            return usuario;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro Usuario!\n" + e.getMessage());
        }
            return null;
    }
    
    public boolean existeUsername(String username) {

        ResultSet rs;

        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT username from usuario where username like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                return true;
            }

                conn.close();
                ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Al Consultar Username!");
        }
        return false;
    }

    public UsuarioDTO listarUsuarioPorID(int idUsuario) {

        ResultSet rs;
        TipoUsuarioDAO tipoDAO;
        
        try {
            tipoDAO = new TipoUsuarioDAO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT nombre, apellido, run, telefono, correo, direccion, username, contrasena, conf_contrasena, id_tipo_usuario, id_usuario from usuario where id_usuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {

                user = new UsuarioDTO();
                user.setNombre(rs.getString(1));
                user.setApellido(rs.getString(2));
                user.setRun(rs.getString(3));
                user.setTelefono(rs.getString(4));
                user.setCorreo(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setUsername(rs.getString(7));
                user.setContrasena(rs.getString(8));
                user.setConfContrasena(rs.getString(9));
                user.setTipoUsuario(tipoDAO.listarTipoUsuarioPorId(rs.getInt(10)));
                user.setIdUsuario(rs.getInt(11));
            }

            conn.close();
            ps.close();
            
            return user;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Usuario Por ID!\n"+e.getMessage());
        }
        return null;
    }
    
    public UsuarioDTO listarUsuarioPorUsername(String username) {

        ResultSet rs;
        TipoUsuarioDAO tipoDAO;
        
        try {
            tipoDAO = new TipoUsuarioDAO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT nombre, apellido, run, telefono, correo, direccion, username, contrasena, conf_contrasena, id_tipo_usuario, id_usuario "
                    + "from usuario where username = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {

                user = new UsuarioDTO();
                user.setNombre(rs.getString(1));
                user.setApellido(rs.getString(2));
                user.setRun(rs.getString(3));
                user.setTelefono(rs.getString(4));
                user.setCorreo(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setUsername(rs.getString(7));
                user.setContrasena(rs.getString(8));
                user.setConfContrasena(rs.getString(9));
                user.setTipoUsuario(tipoDAO.listarTipoUsuarioPorId(rs.getInt(10)));
                user.setIdUsuario(rs.getInt(11));
            }

            conn.close();
            ps.close();
            
            return user;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Usuario Por Username!\n"+e.getMessage());
        }
        return null;
    }
    
    public UsuarioDTO login(String username, String password) {

        ResultSet rs;
        TipoUsuarioDAO tipoDAO;
        
        try {
            tipoDAO = new TipoUsuarioDAO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT nombre, apellido, run, telefono, correo, direccion, username, contrasena, conf_contrasena, id_tipo_usuario, id_usuario "
                    + "from usuario where username = ? AND contrasena = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {

                user = new UsuarioDTO();
                user.setNombre(rs.getString(1));
                user.setApellido(rs.getString(2));
                user.setRun(rs.getString(3));
                user.setTelefono(rs.getString(4));
                user.setCorreo(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setUsername(rs.getString(7));
                user.setContrasena(rs.getString(8));
                user.setConfContrasena(rs.getString(9));
                user.setTipoUsuario(tipoDAO.listarTipoUsuarioPorId(rs.getInt(10)));
                user.setIdUsuario(rs.getInt(11));
            }

            conn.close();
            ps.close();
            
            return user;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Hacer Login!\n"+e.getMessage());
        }
        return null;
    }
    
    public ArrayList<UsuarioDTO> listarUsuarios() {

        ResultSet rs;
        TipoUsuarioDAO tipoDAO;
        ArrayList<UsuarioDTO> users;
        
        try {
            tipoDAO = new TipoUsuarioDAO();
            users = new ArrayList<UsuarioDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT nombre, apellido, run, telefono, correo, direccion, username, contrasena, "
                    + "conf_contrasena, id_tipo_usuario, id_usuario from usuario";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                user = new UsuarioDTO();
                user.setNombre(rs.getString(1));
                user.setApellido(rs.getString(2));
                user.setRun(rs.getString(3));
                user.setTelefono(rs.getString(4));
                user.setCorreo(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setUsername(rs.getString(7));
                user.setContrasena(rs.getString(8));
                user.setConfContrasena(rs.getString(9));
                user.setTipoUsuario(tipoDAO.listarTipoUsuarioPorId(rs.getInt(10)));
                user.setIdUsuario(rs.getInt(11));
                
                users.add(user);
            }

            conn.close();
            ps.close();
            
            return users;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Usuarios!\n"+e.getMessage());
        }
        return null;
    }
    
    public ArrayList<String> listarUsernames() {

        ResultSet rs;
        String username;
        ArrayList<String> usernames;
        
        try {
            usernames = new ArrayList<String>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT username from usuario";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                username = rs.getString(1);
                
                usernames.add(username);
            }

            conn.close();
            ps.close();
            
            return usernames;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Usernames!\n"+e.getMessage());
        }
        return null;
    }

    public UsuarioDTO actualizarUsuario(UsuarioDTO usuario) {        
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "UPDATE usuario SET username=?, run=?, nombre=?, apellido=?, direccion=?, "
            + "telefono=?, correo=?, contrasena=?, conf_contrasena=?, id_tipo_usuario=? WHERE id_usuario = ?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getRun());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getApellido());
            ps.setString(5, usuario.getDireccion());

            if (usuario.getTelefono() == null) {
                ps.setString(6, null);
            } else {
                ps.setString(6, usuario.getTelefono());
            }

            if (usuario.getCorreo() == null) {
                ps.setString(7, null);
            } else {
                ps.setString(7, usuario.getCorreo());
            }

            ps.setString(8, usuario.getContrasena());
            ps.setString(9, usuario.getConfContrasena());
            ps.setInt(10, usuario.getTipoUsuario().getIdTipoUsuario());
            ps.setInt(11, usuario.getIdUsuario());
            ps.execute();
            
            conn.close();
            ps.close();

            return usuario;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Actualizar Registro!\n" + e.getMessage());
        }
            return null;

    }

    public int eliminarUsuario(int idUsuario) {

        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "DELETE usuario WHERE id_usuario = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, idUsuario);
            ps.execute();
            
            conn.close();
            ps.close();

            return idUsuario;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }
    
    public void agregarListaDeUsuarios(){
    
        user = new UsuarioDTO();        
        
        for(UsuarioDTO user : user.agregarListaDeUsuarios()){
                  
        crearUsuario(user);
        
        }    
    }
}
