package biblioteca;

public class Revista extends MaterialBiblioteca {
    private int numEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numEdicion = numEdicion;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Revista: \nTitulo: " + titulo + "\nAutor: " + autor + "\nAnio publicacion: " + anioPublicacion + "\nNumero de edicion: "+ numEdicion);
    }
}
