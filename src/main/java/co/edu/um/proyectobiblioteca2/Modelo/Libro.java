package co.edu.um.proyectobiblioteca2.Modelo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Libro<E> {

    //atributos
    private E isbn;
    private E titulo;
    private E autor;
    private E fechaPublicacion;
    int numeroEjemplares;

    Libro siguiente;

    //constructores
    public Libro(E isbn, E titulo, E autor, E fechaPublicacion, Libro<E>siguiente) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroEjemplares = 0;
        this.siguiente = siguiente;
    }

    public Libro(E isbn, E titulo, E fechaPublicacion, E autor){
        this(isbn,titulo,fechaPublicacion,autor,null);
    }

    //set y get
    public E getIsbn() {
        return isbn;
    }

    public void setIsbn(E isbn) {
        this.isbn = isbn;
    }

    public E getTitulo() {
        return titulo;
    }

    public void setTitulo( E titulo) {
        this.titulo = titulo;
    }

    public E getAutor() {
        return autor;
    }

    public void setAutor(E autor) {
        this.autor = autor;
    }

    public E getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion( E fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    @Override
    public String toString() {
        return "[" + isbn  + "]: " + titulo ;
    }
}
