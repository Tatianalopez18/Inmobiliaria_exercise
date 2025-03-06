package models;

public class LocalComercial extends Inmueble {
    private final String tipoNegocio;

    public LocalComercial(String id, double area, String direccion, String tipoNegocio) {
        super(id, area, direccion);
        this.tipoNegocio = tipoNegocio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de negocio: " + tipoNegocio);
    }
}
