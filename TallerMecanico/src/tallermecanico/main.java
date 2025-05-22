package tallermecanico;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Reparable> aym = new ArrayList<>();
        Reparable auto1 = new Auto("Ford", "Focus");
        Reparable auto2 = new Auto("Chevrolet", "Cruze");
        Reparable moto1 = new Moto("Yamaha", "FZ");
        Reparable moto2 = new Moto("Honda", "CBR");

        // Lista de reparables
        ArrayList<Reparable> reparables = new ArrayList<>();
        reparables.add(auto1);
        reparables.add(auto2);
        reparables.add(moto1);
        reparables.add(moto2);

        // Reparar todos (polimorfismo)
        for (Reparable r : reparables) {
            r.reparar();
        }
    }
}
