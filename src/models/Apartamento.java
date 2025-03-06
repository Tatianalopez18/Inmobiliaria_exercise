package models;

public class Apartamento extends InmuebleVivienda {
    private final boolean enAdministracion;

    public Apartamento(String id, double area, String direccion, int habitaciones, int banos, boolean enAdministracion) {
        super(id, area, direccion, habitaciones, banos);
        this.enAdministracion = enAdministracion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("En administración: " + (enAdministracion ? "Sí" : "No"));
    }
}
