
public class Pelicula {
    //Atributos de la Clase Pelicula
    private int id_pelicula;
    private String nombre;
    private boolean disponible;


//Constructores
// Constructor vacío por si se requiere instanciar sin datos iniciales
public Pelicula() {
}
//Constructor de Pelicula
    public Pelicula(int id_pelicula, String nombre, boolean disponible) {
        this.id_pelicula = id_pelicula;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    // --- Métodos Getter y Setter ---
    public int getId_pelicula() {
        return id_pelicula;
    }
    // Establece un nuevo ID para la película
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }
    // Devuelve el nombre de la película
    public String getnombre() {
        return nombre;
    }
    // Establece un nuevo nombre para la película
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Devuelve el estado de disponibilidad
    public boolean isDisponible() {
        return disponible;
    }
    // Cambia el estado de disponibilidad de la película
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    // Método sobreescrito para imprimir la información de la película en formato de texto
    @Override
    public String toString() {
        return "Pelicula [ID: " + id_pelicula + " | Nombre: " + nombre + " | Disponible: " + disponible + "\n";
    }
}