package main;

import models.Apartamento;
import models.LocalComercial;
import services.GestorInmuebles;

public class Main {
    public static void main(String[] args) {
        GestorInmuebles gestor = new GestorInmuebles();

        Apartamento apto1 = new Apartamento("A1", 80.5, "Calle 123", 3, 2, true);
        LocalComercial local1 = new LocalComercial("L1", 150, "Avenida 456", "Restaurante");

        gestor.agregarInmueble(apto1);
        gestor.agregarInmueble(local1);

        gestor.mostrarTodos();
    }
}
