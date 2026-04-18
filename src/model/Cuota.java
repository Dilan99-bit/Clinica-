package model;

public class Cuota {
    private String nombrePaciente;
    private String cedulaPaciente;
    private String afiliacion;
    private double totalPagar;
    
    public Cuota(String nombrePaciente, String cedulaPaciente, String afiliacion) {
        this.nombrePaciente = nombrePaciente;
        this.cedulaPaciente = cedulaPaciente;
        this.afiliacion = afiliacion;
    }
    public Cuota(String nombrePaciente, String cedulaPaciente, String afiliacion, double totalPagar) {
        this.nombrePaciente = nombrePaciente;
        this.cedulaPaciente = cedulaPaciente;
        this.afiliacion = afiliacion;
        this.totalPagar = totalPagar;
    }
    public Cuota() {
    }
    public String getNombrePaciente() {
        return nombrePaciente;
    }
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    public String getCedulaPaciente() {
        return cedulaPaciente;
    }
    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }
    public String getAfiliacion() {
        return afiliacion;
    }
    public void setAfiliacion(String afiliacion) {
    
       this.afiliacion = afiliacion;
           
            
       
    }
    public double getTotalPagar() {
        return totalPagar;
    }
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

     public void validarCuota(){
if (afiliacion.equalsIgnoreCase("Sura")) {
    setTotalPagar(5000);
}else if(afiliacion.equalsIgnoreCase("Salud total")){
setTotalPagar(20100);
}else if (afiliacion.equalsIgnoreCase("Particular")) {
    setTotalPagar(52800);
}else{
    System.out.println("Error. Consulta inválida");
    
}
}

    public void cuotaModeradora(){

    
        System.out.println("| Paciente: " + nombrePaciente + "| Documento: " + cedulaPaciente + "| EPS: " + afiliacion
    + "| Total a pagar: " + getTotalPagar());
    
        
}
    
}
