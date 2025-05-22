package biblioteca;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> material = new ArrayList<>();

        //Agregar materiales
        material.add(new Libros("El Senior de los Anillos", "J.R.R. Tolkien", 1954, "978-84-450-7255-3"));
        material.add(new Revista("National Geographic", "Varios", 2022, 157));
        material.add(new DVD("Terminator", "James Cameron y Gale Anne Hurd William", 1984, 108));

        // Mostrar información usando polimorfismo
        for (MaterialBiblioteca materiales : material) {
            materiales.mostrarInfo();
        }

    }
}