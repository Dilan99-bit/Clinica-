 package model;

import java.util.ArrayList;
import java.util.List;

public class GestorConsultorio {

   private List<Consultorio> listaConsultorios = new ArrayList<>();

    public GestorConsultorio(){
        
    }
    public void registrarConsultorio(Consultorio  c){
        listaConsultorios.add(c);
        System.out.println("CONSULTORIOS NUEVOS");
        System.out.println("================    ============  ==============");
        System.out.println("El consultorio es :"+ c.getNumConsultorio());
        System.out.println("El piso del consultorio es : " + c.getPisoConsultorio());
        System.out.println("El estado del consultorio es :" + c.getEstado());
        System.out.println("Registro con exito");
        System.out.println("=========   ============     ===============");
    }
    public void mostrarConsultorios(){
        if(listaConsultorios.isEmpty()){
            System.out.println("no hay consultorios Registrados todavia");
        }else{
            System.out.println("Lista de Consultorios Registrados");
            for(Consultorio c : listaConsultorios){
                System.out.println(c.toString());
            }
        }
    }
    
}
