
package dao;

import dto.FarmaciaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FarmaciaDAO {
    
    private Conexion objCon;
    private Connection conn;
    private PreparedStatement ps;
    private String sql;
    private FarmaciaDTO farmaciaDTO;

    public FarmaciaDTO crearUsuario(FarmaciaDTO farmacia) {
        
        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            
            sql = "INSERT INTO farmacia (nombre_producto, descripcion_producto, proveedor, unidades, precio, farmaceutico, registro_recetas) "
                    + "VALUES (?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, farmacia.getNombreProducto());
            ps.setString(2, farmacia.getDescripcionProducto());
            ps.setString(3, farmacia.getProveedor());
            ps.setInt(4, farmacia.getUnidades());
            ps.setFloat(5, farmacia.getPrecio());
            ps.setString(6, farmacia.getFarmaceutico());
            ps.setString(7, farmacia.getRegistroReceta());

            ps.execute();
            
            conn.close();
            ps.close();

            return farmacia;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Guardar Registro Farmacia!\n" + e.getMessage());
        }
            return null;
    }
  
    public FarmaciaDTO listarFarmaciaPorID(int idFarmacia) {

        ResultSet rs;
        FarmaciaDTO farmacia;
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "SELECT nombre_producto, descripcion_producto, proveedor, unidades, precio, farmaceutico, registro_recetas from farmacia where id_farmacia = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idFarmacia);
            rs = ps.executeQuery();

            while (rs.next()) {

                farmaciaDTO = new FarmaciaDTO();
                farmaciaDTO.setNombreProducto(rs.getString(1));
                farmaciaDTO.setDescripcionProducto(rs.getString(2));
                farmaciaDTO.setProveedor(rs.getString(3));
                farmaciaDTO.setUnidades(rs.getInt(4));
                farmaciaDTO.setPrecio(rs.getFloat(5));
                farmaciaDTO.setFarmaceutico(rs.getString(6));
                farmaciaDTO.setRegistroReceta(rs.getString(7));
            }

            conn.close();
            ps.close();
            
            return farmaciaDTO;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Farmacia Por ID!\n"+e.getMessage());
        }
        return null;
    }
    
    public ArrayList<FarmaciaDTO> listarFarmacias() {

        ResultSet rs;
        TipoUsuarioDAO tipoDAO;
        ArrayList<FarmaciaDTO> farmacias;
        
        try {
            tipoDAO = new TipoUsuarioDAO();
            farmacias = new ArrayList<FarmaciaDTO>();
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = sql = "SELECT id_farmacia, nombre_producto, descripcion_producto, proveedor, unidades, precio, farmaceutico, registro_recetas from farmacia";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                farmaciaDTO = new FarmaciaDTO();
                farmaciaDTO.setIdFarmacia(1);
                farmaciaDTO.setNombreProducto(rs.getString(2));
                farmaciaDTO.setDescripcionProducto(rs.getString(3));
                farmaciaDTO.setProveedor(rs.getString(4));
                farmaciaDTO.setUnidades(rs.getInt(5));
                farmaciaDTO.setPrecio(rs.getFloat(6));
                farmaciaDTO.setFarmaceutico(rs.getString(7));
                farmaciaDTO.setRegistroReceta(rs.getString(8));
                
                farmacias.add(farmaciaDTO);
            }

            conn.close();
            ps.close();
            
            return farmacias;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "¡Error Al Listar Farmacias!\n"+e.getMessage());
        }
        return null;
    }

    public FarmaciaDTO actualizarFarmacia(FarmaciaDTO farmacia) {        
        
        try {
            
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "UPDATE farmacia SET nombre_producto = ?, descripcion_producto = ?, proveedor = ?, unidades = ?,"
                    + " precio = ?, farmaceutico = ?, registro_recetas = ? WHERE id_farmacia = ? ";

            ps = conn.prepareStatement(sql);

            ps.setString(1, farmacia.getNombreProducto());
            ps.setString(2, farmacia.getDescripcionProducto());
            ps.setString(3, farmacia.getProveedor());
            ps.setInt(4, farmacia.getUnidades());
            ps.setFloat(5, farmacia.getPrecio());
            ps.setString(6, farmacia.getFarmaceutico());
            ps.setString(7, farmacia.getRegistroReceta());
            ps.setInt(8, farmacia.getIdFarmacia());
            ps.execute();
            
            conn.close();
            ps.close();

            return farmacia;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Actualizar Registro Farmacia!\n" + e.getMessage());
        }
            return null;

    }

    public int eliminarfarmacia(int idFarmacia) {

        try {
            objCon = new Conexion();
            conn = objCon.getConexion();
            sql = "DELETE farmacia WHERE id_farmacia = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, idFarmacia);
            ps.execute();
            
            conn.close();
            ps.close();

            return idFarmacia;            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡Error Al Eliminar Registro Farmacia!\n" + e.getMessage());
        }
            return Integer.MIN_VALUE;
    }
    
//    public void agregarListaDeFarmacias(){
//    
//        user = new UsuarioDTO();        
//        
//        for(UsuarioDTO user : user.agregarListaDeUsuarios()){
//                  
//        crearUsuario(user);
//        
//        }    
//    }
}
