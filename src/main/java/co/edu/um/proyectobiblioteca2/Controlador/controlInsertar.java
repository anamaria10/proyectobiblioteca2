package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/08/13
 * Time: 03:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlInsertar {

    LEG nvalista = new LEG();

    /**
     * permite el control del metodo de insertar un libro antes de un libro dado
     * @param isbnRef el isbn del nodo de referencia de donde se pondra antes del mismo un nuevo libro
     * @param isbn codigo del libro
     * @param titulo titulo del libro
     * @param autor autor del libro ingresado
     * @param fecha fecha de publicacion del libro
     */
    public void insertarAntesVentana(String isbnRef, String isbn,String titulo, String autor, String fecha){
        nvalista.insertarAntes(isbnRef,isbn,titulo,fecha,autor,1);
    }

    /**
     * permite el control del metodo de insertar un libro depues de un libro dado
     * @param isbnRef el isbn del nodo de referencia de donde se pondra despues del mismo un nuevo libro
     * @param isbn codigo del libro
     * @param titulo titulo del libro
     * @param autor autor del libro ingresado
     * @param fecha fecha de publicacion del libro
     */
    public void insertarDespuesVentana(String isbnRef, String isbn,String titulo, String autor, String fecha){
        nvalista.insertarDespues(isbnRef,isbn,titulo,fecha,autor,1);
    }


    /**
     * Controlador del metodo de insertar libro al prinicipio de la lista
     * @param isbn codigo del libro
     * @param titulo titulo del libro
     * @param autor autor del libro ingresado
     * @param fecha fecha de publicacion del libro
     */
    public void insertarInicioVentana(String isbn,String titulo, String autor, String fecha){
        nvalista.insertarDePrimero(isbn,titulo,autor,fecha);
    }

    /**
     * Controlador del metodo de insertar libro al final de la lista
     * @param isbn codigo del libro
     * @param titulo titulo del libro
     * @param autor autor del libro ingresado
     * @param fecha fecha de publicacion del libro
     */
    public void insertarFinalVentana(String isbn,String titulo, String autor, String fecha){
        nvalista.insertarDeUltimo(isbn,titulo,autor,fecha,1);
}
}






