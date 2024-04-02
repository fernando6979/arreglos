package gestionF1;
/**
 * La clase Main es la clase principal del programa, que contiene el metodo main para iniciar la aplicacion.
 * @since 1.0
 * @version 1.0
 * @author Ayman
 */
public class Main {
    /**
     * El metodo principal que inicia la aplicacion.
     * @param args Los argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        // Crear equipos
        Equipo redBull = new Equipo("Red Bull", "Honda");
        Equipo mercedes = new Equipo("Mercedes", "Mercedes");
        // Agregar pilotos a los equipos
        redBull.agregarPiloto(new Piloto("Max Verstappen", 33, "Países Bajos"));
        redBull.agregarPiloto(new Piloto("Sergio Perez", 11, "México"));
        mercedes.agregarPiloto(new Piloto("Lewis Hamilton", 44, "Reino Unido"));
        mercedes.agregarPiloto(new Piloto("George Russell", 63, "Reino Unido"));
        // Imprimir información de los equipos y pilotos
        System.out.println("Equipo: " + redBull.getNombre());
        for (Piloto piloto : redBull.getPilotos()) {
            System.out.println(" - Piloto: " + piloto.getNombre() + ", Número de carrera: " + piloto.getNumeroCarrera() + ", País: " + piloto.getPais());
        }
        System.out.println("Equipo: " + mercedes.getNombre());
        for (Piloto piloto : mercedes.getPilotos()) {
            System.out.println(" - Piloto: " + piloto.getNombre() + ", Número de carrera: " + piloto.getNumeroCarrera() + ", País: " + piloto.getPais());
        }
    }
}