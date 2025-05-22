package sistemadecurso;

public class Curso {
    private String nombre;
    private int duracion;

    public Curso(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDuracion(){
        return duracion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Duracion: " + duracion;
    }
    
    
    
}
