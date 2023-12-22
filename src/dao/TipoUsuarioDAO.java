
package dao;

import dto.TipoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoUsuarioDAO {

    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private TipoUsuarioDTO tipo;

    public TipoUsuarioDTO listarTipoUsuarioPorId(int idTipoUsuario) {

        ResultSet rs;
        TipoUsuarioDTO tipo;

        try {

            tipo = new TipoUsuarioDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM tipo_usuario WHERE id_tipo_usuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idTipoUsuario);

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
    
    public TipoUsuarioDTO listarTipoUsuarioPorRol(String rol) {

        ResultSet rs;
        TipoUsuarioDTO tipo;

        try {

            tipo = new TipoUsuarioDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM tipo_usuario WHERE rol = ?";
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
    
    public ArrayList<TipoUsuarioDTO> listarTipos() {

        ResultSet rs;
        TipoUsuarioDTO tipo;
        ArrayList<TipoUsuarioDTO> tipos;

        try {
            tipos = new ArrayList<TipoUsuarioDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM tipo_usuario";
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
}

