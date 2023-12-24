
package dao;

import dto.DoctorDTO;
import dto.FarmaciaDTO;
import dto.PrevisionDTO;
import dto.RecaudacionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DoctorDAO implements ICRUD<DoctorDTO> {    
    
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private DoctorDTO doctor;

  

    @Override
    public DoctorDTO create(DoctorDTO doctor) {
        
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
            ps.setFloat(7, doctor.getHorasTrabajadas());
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

    @Override
    public DoctorDTO readByID(int id) {
        
        ResultSet rs;
        RecaudacionDAO recaudacion;
        FarmaciaDAO farmacia;
        PrevisionDAO prevision;
        
        try {
            recaudacion = new RecaudacionDAO();
            farmacia = new FarmaciaDAO();
            prevision = new PrevisionDAO();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_recaudacion, id_farmacia, nombre, apellido, cargo, direccion, horas_trabajadas, horas_extras, sueldo_base, id_prevision "
                    + "FROM farmacia WHERE id_doctor = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                doctor = new DoctorDTO();
                doctor.setRecaudacion(recaudacion.readByID(rs.getInt(1)));
                doctor.setFarmacia(farmacia.readByID(rs.getInt(2)));
                doctor.setNombre(rs.getString(3));
                doctor.setApellido(rs.getString(4));
                doctor.setCargo(rs.getString(5));
                doctor.setDireccion(rs.getString(6));
                doctor.setHorasTrabajadas(rs.getFloat(7));
                doctor.setHorasExtras(rs.getFloat(8));
                doctor.setSueldoBase(rs.getFloat(9));
                doctor.setPrevision(prevision.readByID(rs.getInt(10)));
               
            }

            conn.close();
            ps.close();
            
            return doctor;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Doctor Por ID!\n"+e.getMessage());
        }
        return null;
        
    }

    @Override
    public ArrayList<DoctorDTO> readAll() {
        
        ResultSet rs;
        RecaudacionDAO recaudacion;
        FarmaciaDAO farmacia;
        PrevisionDAO prevision;
        ArrayList<DoctorDTO> doctores;
        
        try {
            recaudacion = new RecaudacionDAO();
            farmacia = new FarmaciaDAO();
            prevision = new PrevisionDAO();
            doctores = new ArrayList<DoctorDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT id_recaudacion, id_farmacia, nombre, apellido, cargo, direccion, horas_trabajadas, horas_extras, sueldo_base, id_prevision "
                    + "FROM farmacia WHERE id_doctor = ?";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                doctor = new DoctorDTO();
                doctor.setRecaudacion(recaudacion.readByID(rs.getInt(1)));
                doctor.setFarmacia(farmacia.readByID(rs.getInt(2)));
                doctor.setNombre(rs.getString(3));
                doctor.setApellido(rs.getString(4));
                doctor.setCargo(rs.getString(5));
                doctor.setDireccion(rs.getString(6));
                doctor.setHorasTrabajadas(rs.getFloat(7));
                doctor.setHorasExtras(rs.getFloat(8));
                doctor.setSueldoBase(rs.getFloat(9));
                doctor.setPrevision(prevision.readByID(rs.getInt(10)));
                
                doctores.add(doctor);
               
            }

            conn.close();
            ps.close();
            
            return doctores;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Doctores!\n"+e.getMessage());
        }
        return null;
    }

    @Override
    public DoctorDTO update(DoctorDTO doctor) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "UPDATE doctor SET id_recaudacion = ?, id_farmacia = ?, nombre = ?, apellido = ?, cargo = ?, direccion = ?, horas_trabajadas = ?, horas_extras = ?, sueldo_base = ?, id_prevision = ? WHERE id_doctor = ?";
            
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, doctor.getRecaudacion().getIdRecaudacion());
            ps.setInt(2, doctor.getFarmacia().getIdFarmacia());
            ps.setString(3, doctor.getNombre());
            ps.setString(4, doctor.getApellido());
            ps.setString(5, doctor.getCargo());
            ps.setString(6, doctor.getDireccion());
            ps.setFloat(7, doctor.getHorasTrabajadas());
            ps.setFloat(8, doctor.getHorasExtras());
            ps.setFloat(9, doctor.getSueldoBase());
            ps.setInt(10, doctor.getPrevision().getIdPrevision());
            ps.setInt(11, doctor.getIdDoctor());

            ps.execute();
            
            conn.close();
            ps.close();

            return doctor;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al actualizar Registro Doctor!\n" + e.getMessage());
        }
            return null;
    }

    @Override
    public int delete(int id) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "DELETE doctor WHERE id_doctor = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.execute();
            
            conn.close();
            ps.close();

            return id;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro Doctor!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }
}
