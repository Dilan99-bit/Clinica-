package model;

public class Paciente {
  
    private String nombre;
    private String cedula;
    private int edad;
    private String EPS;


    public Paciente(){

    }

    public Paciente(String nombre, String cedula, int edad, String EPS) {
        this.nombre = nombre;
        this.cedula = cedula;
        setEdad(edad);
        this.EPS = EPS;
    }

    public Paciente(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        setEdad(edad);
        this.EPS = "Particular";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        }
    }
    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Cédula: " + cedula + " | Edad: " + edad + " | EPS: " + EPS;
    }

    
}

