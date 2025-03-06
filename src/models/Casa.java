package models;

public class Casa extends InmuebleVivienda {
    private final boolean tieneJardin;

    public Casa(String id, double area, String direccion, int habitaciones, int banos, boolean tieneJardin) {
        super(id, area, direccion, habitaciones, banos);
        this.tieneJardin = tieneJardin;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene jardín: " + (tieneJardin ? "Sí" : "No"));
    }
}
