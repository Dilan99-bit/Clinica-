package model;

public class Cita {
    
    private int idCita;
    private int idPaciente;
    private int idMedico;
    private String fechaHora;
    private String estado;
    
     public Cita (){
        
    }

	 public Cita(int idCita, int idPaciente, int idMedico, String fechaHora, String estado) {
			this.setIdCita(idCita);
			this.setIdPaciente(idPaciente); 
			this.setIdMedico(idMedico);
			this.setFechaHora(fechaHora);
			this.setEstado(estado);
      
	 }



     public int getIdCita() {
		 return idCita;
	 }

	 public void setIdCita(int idCita) {
        
            this.idCita = idCita;
        
		
	 }

	 public int getIdPaciente() {
		 return idPaciente;
	 }

	 public void setIdPaciente(int idPaciente) {
        if (idPaciente >= 1) {
            this.idPaciente = idPaciente;
        }else{
            System.out.println("Ud es como mongólico, ponga ese id paciente bien");
			System.exit(1);
        }
		 
	 }

	 public int getIdMedico() {
		 return idMedico;
	 }

	 public void setIdMedico(int idMedico) {
         if (idMedico >=1) {
            this.idMedico = idMedico;
        }else{
            System.out.println("Ud es como mongólico, ponga el id del medico bien, que falta de respeto");
			System.exit(1);
        }
		 
	 }

	 public String getFechaHora() {
		 return fechaHora;
	 }

	 public void setFechaHora(String fechaHora) {
		 if (fechaHora != null && !fechaHora.isEmpty()) {
        this.fechaHora = fechaHora;
    } else {
        System.out.println("Error: La fecha y hora no pueden estar vacías sapo");
		System.exit(1);
    }
	 }

	 public String getEstado() {
		 return estado;
	 }

	 public void setEstado(String estado) {
        if (estado.equals("Pendiente") || 
           estado.equals("Asignada") || 
           estado.equals("Cancelada")) {
            this.estado = estado;
        }else{
            System.out.println("Error, no hay cita");
			System.exit(1);
        }
		 
	 }
    
}


