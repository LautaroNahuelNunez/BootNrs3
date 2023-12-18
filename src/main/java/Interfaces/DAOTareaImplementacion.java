package Interfaces;

import DAO.Main;
import Tarea.Tarea;

import java.sql.*;
import javax.swing.JOptionPane;

public class DAOTareaImplementacion implements DAOTarea{
    
    //ESTABLECEMOS UNA INSTANCIA DE LA CLASE MAIN
    Main main = new Main();

    //CONSTRUCTOR VACIO
    public DAOTareaImplementacion(){}
    
    
    //IMPLEMENTAMOS METODO AGREGAR
    @Override
    public boolean agregar(Tarea tarea){
        try {
            //GENERAMOS LA SENTENCIA SQL
            String sql = "INSERT INTO tareas (fecha_inicio, tarea) VALUES (?, ?)";
            
            //ESTABLECEMOS LA CONEXION A LA BBDD
            Connection conexion = main.establecerConexion();
            
            // CONVIERTO LOCALDATE A DATE
            Date fechaInicioSql = java.sql.Date.valueOf(tarea.getFechaInicio());
            
            //PREPARAMOS LA SENTENCIA
            PreparedStatement insertar = conexion.prepareStatement(sql);
            
            insertar.setDate(1, fechaInicioSql);
            insertar.setString(2, tarea.getTarea());
            
            //EJECUTAMOS LA SENTENCIA
            int filasAfectadas = insertar.executeUpdate();
            
            insertar.close();
            conexion.close();
            
            if (filasAfectadas>0){
                JOptionPane.showMessageDialog(null, "Tarea agregada con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la tarea");
                return false;
            }
                    
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
            return false;
        }
    }
    
    //IMPLEMENTAMOS METODO MODIFICAR
    @Override
    public boolean modificar(Tarea tarea) {
        try {
            Connection conexion = main.establecerConexion();
            
            PreparedStatement modificar = conexion.prepareStatement("UPDATE tareas SET tarea = ? WHERE id_tarea = ?");
            
            modificar.setString(1, tarea.getTarea());
            modificar.setInt(2, tarea.getId());
            
            int filasAfectadas = modificar.executeUpdate();
            
            modificar.close();
            conexion.close();
            
            if (filasAfectadas>0){
                JOptionPane.showMessageDialog(null, "Tarea modificada con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la tarea");
                return false;
            }
                  
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
            return false;
        }
    }

    
    //IMPLEMENTAMOS EL METODO ELIMINAR
    @Override
    public boolean eliminar(Tarea tarea) {
         try {
            Connection conexion = main.establecerConexion();
            
            PreparedStatement eliminar = conexion.prepareStatement("DELETE FROM tareas WHERE id_tarea = ?");
            
            eliminar.setInt(1, tarea.getId());
            
            int filasAfectadas = eliminar.executeUpdate();
            
            eliminar.close();
            conexion.close();
            
            if (filasAfectadas>0){
                JOptionPane.showMessageDialog(null, "Tarea eliminada con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la tarea");
                return false;
            }  
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
            return false;
        }   
    }
 
    //IMPLEMENTAMOS EL METODO BUSCAR
    @Override
    public void buscar(Tarea tarea) {
        try {
            Connection conexion = main.establecerConexion();
            
            PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM tareas WHERE id_tarea = ?");
            
            buscar.setInt(1, tarea.getId());
            
            ResultSet consulta = buscar.executeQuery();
            
            if(consulta.next()){
                tarea.setId(Integer.parseInt(consulta.getString("id_tarea")));
                tarea.setTarea(consulta.getString("tarea"));
                JOptionPane.showMessageDialog(null, "Tarea encontrada");
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar la tarea");
            }       
            buscar.close();
            conexion.close();   
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
    }   
}
