package tiendaonline;

public class Electrodomestico extends Producto{

    public Electrodomestico(String nombre, int precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        //21% de IVA
        return precioBase * 1.21;
    }
    
}
