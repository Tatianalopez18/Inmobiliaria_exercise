package models;

public abstract class Inmueble {
    private final String id;
    private final double area;
    private final String direccion;

    public Inmueble(String id, double area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Área: " + area + " m²");
        System.out.println("Dirección: " + direccion);
    }
}
