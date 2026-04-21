package model;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorCuota implements Interface{

private ArrayList<Cuota> historialCuotas = new ArrayList<>();
private Scanner sc = new Scanner(System.in) ;



    @Override
    public void eliminar() {
    System.out.print("Ingrese la cédula del usuario que desea eliminar: ");
    String ccBorrar = sc.nextLine();
    
    boolean busqueda = false;

    
    for (int i = 0; i < historialCuotas.size(); i++) {
        
        if (historialCuotas.get(i).getCedulaPaciente().equals(ccBorrar)) {
            historialCuotas.remove(i); 
            System.out.println("Usuario con número de documento:  " + ccBorrar + " ha sido eliminado.");
            busqueda = true;
            break; 
        }
    }

    
    if (!busqueda) {
        System.out.println("No se encontró ningún registro con la cédula: " + ccBorrar);
    }
    }

    @Override
    public void guardar() {
        System.out.println("Ingresa tu nombre");
                                    String name = sc.nextLine();
                                    System.out.println("Ingresa tu número de documento");
                                    String doc = sc.nextLine();

                                    System.out.println("Ingresa tu EPS (Sura, Salud total o particular)");
                                    String tipoAfiliacion = sc.nextLine();
                                     Cuota nuevaCuota = new Cuota(name, doc, tipoAfiliacion);
                                    System.out.println("Aquí tienes tú información");
                                    nuevaCuota.validarCuota();
                                    historialCuotas.add(nuevaCuota);
                                    System.out.println("Datos guardados con éxito...");
                                    System.out.println("");
                                    nuevaCuota.cuotaModeradora();
        
    }

    @Override
    public void mostrarHistorial() {
        if (historialCuotas.isEmpty()) {
            System.out.println("No hay registros recientes.");
        } else {
            System.out.println("\n   Historial de consultas ");
            for (Cuota c : historialCuotas) {
                c.cuotaModeradora(); 
            }
        }
    }
    
}
