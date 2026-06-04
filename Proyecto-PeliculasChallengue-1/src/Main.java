//package com.methaporce.vista;
//package com.methaporce.modelo;

void main() {
    ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    Pelicula pelicula1 = new Pelicula(001,"La Novia de Chuky",true);
    Pelicula pelicula2 = new Pelicula(002,"Resident_Evil8",true);
    Pelicula pelicula3 = new Pelicula(003,"Somos Como ninos 2",false);
    Pelicula pelicula4 = new Pelicula(004,"Scary Movie",true);

    listaPelicula.add(pelicula1);
    listaPelicula.add(pelicula2);
    listaPelicula.add(pelicula3);
    listaPelicula.add(pelicula4);
    System.out.println (listaPelicula);
    System.out.println(pelicula1.getnombre());

    //System.out.println("nombre el indice 2 -"+ listaPelicula.set(1).getId_Pelicula());
    //System.out.println("Pelicula disponibles son:" + listaPelicula.get(1).isDisponible());
    //Añadir Pelicula al Gestor de Pelicula

    //Eliminar Pelicula
     //listaPelicula.remove(pelicula2);
    //Marcar una película como activa.
     //listaPelicula.true(pelicula2);
    //Mostrar la lista de Pelicula no disponibles
    //listaPelicula.set(listaPelicula);
}
