package services;

import models.Inmueble;
import java.util.ArrayList;
import java.util.List;

public class GestorInmuebles {
    private final List<Inmueble> inmuebles = new ArrayList<>();

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    public void mostrarTodos() {
        for (Inmueble inmueble : inmuebles) {
            inmueble.mostrarInformacion();
            System.out.println("------------------------");
        }
    }
}
