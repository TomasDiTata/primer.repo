package biblioteca;

public class DVD extends MaterialBiblioteca {
    private int duracionMin;

    public DVD(String titulo, String autor, int anioPublicacion, int duracionMin) {
        super(titulo, autor, anioPublicacion);
        this.duracionMin = duracionMin;
    }
    
    @Override
    public void mostrarInfo(){
      System.out.println("DVD: \nTitulo: " + titulo + "\nAutor: " + autor + "\nAnio publicacion: " + anioPublicacion + "\nDuracion en min: "+ duracionMin);
    }
}
