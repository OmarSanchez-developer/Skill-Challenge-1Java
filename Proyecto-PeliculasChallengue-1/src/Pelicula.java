
public class Pelicula {
    //Atributos de la Clase Pelicula
    private int idPelicula;
    private String nombre;
    private boolean disponible;


//Constructores
// Constructor vacío por si se requiere instanciar sin datos iniciales
public Pelicula() {
}
//Constructor de Pelicula
    public Pelicula(int idPelicula, String nombre, boolean disponible) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    // --- Métodos Getter y Setter ---
    public int getidPelicula() {
        return idPelicula;
    }
    // Establece un nuevo ID para la película
    public void setidPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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
        return "Pelicula [ID: " + idPelicula + " | Nombre: " + nombre + " | Disponible: " + disponible + "\n";
    }
}