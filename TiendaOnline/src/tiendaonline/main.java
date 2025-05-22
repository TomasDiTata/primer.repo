package tiendaonline;

public class main {

    public static void main(String[] args) {
        Producto heladera = new Electrodomestico("Heladera", 100000, "Samsung");
        Producto remera = new Ropa("Remera", 8000, "Nike");
        Producto lavarropas = new Electrodomestico("Lavarropas", 150000, "LG");

        // Crear carrito y agregar productos
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(heladera);
        carrito.agregarProducto(remera);
        carrito.agregarProducto(lavarropas);

        carrito.mostrarProductos();

        System.out.println("Total de la compra: $" + carrito.calcularTotal());
    }
    }
    
