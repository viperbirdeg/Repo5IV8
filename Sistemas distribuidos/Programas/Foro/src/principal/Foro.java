package principal;

public class Foro {

    //Variables
    private int espaciosDisponibles;
    private int capacidad;
    
    //Constructor
    public Foro(int capacidad) {
        super();
        this.capacidad = capacidad;
    }

    //get and set
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }

}
