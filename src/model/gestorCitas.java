package model;
import java.util.ArrayList;

public class GestorCitas {
   
    private ArrayList<Cita> listaCitas;
     
    public GestorCitas(){
        listaCitas= new ArrayList<>();
    }

   public void agregarCita(Cita cita) {
    listaCitas.add(cita);
    System.out.println("Cita agregada correctamente.");
}
public void mostrarCitas() {
    if (listaCitas.isEmpty()) {
        System.out.println("No hay citas registradas.");
    } else {
        for (Cita cita : listaCitas) {
            System.out.println(cita);
        }
    }
}
}
