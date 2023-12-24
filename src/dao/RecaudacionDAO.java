
package dao;

import dto.RecaudacionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RecaudacionDAO implements ICRUD<RecaudacionDTO> {

    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private RecaudacionDTO recaudacion;  

    @Override
    public RecaudacionDTO create(RecaudacionDTO recaudacion) {              
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO recaudacion (id_paciente, id_infraestructura, rut_paciente, hora_ingreso, especialidad, tipo_gravedad, unidad_hospitalaria, id_prevision) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, recaudacion.getPaciente().getIdPaciente());
            ps.setInt(2, recaudacion.getInfraestructura().getIdInfraestructura());
            ps.setInt(3, recaudacion.getRunPaciente());
            ps.setString(4, recaudacion.getHoraIngreso());
            ps.setString(5, recaudacion.getEspecialidad());
            ps.setString(6, recaudacion.getTipoGravedad());
            ps.setString(7, recaudacion.getUnidadHospitalaria());
            ps.setInt(8, recaudacion.getPrevision().getIdPrevision());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return recaudacion;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro Recaudacion!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public RecaudacionDTO readByID(int id) {
        
        ResultSet rs;
        PacienteDAO paciente;
        InfraestructuraDAO infraestructura;
        PrevisionDAO prevision;
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            paciente = new PacienteDAO();
            infraestructura = new InfraestructuraDAO();
            prevision = new PrevisionDAO();
            
            sql = "SELECT id_paciente, id_infraestructura, rut_paciente, hora_ingreso, especialidad, tipo_gravedad, unidad_hospitalaria, id_prevision FROM recaudacion WHERE id_recaudacion = ?";
                    
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);            
            
            rs = ps.executeQuery();

            while (rs.next()) {
                
                recaudacion = new RecaudacionDTO();
                recaudacion.setPaciente(paciente.readByID(rs.getInt(1)));
                recaudacion.setInfraestructura(infraestructura.readByID(rs.getInt(2)));
                recaudacion.setRunPaciente(rs.getInt(3));
                recaudacion.setHoraIngreso(rs.getString(4));
                recaudacion.setEspecialidad(rs.getString(5));
                recaudacion.setTipoGravedad(rs.getString(6));
                recaudacion.setUnidadHospitalaria(rs.getString(7));
                recaudacion.setPrevision(prevision.readByID(rs.getInt(8)));
                recaudacion.setIdRecaudacion(rs.getInt(9));
            }
            
            ps.execute();
            
            conn.close();
            ps.close();

            return recaudacion;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Listar Recaudacion Por ID!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public ArrayList<RecaudacionDTO> readAll() {
        
        ArrayList<RecaudacionDTO> recaudaciones;
        
        ResultSet rs;
        PacienteDAO paciente;
        InfraestructuraDAO infraestructura;
        PrevisionDAO prevision;
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            paciente = new PacienteDAO();
            infraestructura = new InfraestructuraDAO();
            prevision = new PrevisionDAO();
            recaudaciones = new ArrayList<RecaudacionDTO>();
            
            sql = "SELECT id_paciente, id_infraestructura, rut_paciente, hora_ingreso, especialidad, tipo_gravedad, unidad_hospitalaria, id_prevision FROM recaudacion";
                    
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();

            while (rs.next()) {
                
                recaudacion = new RecaudacionDTO();
                recaudacion.setPaciente(paciente.readByID(rs.getInt(1)));
                recaudacion.setInfraestructura(infraestructura.readByID(rs.getInt(2)));
                recaudacion.setRunPaciente(rs.getInt(3));
                recaudacion.setHoraIngreso(rs.getString(4));
                recaudacion.setEspecialidad(rs.getString(5));
                recaudacion.setTipoGravedad(rs.getString(6));
                recaudacion.setUnidadHospitalaria(rs.getString(7));
                recaudacion.setPrevision(prevision.readByID(rs.getInt(8)));
                recaudacion.setIdRecaudacion(rs.getInt(9));
                
                recaudaciones.add(recaudacion);
            }
            
            ps.execute();
            
            conn.close();
            ps.close();

            return recaudaciones;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Listar Recaudaciones!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public RecaudacionDTO update(RecaudacionDTO recaudacion) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "UPDATE recaudacion SET id_paciente = ?, id_infraestructura = ?, rut_paciente = ?, hora_ingreso = ?, especialidad = ?, tipo_gravedad = ?, unidad_hospitalaria = ?, id_prevision = ? WHERE id_recaudacion = ?";
                    
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, recaudacion.getPaciente().getIdPaciente());
            ps.setInt(2, recaudacion.getInfraestructura().getIdInfraestructura());
            ps.setInt(3, recaudacion.getRunPaciente());
            ps.setString(4, recaudacion.getHoraIngreso());
            ps.setString(5, recaudacion.getEspecialidad());
            ps.setString(6, recaudacion.getTipoGravedad());
            ps.setString(7, recaudacion.getUnidadHospitalaria());
            ps.setInt(8, recaudacion.getPrevision().getIdPrevision());
            ps.setInt(9, recaudacion.getIdRecaudacion());
            
            ps.execute();
            
            conn.close();
            ps.close();

            return recaudacion;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Actualizar Registro Recaudacion!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public int delete(int id) {
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "DELETE recaudacion WHERE id_recaudacion = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            
            ps.execute();
            
            conn.close();
            ps.close();

            return id;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro Recaudacion!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }    
}
