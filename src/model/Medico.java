package model;

public class  Medico { 

    private int idMedico;
    private String nombre;
    private String especialidad;

 public Medico(){

    }

    public Medico(int idMedico, String nombre, String especialidad) {

        this.idMedico = idMedico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }


      public int getidMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
             this.idMedico = idMedico;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEstado(String especialidad) {
        this.especialidad = especialidad;
    }
   
    public String toString() {
        return "medico [medico = " + idMedico + ", nombre =" + nombre + ", Espcialidad=" + especialidad;

    }
 }
