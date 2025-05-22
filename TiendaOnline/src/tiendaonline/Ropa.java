package tiendaonline;

public class Ropa extends Producto{

    public Ropa(String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        //10% descuento
        return precioBase * 0.90;
    }
    
}
