package Interfaces;

import Tarea.Tarea;

public interface DAOTarea {
    
    public void agregar (Tarea tarea);
    
    public void modificar (Tarea tarea);
    
    public void eliminar (Tarea tarea);
    
    public void buscar (Tarea tarea);
    
}
