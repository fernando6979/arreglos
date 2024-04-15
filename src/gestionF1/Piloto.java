package gestionF1;

/**
 * La clase Piloto representa un piloto de Formula 1.
 * @since 1.0
 * @version 1.0
 * @author Ayman
 */
public class Piloto {
    private String nombre;
    private int numeroCarrera;
    private String pais;

    /**
     * Constructor de la clase Piloto.
     *
     * @param nombre        El nombre del piloto.
     * @param numeroCarrera El numero de carrera del piloto.
     * @param pais          El pais del piloto.
     */
    public Piloto(String nombre, int numeroCarrera, String pais) {
        this.nombre = nombre;
        this.numeroCarrera = numeroCarrera;
        this.pais = pais;
    }

    /**
     * Obtiene el nombre del piloto.
     * @return El nombre del piloto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el numero de carrera del piloto.
     * @return El numero de carrera del piloto.
     */
    public int getNumeroCarrera() {
        return numeroCarrera;
    }

    /**
     * Obtiene el pais del piloto.
     * @return El pais del piloto.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Cambia la nacionalidad del piloto.
     *
     * @param nuevo que cambia la nacionalidad de la persona.
     * @return la nueva nacionalidad del piloto.
     */
    public String setPais(String nuevo) {
        this.pais = nuevo;
        return nuevo;
    }
}
