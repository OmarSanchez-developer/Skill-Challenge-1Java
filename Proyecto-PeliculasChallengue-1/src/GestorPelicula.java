//package com.methaporce.modelo; // Paquete para las clases del modelo
import java.util.ArrayList; // Importación necesaria para usar listas dinámicas
import java.util.List; // Importación de la interfaz List

// Clase encargada de gestionar la colección de películas
public class GestorPelicula {

        // Colección (lista) que almacenará los objetos de tipo Pelicula
        private List<Pelicula> pelicula;

        // Constructor que inicializa el gestor creando una lista vacía
        public GestorPelicula() {
            this.pelicula = new ArrayList<>();
        }
    // Método que recibe un objeto Pelicula y lo añade a la colección
        public void agregarPelicula(Pelicula pelicula) {
            this.pelicula.add(pelicula);
        }

        // Método que elimina una película de la colección basándose en su ID
        public void eliminarPelicula(int idPelicula) {
            // Usamos removeIf con una función lambda para buscar y eliminar la coincidencia del ID
          this.pelicula.removeIf(pelicula -> pelicula.getidPelicula() == idPelicula);
        }

        // Método que devuelve la lista completa de todas las películas
        public List<Pelicula> obtenerPelicula() {
            return this.pelicula;
        }

        // Método que filtra y devuelve solo las películas que están disponibles
        public List<Pelicula> obtenerPeliculaDisponibles() {
            // Creamos una lista temporal para guardar los resultados
            List<Pelicula> disponibles = new ArrayList<>();
            // Recorremos la colección principal
            for (Pelicula pelicula : this.pelicula) {
                // Si la película está disponible, la añadimos a la lista temporal
                if (pelicula.isDisponible()) {
                    disponibles.add(pelicula);
                }
            }
            return disponibles; // Retornamos la lista filtrada
        }

        // Método que filtra y devuelve solo las películas que NO están disponibles
        public List<Pelicula> obtenerPeliculaNoDisponibles() {
            // Creamos una lista temporal para guardar los resultados
            List<Pelicula> noDisponibles = new ArrayList<>();
            // Recorremos la colección principal
            for (Pelicula pelicula : this.pelicula) {
                // Si la película NO está disponible (!), la añadimos a la lista
                if (!pelicula.isDisponible()) {
                    noDisponibles.add(pelicula);
                }
            }
            return noDisponibles; // Retornamos la lista filtrada
        }
        // Método que busca una película por su ID y cambia su estado a disponible (true)
        public void marcarPeliculaComoDisponible(int idPelicula) {
            // Recorremos la colección
            for (Pelicula pelicula : this.pelicula) {
                // Si el ID coincide con el buscado
                if (pelicula.getidPelicula() == idPelicula) {
                    // Cambiamos el estado a true
                    pelicula.setDisponible(true);
                    break; // Terminamos el ciclo porque ya encontramos y actualizamos la película
                }
            }
        }

}//Cierre Clase
