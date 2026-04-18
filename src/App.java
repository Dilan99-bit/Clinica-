import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;


public class App {
     private static List<Paciente> listaPacientes = new ArrayList<>();
    public static void main(String[] args)  {

        Scanner sc= new Scanner(System.in);
        boolean salir = false;
        gestorCitas gestor = new gestorCitas();
        gestorConsultorio  gestionConsultorio = new gestorConsultorio();

        int opcion;

        do{

        System.out.println("BIENVENIDO AL SISTEMA DE CITAS");
        System.out.println("Por favor seleccione una opción");
        System.out.println("1.Registro paciente");
        System.out.println("2.Consutar medico");
        System.out.println("3.Programar Cita");
        System.out.println("4.Consultar consultorio");
        System.out.println("5.Consultar Cuota moderada");
        System.out.println("6. Salir");
   

        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                System.out.println("BIENVENIDO AL SISTEMA DE GESTIÓN DE PACIENTES");

                while (!salir) {
                    System.out.println("\n1. Registrar Paciente");
                    System.out.println("2. Ver Lista de Pacientes");
                    System.out.println("3. Salir");
                    System.out.print("Selecciona una opción: ");

                    int elegir = sc.nextInt();
                    sc.nextLine();

                     if (elegir == 1) {
                    System.out.print("Ingrese Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Ingrese EPS: ");
                    String EPS = sc.nextLine();
                    
                    Paciente nuevoPaciente = new Paciente(nombre, cedula, edad, EPS);

                    listaPacientes.add(nuevoPaciente);
                    System.out.println("¡Paciente registrado con éxito!");
                   
                    } else if (elegir == 2) {
                        if(listaPacientes.isEmpty()){
                            System.out.println("No hay Pacientes Registrados");
                        }else{
                            System.out.println("Lista de pacientes Registrados");
                             for (Paciente p : listaPacientes) { 
                               System.out.println(p.toString()); }
                        }
   
                   
                    } else if (elegir == 3) {
                            salir = true;
                            
                       }
                


                   
                 
                }
                break;
            case 2:
                int id;
                do {
                      System.out.println("Bienvenido al sitema de elecion de medico");
                      System.out.println("En que área lo buscas");
                      System.out.println("1) Cardiología");
                      System.out.println("2) Pediatría");
                      System.out.println("3) Neurología");
                      System.out.println(" 4) salir");

                      id = sc.nextInt();
                      sc.nextLine(); 
                    
                
                switch (id) {
            case 1:
                System.out.println("id: 1 , Nombre: Dr. Alberto Ruiz , Especialidad: Cardiología");
                break;
            case 2:
                System.out.println("id: 2 , Nombre: Dra. Elena Beltrán , Especialidad: Pediatría");
                break;
            case 3:
                System.out.println("id: 3 , Nombre: Dr. Isaac Newton , Especialidad: Neurología");
                break;
            case 4:
                System.out.println("Gracias por preferirnos");

                break;
            default:
                System.out.println("Error: El id ingresado no corresponde a ningun medico en el sistema.");
        }
        
         } while (id != 4);
                
               
                break;
            case 3:
                  System.out.println("Está en el apartado para registrar su cita");

                System.out.print("deme el id de su cita: ");
                    int idCita = sc.nextInt();


                    System.out.print("Ud que está que se muere, deme su id como paciente: ");
                    int idPaciente = sc.nextInt();

                    System.out.print("Deme el id del medico: ");
                    int idMedico = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("la fecha y hora de su cita: ");
                    String fechaHora = sc.nextLine();

                    System.out.print("Estado (Pendiente/Completada/Cancelada): ");
                    String estado = sc.nextLine();

                    if(idCita > 0){
                    Cita nuevaCita = new Cita(idCita, idPaciente, idMedico, fechaHora, estado);
                    gestor.agregarCita(nuevaCita);

                    }else{
                              System.out.println("Error opcion invalida vuelve a intentar");
                    }

                     gestor.mostrarCitas();
               
                   
                break;
            case 4 :
                 int pool;
                do{
                       System.out.println("Hola bienvenido al sistema de Registro del consultorio");
                        System.out.println("1) Asignar Consultorio");
                        System.out.println("2) Ver Consultorios");
                        System.out.println("3) salir");
                      
                        pool = sc.nextInt();
                        sc.nextLine();

                switch (pool) {
                    case 1:
                         System.out.println("Ingresa el numero del consultorio");
                          int numConsultorio = sc.nextInt();
                          sc.nextLine();
                          
                           if( numConsultorio > 0 &&  numConsultorio <= 3 ){
                    
                            }else{
                            System.out.println("Error : Solo tenemos 3 Consultorios en el area Metropolitana");
                        
                        }
                      
                        System.out.println("Ingresa el piso del consultorio");
                        int pisoConsultorio = sc.nextInt();
                        sc.nextLine();
                        if (pisoConsultorio > 0 && pisoConsultorio <= 1) {
                          
                            
                        }else{
                            System.out.println("Lo sentimos solo tenemos un piso");
                            break;
                        }
                          
                                Consultorio Agregado = new Consultorio (numConsultorio,pisoConsultorio,"Disponible");
                        gestionConsultorio.registrarConsultorio(Agregado);

                     
                                
                                break;
                            case 2:
                                System.out.println("Lista Consultorios");
                                
                                gestionConsultorio.mostrarConsultorios();
                                break; 
                            case 3:
                                System.out.println("Gracias por elegirnos Feliz Dia");
                                break;       
                        
                            default:
                                System.out.println("Opción inválida intenta de nuevo");
                                break;
                                }
                        }while(pool != 3);
                            
                break; 
            case 5:
                ArrayList<Cuota> historialCuotas = new ArrayList<>();
                String seguir;
                int option = 0;
                do{
                System.out.println("¡Aquí podrás consultar tu cuota moderadora!");
                System.out.println("1. Realizar consulta de cuota moderadora");
                System.out.println("2. Historial de consultas");
                System.out.println("3. Salir");
                option = sc.nextInt();
                
                sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Consulta tu cuota moderadora");
                    do{
                    System.out.println("Ingresa tu nombre");
                    String name = sc.nextLine();
                    System.out.println("Ingresa tu número de documento");
                    String doc = sc.nextLine();
                    
                    System.out.println("Ingresa tu EPS (Sura, Salud total o particular)");
                    String tipoAfiliacion = sc.nextLine();
                
                    Cuota calculCuota = new Cuota(name, doc, tipoAfiliacion);
                    System.out.println("Aquí tienes tú información");
                    calculCuota.validarCuota();
                    historialCuotas.add(calculCuota);
                    calculCuota.cuotaModeradora();
                    System.out.println("Recuerda realizar tu pago en el punto de atención");
                    System.out.println("¿Desea realizar otra consulta? Si/No" );
                    seguir = sc.next();
                    sc.nextLine();
                    

                }while (seguir.equalsIgnoreCase("Si"));
                        break;
                        case 2:
                System.out.println("\n Historial de consultas");
                for (int i = 0; i < historialCuotas.size(); i++) {
                System.out.println("Consulta # " + (i + 1));
             historialCuotas.get(i).cuotaModeradora();
            }
                            break;
                
                    default:
                        System.out.println("Saliendo del sistema...");
                        break;
                }

                }while (option !=3);
           
                break;  
            case 6 :
                System.out.println("Muchas gracias por usar nuestro servicio");
                break;         
            default:
                System.out.println("Error, Opcion invalida");
        }

    }while(opcion !=6);
        
        sc.close();
        }
}


