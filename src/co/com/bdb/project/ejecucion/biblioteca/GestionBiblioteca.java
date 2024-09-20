package co.com.bdb.project.ejecucion.biblioteca;

public class GestionBiblioteca {

    public static void main(String[] args){

        //Objetos
        Libro libroUno = new Libro("Los juegos del hambre","Suzanne Collins", 320, 2008);
        Libro libroDos = new Libro("100 años de soledad","Gabriel Garcia Marquez", 560, 1967);
        Libro libroTres = new Libro("El Principito","Antoine de Saint-Exupéry", 120, 1943);

        System.out.println("Datos de los libros ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("LIBRO 1 ");
        libroUno.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");


        libroUno.setTitulo("Los juegos del hambre Segunda edición");
        libroUno.setAutor("Suzanne Collins");
        libroUno.setNumero_paginas(480);
        libroUno.setPublicacion(2015);
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("ACTUALIZANDO INFORMACION LIBRO 1");
        System.out.println("Titulo: " + libroUno.getTitulo());
        System.out.println("Autor: " + libroUno.getAutor());
        System.out.println("Numero de paginas: " + libroUno.getNumero_paginas());
        System.out.println("Año de publicacion: " + libroUno.getPublicacion());
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("                                                   ");
        System.out.println("LIBRO 2 ");
        System.out.println("                                                   ");
        libroDos.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");
        System.out.println("LIBRO 3 ");
        System.out.println("                                                   ");
        libroTres.mostrarDatosLibros();
        System.out.println("                                                   ");
        System.out.println("-------------------------------------------------- ");




    }
}
