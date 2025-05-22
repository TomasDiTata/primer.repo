package tallermecanico;

public class Auto extends Vehiculo implements Reparable{

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reparar() {
        System.out.println("El auto " + marca + " "+  modelo + " se esta reparando...");
    }
        
}
