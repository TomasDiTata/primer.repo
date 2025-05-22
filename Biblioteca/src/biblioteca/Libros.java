package biblioteca;


public class Libros extends MaterialBiblioteca {
    private String isbn;
    
    public Libros(String titulo, String autor, int anioPublicacion, String isbn) {
        super(titulo, autor, anioPublicacion);
        this.isbn = isbn;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Libro: \n Titulo: " + titulo + "\nAutor: " + autor + "\nAnio publicacion: " + anioPublicacion + "\nISBN: " + isbn);
    }
}
