package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Entrada implements Runnable {

    //Variables
    private char numpuerta;
    private int grupos = 0;
    private int capacidad;
    private JTextArea jta;
    private JTextArea jtaForo;
    
    private Foro f1;

    //Constructor
    public Entrada(char numpuerta, Foro f1, JTextArea jta,JTextArea jtaForo) {
        super();
        this.numpuerta = numpuerta;
        this.f1 = f1;
        this.jtaForo = jtaForo;
        this.jta = jta;
    }

    //Getter's & Setter's
    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Foro getF1() {
        return f1;
    }

    public void setF1(Foro f1) {
        this.f1 = f1;
    }

    public char getNumpuerta() {
        return numpuerta;
    }

    public void setNumpuerta(char numpuerta) {
        this.numpuerta = numpuerta;
    }

    //Metodos
    @Override
    public void run() {
        Ingresar();
        
        
        
    }

    public void Ingresar() {
        int cap = f1.getCapacidad();
        int ed = f1.getEspaciosDisponibles();
        while (ed < cap) {
            
            f1.setEspaciosDisponibles(f1.getEspaciosDisponibles() + 20);
            //ed = f1.getEspaciosDisponibles();
            jta.append("Grupo " + numpuerta + "-" + (grupos + 1) + " ingreso. Capacidad:" + f1.getEspaciosDisponibles() + "/" + f1.getCapacidad() + "\n");
            //System.out.println("Grupo " + numpuerta + "-" + (grupos + 1) + " ingreso. Capacidad:" + f1.getEspaciosDisponibles() + "/" + f1.getCapacidad() + "\n");
            grupos += 1;
            jtaForo.append(" ███ ");
            if((f1.getEspaciosDisponibles()%100) == 0){
                jtaForo.append("\n");
            }
            try {
                Thread.sleep((int) (Math.random()*100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ed = f1.getEspaciosDisponibles();
            
        }
        jta.append("Foro lleno, " + grupos + " grupos entraron por la puerta " + numpuerta + "."+ "\n");
    }

}
