package model;

public class  Medico extends Persona implements Interface{ 


 private String especialidad;

 public Medico(){
    super();
    }
    
    public Medico(String nombreCompleto, int edad, String cedula, String telefono, String especialidad) {
        super(nombreCompleto, edad, cedula, telefono);
        this.especialidad = especialidad;
    }

   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
  @Override
    public void mostrarInformacion() {
    System.out.println("====== DATOS DE LOS MEDICOS ======");
    System.out.println("Nombre: " + getNombreCompleto());
    System.out.println("Cédula: " + getcedula());
    System.out.println("Edad: " + getEdad());
    System.out.println("Teléfono: " + getTelefono());
    System.out.println("Especialidad: " + this.especialidad);
    System.out.println("================================");
}

  @Override
    public void eliminar() {
       System.out.println("El Medico se elimino correctamente");
    }

   @Override
    public void guardar() {
        System.out.println("El Medico se guardo con exito");
  
    }
    
 
 }
