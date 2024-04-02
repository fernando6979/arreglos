package gestionF1;
import java.util.ArrayList;
/**
 * La clase Equipo representa un equipo de Formula 1, que contiene una lista de pilotos.
 * @since 1.0
 * @version 1.0
 * @author Ayman
 */
public class Equipo {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    private String motor;
    private ArrayList<Piloto> pilotos;

    /**
     * Constructor de la clase Equipo.
     *
     * @param nombre El nombre del equipo.
     * @param motor  El fabricante del motor del equipo.
     */
    public Equipo(String nombre, String motor) {
        this.nombre = nombre;
        this.motor = motor;
        this.pilotos = new ArrayList<>();
    }

    /**
     * Agrega un piloto al equipo.
     * @param piloto El piloto que se va a agregar al equipo.
     */
    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    /**
     * Obtiene la lista de pilotos del equipo.
     * @return La lista de pilotos del equipo.
     */
    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }
}