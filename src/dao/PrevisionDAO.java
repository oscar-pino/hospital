
package dao;

import dto.PrevisionDTO;
import dto.TipoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrevisionDAO implements ICRUD<PrevisionDTO> {
    
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private TipoUsuarioDTO tipo;   

    @Override
    public PrevisionDTO create(PrevisionDTO prevision) {
        
      try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO prevision (tipo) values (?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, prevision.getTipo());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return prevision;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro Prevision!\n" + e.getMessage());
        }
            return null;

    }

    @Override
    public PrevisionDTO readByID(int id) {
        
        ResultSet rs;
        PrevisionDTO prevision;

        try {

            prevision = new PrevisionDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_prevision, tipo FROM prevision WHERE id_prevision = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                prevision.setIdPrevision(rs.getInt(1));
                prevision.setTipo(rs.getString(2));
            }

            conn.close();
            ps.close();

            return prevision;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Prevision Por ID!\n"+e.getMessage());
        }
        return null;
    }
    
    public PrevisionDTO readByTipo(String tipo) {
        
        ResultSet rs;
        PrevisionDTO prevision;

        try {

            prevision = new PrevisionDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_prevision, tipo FROM prevision WHERE tipo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipo);

            rs = ps.executeQuery();

            while (rs.next()) {
                prevision.setIdPrevision(rs.getInt(1));
                prevision.setTipo(rs.getString(2));
            }

            conn.close();
            ps.close();

            return prevision;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Prevision Por Tipo!\n"+e.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<PrevisionDTO> readAll() {
        
        ResultSet rs;
        PrevisionDTO prevision;
        ArrayList<PrevisionDTO> previsiones;

        try {
            previsiones = new ArrayList<PrevisionDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_prevision, tipo FROM prevision";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                prevision = new PrevisionDTO();
                prevision.setIdPrevision(rs.getInt(1));
                prevision.setTipo(rs.getString(2));
                
                previsiones.add(prevision);
            }

            conn.close();
            ps.close();

            return previsiones;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Previsiones!\n"+e.getMessage());
        }
        return null;
    }

    @Override
    public PrevisionDTO update(PrevisionDTO prevision) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "UPDATE prevision SET tipo = ? WHERE id_prevision = ?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, prevision.getTipo());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return prevision;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Actualizar Prevision!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public int delete(int id) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "DELETE prevision WHERE id_prevision = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            
            ps.execute();
            
            conn.close();
            ps.close();

            return id;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro Prevision!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }
}
