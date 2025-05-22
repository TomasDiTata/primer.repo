package biblioteca;

public abstract class MaterialBiblioteca {
    public String titulo;
    public String autor;
    public int anioPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    //Metodo y clase abstracta para obligar a las demas clases a usar este metodo
    public abstract void mostrarInfo();
    
}
