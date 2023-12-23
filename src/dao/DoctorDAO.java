
package dao;

import dto.DoctorDTO;
import dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DoctorDAO {
    
    
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private DoctorDTO doctor;

    public DoctorDTO crearDoctor(DoctorDTO doctor) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO doctor (id_recaudacion, id_farmacia, nombre, apellido, cargo, direccion, horas_trabajadas, horas_extras, sueldo_base, id_prevision) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, doctor.getRecaudacion().getIdRecaudacion());
            ps.setInt(2, doctor.getFarmacia().getIdFarmacia());
            ps.setString(3, doctor.getNombre());
            ps.setString(4, doctor.getApellido());
            ps.setString(5, doctor.getCargo());
            ps.setString(6, doctor.getDireccion());
            ps.setFloat(7, doctor.getHorastrabajadas());
            ps.setFloat(8, doctor.getHorasExtras());
            ps.setFloat(9, doctor.getSueldoBase());
            ps.setInt(10, doctor.getPrevision().getIdPrevision());

            ps.execute();
            
            conn.close();
            ps.close();

            return doctor;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro Doctor!\n" + e.getMessage());
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
}
