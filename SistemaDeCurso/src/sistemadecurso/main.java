package sistemadecurso;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
         // Crear cursos
        Curso cursoJava = new Curso("Programacion", 6);
        Curso cursoMatematica = new Curso("Analisis Matematico", 4);
        Curso cursoFisica = new Curso("Fisica", 3);
        
         // Crear estudiantes
        Estudiante est1 = new Estudiante("Lucia", "Gomez", 12345678, "A001", cursoJava);
        Estudiante est2 = new Estudiante("Carlos", "Perez", 23456789, "A002", cursoMatematica);
        Estudiante est3 = new Estudiante("Sofia", "Martinez", 34567890, "A003", cursoFisica);

        // Lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
        }
        
    }
    
}
