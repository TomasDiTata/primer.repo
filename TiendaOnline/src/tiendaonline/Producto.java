package tiendaonline;

public abstract class Producto implements vendible{
    protected String nombre;
    protected double precioBase;
    protected String marca;

    public Producto(String nombre, double precioBase, String marca) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getMarca() {
        return marca;
    }
}
