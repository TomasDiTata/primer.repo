package sistemadecurso;

public class Estudiante extends Persona{
    
    private String legajo;
    private Curso curso;
    
    public Estudiante(String nombre, String apellido, int dni, String legajo, Curso curso) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.curso = curso;
    }
    
    public void mostrarInfo(){
        System.out.println("Estudiante: \nNombre: "+ nombre + "\n Apellido: "+ apellido + "\nDni: " + dni + "\nLegajo: "+ legajo + "\nCurso: " + curso);
    }
    
}
