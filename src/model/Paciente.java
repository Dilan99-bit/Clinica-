package model;

public class Paciente extends Persona  {
  
   
    private String EPS;


    public Paciente(){
        super();
    }

        public Paciente(String nombreCompleto, int edad, String cedula, String telefono, String EPS) {
        super(nombreCompleto, edad, cedula, telefono);
        this.EPS = EPS;
    }

  
    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

 
  @Override
    public void mostrarInformacion() {
    System.out.println("====== DATOS DEL PACIENTE ======");
    System.out.println("Nombre: " + getNombreCompleto());
    System.out.println("Cédula: " + getcedula());
    System.out.println("Edad: " + getEdad());
    System.out.println("Teléfono: " + getTelefono());
    System.out.println("EPS: " + this.EPS);
    System.out.println("================================");
}

    }

    


