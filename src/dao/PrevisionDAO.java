
package dao;

import dto.PrevisionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrevisionDAO {
    
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private PrevisionDTO prevision;

    public PrevisionDTO listarPrevisionPorId(int idPrevision) {

        ResultSet rs;
        PrevisionDTO prevision;

        try {

            prevision = new PrevisionDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM prevision WHERE id_prevision = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idPrevision);

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
    
    public PrevisionDTO listarPrevisionPorTipo(String tipo) {

        ResultSet rs;
        PrevisionDTO prevision;

        try {

            prevision = new PrevisionDTO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM prevision WHERE tipo = ?";
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
    
    public ArrayList<PrevisionDTO> listarPrevisiones() {

        ResultSet rs;
        PrevisionDTO prevision;
        ArrayList<PrevisionDTO> previsiones;

        try {
            previsiones = new ArrayList<PrevisionDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT * FROM prevision";
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

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Tipos Previsiones!\n"+e.getMessage());
        }
        return null;
    }
}
