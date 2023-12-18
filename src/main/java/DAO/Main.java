package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {
    
    private Connection conectar = null;
    private final String user = "root";
    private final String password = "LNNdarkangel099";
    private final String db = "tp3_ddbb";
    private final String ip = "localhost";
    private final String port = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + port + "/" + db;
    
    
    public Connection establecerConexion(){
        try{
            conectar = DriverManager.getConnection(cadena, user, password);
            //JOptionPane.showMessageDialog(null, "Se generó la conexion");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No se generó la conexion: " + e);
        }
        return conectar;
    }

    public static void main(String[] args) {
        
        Main app = new Main();
        
        app.establecerConexion();
    }
}
