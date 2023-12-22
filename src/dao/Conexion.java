
package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private final String USUARIO;
    private final String PASSWORD;
    private final String BASE_DATO;
    private final String SERVIDOR;
    private final String PUERTO;
    private final String URL;
    private Connection connection;
    
    public Conexion(){
    
    USUARIO = "sa";
    PASSWORD = "1q2w3e4r5t";
    BASE_DATO = "hospital";
    SERVIDOR = "localhost";
    PUERTO = "1433";   
    URL = "jdbc:sqlserver://"+SERVIDOR+":"+PUERTO+";databaseName="+BASE_DATO+";TrustServerCertificate=True;encrypt=true";      
    
    }
    
    public Connection getConexion(){
            
        try{          
            
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
        
        }catch(HeadlessException | SQLException | ClassNotFoundException e){
        
        JOptionPane.showMessageDialog(null, "¡Error de Conexion!\n"+e.getMessage());
        
        }
        return connection;
    }
}
