package co.com.bdb.project.ejecucion.biblioteca;

public class Libro {

    String titulo;
    String autor;
    int numero_paginas;
    int publicacion;

    public Libro(String titulo, String autor, int numero_paginas, int publicacion){

        // I
        this.titulo=titulo;
        this.autor=autor;
        this.numero_paginas=numero_paginas;
        this.publicacion= publicacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    public void mostrarDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numero_paginas);
        System.out.println("Publicacion: " + publicacion);

    }

}
