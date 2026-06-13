//package com.methaporce.vista;
//package com.methaporce.modelo;

void main() {
    //ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    GestorPelicula pelicula = new GestorPelicula();
    Pelicula pelicula1 = new Pelicula(001, "La Novia de Chuky", true);
    Pelicula pelicula2 = new Pelicula(002, "Resident_Evil8", true);
    Pelicula pelicula3 = new Pelicula(003, "Somos Como ninos 2", false);
    Pelicula pelicula4 = new Pelicula(004, "Scary Movie", true);

    //Agrega Peliculas del método de Gestor de peliculas para agregar Peliculas 1- 4.
    pelicula.agregarPelicula(pelicula1);
    pelicula.agregarPelicula(pelicula2);
    pelicula.agregarPelicula(pelicula3);
    pelicula.agregarPelicula(pelicula4);

    //Imprime y obtiene las Todas Peliculas
    System.out.println("Las peliculas son:" + pelicula.obtenerPelicula());
    //Imprime y obtiene solo la lista de Peliculas Disponibles
    System.out.println("Las peliculas disponibles son:" + pelicula.obtenerPeliculaDisponibles());
    //Imprime y obtiene solo la lista de Peliculas No Disponibles
    System.out.println("Las peliculas no disponibles son:" + pelicula.obtenerPeliculaNoDisponibles());

    //Eliminar Peliculas
    pelicula.eliminarPelicula(1);
    pelicula.eliminarPelicula(2);
    //Imprime y obtiene solo Toda la lista de Peliculas Actualizadas
    System.out.println("Las peliculas Actualizadas son:" + pelicula.obtenerPelicula());

}
