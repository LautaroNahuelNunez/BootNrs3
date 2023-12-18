package Tarea;

import java.time.LocalDate;

public class Tarea {
    
    private int id;
    private LocalDate fechaInicio;
    private String tarea;
    
    public Tarea (){
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTarea() {
        return this.tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
}
