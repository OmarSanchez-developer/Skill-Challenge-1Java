//package com.methaporce.modelo; // Paquete para las clases del modelo
import java.util.ArrayList; // Importación necesaria para usar listas dinámicas
import java.util.List; // Importación de la interfaz List

// Clase encargada de gestionar la colección de películas
public class GestorPeliculas {

        // Colección (lista) que almacenará los objetos de tipo Pelicula
        private List<Pelicula> peliculas;

        // Constructor que inicializa el gestor creando una lista vacía
        public GestorPeliculas() {
            this.peliculas = new ArrayList<>();
        }
    // Método que recibe un objeto Pelicula y lo añade a la colección
        public void agregarPelicula(Pelicula pelicula) {
            this.peliculas.add(pelicula);
        }

        // Método que elimina una película de la colección basándose en su ID
        public void eliminarPelicula(int id_pelicula) {
            // Usamos removeIf con una función lambda para buscar y eliminar la coincidencia del ID
            this.peliculas.removeIf(pelicula -> pelicula.getId_pelicula() == GestorPeliculas);
        }

        // Método que devuelve la lista completa de todas las películas
        public List<Pelicula> obtenerPeliculas() {
            return this.peliculas;
        }

        // Método que filtra y devuelve solo las películas que están disponibles
        public List<Pelicula> obtenerPeliculasDisponibles() {
            // Creamos una lista temporal para guardar los resultados
            List<Pelicula> disponibles = new ArrayList<>();
            // Recorremos la colección principal
            for (Pelicula pelicula : this.peliculas) {
                // Si la película está disponible, la añadimos a la lista temporal
                if (pelicula.isDisponible()) {
                    disponibles.add(pelicula);
                }
            }
            return disponibles; // Retornamos la lista filtrada
        }

        // Método que filtra y devuelve solo las películas que NO están disponibles
        public List<Pelicula> obtenerPeliculasNoDisponibles() {
            // Creamos una lista temporal para guardar los resultados
            List<Pelicula> noDisponibles = new ArrayList<>();
            // Recorremos la colección principal
            for (Pelicula pelicula : this.peliculas) {
                // Si la película NO está disponible (!), la añadimos a la lista
                if (!pelicula.isDisponible()) {
                    noDisponibles.add(peliculas);
                }
            }
            return noDisponibles; // Retornamos la lista filtrada
        }
        // Método que busca una película por su ID y cambia su estado a disponible (true)
        public void marcarPeliculaComoDisponible(int id_peliculas) {
            // Recorremos la colección
            for (Pelicula pelicula : this.peliculas) {
                // Si el ID coincide con el buscado
                if (peliculas.geId_pelicula() == id_peliculas) {
                    // Cambiamos el estado a true
                    pelicula.setDisponible(true);
                    break; // Terminamos el ciclo porque ya encontramos y actualizamos la película
                }
            }
        }

}//Cierre Clase
