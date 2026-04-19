package model;


public class Administrador extends Persona {
    private String areaEncargada; 
    private int nivelAcceso; 

    public Administrador() {
        super();
    }

    public Administrador(String nombreCompleto, int edad, String cedula, String telefono, String areaEncargada, int nivelAcceso) {
        super(nombreCompleto, edad, cedula, telefono);
        this.areaEncargada = areaEncargada;
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("====== DATOS DEL ADMINISTRADOR ======");
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Área: " + this.areaEncargada);
        System.out.println("Nivel de Acceso: " + this.nivelAcceso);
        System.out.println("=====================================");
    }
}