package Interfaces;

import Tarea.Tarea;

public interface DAOTarea {
    
    public boolean agregar (Tarea tarea);
    
    public boolean modificar (Tarea tarea);
    
    public boolean eliminar (Tarea tarea);
    
    public void buscar (Tarea tarea);
    
}
