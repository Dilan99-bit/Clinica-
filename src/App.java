import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class App {
    private static List<Paciente> listaPacientes = new ArrayList<>();
    private static List<Medico> listaMedicos = new ArrayList<>();
    private static List<Administrador> listaAdmins = new ArrayList<>();

    public static void inicializarMedicos() {
        listaMedicos.add(new Medico("Alberto Ruiz", 45, "1012569874", "3012569874", "Cardiología"));
        listaMedicos.add(new Medico("Elena Beltrán", 42, "1012587453", "3003236987", "Pediatría"));
        listaMedicos.add(new Medico("Isaac Newton", 35, "1236987405", "3105478963", "Neurología"));
        listaMedicos.add(new Medico("Carlos Restrepo", 24, "5698741235", "3112365987", "Dermatologia"));
        listaMedicos.add(new Medico("Andrés Montoya", 30, "4587456321", "3105874563", "Endocrinologia"));
        listaMedicos.add(new Medico("Santiago Vélez", 47, "8563214752", "310589636", "Neumologia"));
        listaMedicos.add(new Medico("Mateo Holguín", 28, "2569874136", "3168529631", "Infectologia"));
        listaMedicos.add(new Medico("Iván Ramírez", 29, "145789631", "3141254789", "Psiquiatria"));
        listaMedicos.add(new Medico("Sandra Arango", 41, "4569874526", "3105698712", "Hematologia"));
        listaMedicos.add(new Medico("Ricardo Franco", 55, "5669755698", "3005896314", "Gastroenterologia"));
        listaMedicos.add(new Medico("Claudia López", 39, "6666666666", "3017893215", "Cirugia General"));

        listaAdmins.add(new Administrador("Dilan Galvis", 25, "1000123456", "3128889900", "Gerencia", 3));

    }

    public static void mostrarListaMedicos() {
        if (listaMedicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
        } else {
            for (Medico med : listaMedicos) {
                med.mostrarInformacion();
            }
        }
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        inicializarMedicos();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        gestorCitas gestor = new gestorCitas();
        gestorConsultorio gestionConsultorio = new gestorConsultorio();

        int opcion;

        do {

            System.out.println("BIENVENIDO AL SISTEMA DE LA CLINICA");
            System.out.println("Por favor seleccione una opción");
            System.out.println("1.Registro paciente");
            System.out.println("2.Consutar medico");
            System.out.println("3.Programar Cita");
            System.out.println("4.Modulo Administrador");
            System.out.println("5.Consultar Cuota moderada");
            System.out.println("6. Salir");

            System.out.println("=======================================================================");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("BIENVENIDO AL SISTEMA DE GESTIÓN DE PACIENTES");

                    while (!salir) {
                        System.out.println("\n1. Registrar Paciente");
                        System.out.println("2. Ver Lista de Pacientes");
                        System.out.println("3. Salir");
                        System.out.print("Selecciona una opción: ");

                        int elegir = sc.nextInt();
                        sc.nextLine();

                        System.out.println("=======================================================================");

                        if (elegir == 1) {
                            System.out.print("Ingrese Nombre: ");
                            String nombre = sc.nextLine();

                            System.out.print("Ingrese Edad: ");
                            int edad = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Ingrese cedula: ");
                            String cedula = sc.nextLine();

                            System.out.println("Ingrese telefono");
                            String telefono = sc.nextLine();

                            System.out.print("Ingrese EPS: ");
                            String EPS = sc.nextLine();

                            Paciente nuevoPaciente = new Paciente(nombre, edad, cedula, telefono, EPS);

                            listaPacientes.add(nuevoPaciente);
                            System.out.println("¡Paciente registrado con éxito!");

                            System.out.println("========================================================================");

                        } else if (elegir == 2) {
                            if (listaPacientes.isEmpty()) {
                                System.out.println("No hay Pacientes Registrados");
                            } else {
                                System.out.println("Lista de pacientes Registrados");
                                for (Paciente p : listaPacientes) {
                                    p.mostrarInformacion();
                                }
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
                        System.out.println("4) Dermatologia");
                        System.out.println("5) Endocrinologia");
                        System.out.println("6) Neumologia");
                        System.out.println("7) Infectologia");
                        System.out.println("8) Psiquiatria");
                        System.out.println("9) Hematologia");
                        System.out.println("10) Gastroenterologia");
                        System.out.println("11) Cirugia General");
                        System.out.println("12) salir");

                        System.out.println("==========================================================");

                        id = sc.nextInt();
                        sc.nextLine();

                        String busqueda = "";
                        if (id == 1)
                            busqueda = "Cardiología";
                        else if (id == 2)
                            busqueda = "Pediatría";
                        else if (id == 3)
                            busqueda = "Neurología";
                        else if (id == 4)
                            busqueda = "Dermatologia";
                        else if (id == 5)
                            busqueda = "Endocrinologia";
                        else if (id == 6)
                            busqueda = "Neumologia";
                        else if (id == 7)
                            busqueda = "Infectologia";
                        else if (id == 8)
                            busqueda = "Psiquiatria";
                        else if (id == 9)
                            busqueda = "Hematologia";
                        else if (id == 10)
                            busqueda = "Gastroenterologia";
                        else if (id == 11)
                            busqueda = "Cirugia General";

                        if (id >= 1 && id <= 11) {
                            System.out.println("Medicos Disponibles son :" + busqueda + ":");
                            boolean encontro = false;

                            for (Medico m : listaMedicos) {
                                if (m.getEspecialidad().equalsIgnoreCase(busqueda)) {
                                    m.mostrarInformacion();
                                    encontro = true;
                                }
                            }
                            if (!encontro)
                                System.out.println("No hay médicos en esta área.");
                        }

                    } while (id != 12);

                    break;
                case 3:
                    System.out.println("Está en el apartado para registrar su cita");
                    System.out.println("=============================================");

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

                    if (idCita > 0) {
                        Cita nuevaCita = new Cita(idCita, idPaciente, idMedico, fechaHora, estado);
                        gestor.agregarCita(nuevaCita);

                    } else {
                        System.out.println("Error opcion invalida vuelve a intentar");
                    }

                    gestor.mostrarCitas();

                    break;
                case 4:
                    System.out.println("\n--- PANEL DE CONTROL ADMINISTRATIVO ---");
                    System.out.println("===============================================");

                    int pool;

                    do {
                       
                        System.out.println(
                                "Bienvenido al sistema: Aqui podras asignar consultorios y var administradores");
                        System.out.println("1) Ver Administradores,medicos,Consultorios");
                        System.out.println("2) Registrar un nuevo Medico");
                        System.out.println("3) Registrar un nuevo Administrador");
                        System.out.println("4) Gestionar consultorio");
                        System.out.println("5) salir");
                        System.out.println("=======  =====================   ========================    ===================");
                        pool = sc.nextInt();
                        sc.nextLine();

                        switch (pool) {
                            case 1:
                                int caso;
                                System.out.println("\n--- ¿QUÉ DESEA VISUALIZAR? ---");
                                System.out.println("1) Ver Administradores");
                                System.out.println("2) Ver Médicos");
                                System.out.println("3) Ver Consultorios");
                                System.out.println("4) Volver");
                                System.out.print("Seleccione: ");
                                System.out.println("=======  ===============  ========  ========");
                                caso = sc.nextInt();
                                sc.nextLine();
                                switch (caso) {
                                    case 1:
                                        if (listaAdmins.isEmpty()) {
                                            System.out.println("[!] No hay administradores registrados.");
                                        } else {
                                            System.out.println("Personal a cargo:");
                                            for (Administrador a : listaAdmins) {
                                                a.mostrarInformacion();
                                            }
                                        }

                                        break;
                                    case 2:
                                        System.out.println("Lista de medicos :");
                                        mostrarListaMedicos();

                                        break;
                                    case 3:
                                        System.out.println("Lista Consultorios");

                                        gestionConsultorio.mostrarConsultorios();

                                        break;

                                    default:
                                        System.out.println("Ingrese una opcion Valida");
                                        break;
                                }

                                break;
                            case 2:

                                System.out.println("\n--- REGISTRO DE NUEVO MÉDICO ---");
                                System.out.print("Nombre Completo: ");
                                String nomM = sc.nextLine();
                                System.out.print("Cédula: ");
                                String cedM = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadM = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Teléfono: ");
                                String telM = sc.nextLine();
                                System.out.print("Especialidad: ");
                                String espM = sc.nextLine();

                              
                                Medico nuevoMedico = new Medico(nomM, edadM, cedM, telM, espM);
                                listaMedicos.add(nuevoMedico);
                                System.out.println("¡Médico registrado con éxito!");

                                System.out.println("========================       ===============================");

                                break;
                            case 3:
                                System.out.println("\n--- REGISTRO DE NUEVO ADMINISTRADOR ---");
                                System.out.print("Nombre Completo: ");
                                String nomA = sc.nextLine();
                                System.out.print("Cédula: ");
                                String cedA = sc.nextLine();
                                System.out.print("Edad: ");
                                int edadA = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Teléfono: ");
                                String telA = sc.nextLine();
                                System.out.print("Área (Ej: Gerencia): ");
                                String areaA = sc.nextLine();

                              
                                listaAdmins.add(new Administrador(nomA, edadA, cedA, telA, areaA, 0));
                                System.out.println("¡Administrador registrado con éxito!");

                                System.out.println("===================        ==================");

                                break;
                            case 4:
                                System.out.println("Ingresa el numero del consultorio");
                                int numConsultorio = sc.nextInt();
                                sc.nextLine();

                                if (numConsultorio > 0 && numConsultorio <= 11) {

                                } else {
                                    System.out.println("Error : Solo tenemos 11 Consultorios en el area Metropolitana");

                                }

                                System.out.println("Ingresa el piso del consultorio");
                                int pisoConsultorio = sc.nextInt();
                                sc.nextLine();
                                if (pisoConsultorio > 0 && pisoConsultorio <= 5) {

                                } else {
                                    System.out.println("Numero de piso incorrecto");
                                    break;
                                }

                                Consultorio Agregado = new Consultorio(numConsultorio, pisoConsultorio, "Disponible");
                                gestionConsultorio.registrarConsultorio(Agregado);

                                break;
                            case 5:
                                System.out.println("Gracias por elegirnos Feliz Dia");
                                break;

                            default:
                                System.out.println("Opción inválida intenta de nuevo");
                                break;
                        }
                    } while (pool != 5);

                    break;
                case 5:
                    ArrayList<Cuota> historialCuotas = new ArrayList<>();
                    String seguir;
                    int option = 0;
                    do {
                        System.out.println("¡Aquí podrás consultar tu cuota moderadora!");
                        System.out.println("1. Realizar consulta de cuota moderadora");
                        System.out.println("2. Historial de consultas");
                        System.out.println("3. Salir");
                        option = sc.nextInt();

                        sc.nextLine();
                        switch (option) {
                            case 1:
                                System.out.println("Consulta tu cuota moderadora");
                                do {
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
                                    System.out.println("¿Desea realizar otra consulta? Si/No");
                                    seguir = sc.next();
                                    sc.nextLine();

                                } while (seguir.equalsIgnoreCase("Si"));
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

                    } while (option != 3);

                    break;
                case 6:
                    System.out.println("Muchas gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Error, Opcion invalida");
            }

        } while (opcion != 6);

        sc.close();
    }
}
