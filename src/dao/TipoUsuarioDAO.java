
package dao;
import dto.TipoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoUsuarioDAO implements ICRUD<TipoUsuarioDTO> {

    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private TipoUsuarioDTO tipo;   

    @Override
    public TipoUsuarioDTO create(TipoUsuarioDTO tu) {
        
      try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO tipo_usuario (rol) values (?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, tu.getRol());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return tu;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro TipoUsuario!\n" + e.getMessage());
        }
            return null;

    }

    @Override
    public TipoUsuarioDTO readByID(int id) {
        
        ResultSet rs;
        TipoUsuarioDTO tipo;

        try {

            tipo = new TipoUsuarioDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_tipo_usuario, rol FROM tipo_usuario WHERE id_tipo_usuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                tipo.setIdTipoUsuario(rs.getInt(1));
                tipo.setRol(rs.getString(2));
            }

            conn.close();
            ps.close();

            return tipo;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar TipoUsuario Por ID!\n"+e.getMessage());
        }
        return null;
    }
    
    public TipoUsuarioDTO readByRol(String rol) {
        
        ResultSet rs;
        TipoUsuarioDTO tipo;

        try {

            tipo = new TipoUsuarioDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_tipo_usuario, rol FROM tipo_usuario WHERE rol = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, rol);

            rs = ps.executeQuery();

            while (rs.next()) {
                tipo.setIdTipoUsuario(rs.getInt(1));
                tipo.setRol(rs.getString(2));
            }

            conn.close();
            ps.close();

            return tipo;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar TipoUsuario Por Rol!\n"+e.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<TipoUsuarioDTO> readAll() {
        
        ResultSet rs;
        TipoUsuarioDTO tipo;
        ArrayList<TipoUsuarioDTO> tipos;

        try {
            tipos = new ArrayList<TipoUsuarioDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_tipo_usuario, rol FROM tipo_usuario";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                tipo = new TipoUsuarioDTO();
                tipo.setIdTipoUsuario(rs.getInt(1));
                tipo.setRol(rs.getString(2));
                
                tipos.add(tipo);
            }

            conn.close();
            ps.close();

            return tipos;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Tipos De Usuarios!\n"+e.getMessage());
        }
        return null;
    }

    @Override
    public TipoUsuarioDTO update(TipoUsuarioDTO tu) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "UPDATE tipo_usuario SET rol = ? WHERE id_tipo_usuario = ?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, tu.getRol());
            ps.setInt(2, tu.getIdTipoUsuario());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return tu;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Actualizar Registro!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public int delete(int id) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "DELETE tipo_usuario WHERE id_tipo_usuario = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            
            ps.execute();
            
            conn.close();
            ps.close();

            return id;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }
}

