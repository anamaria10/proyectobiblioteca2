package co.edu.um.proyectobiblioteca2.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG<E>  {

    Libro<E>primero;

    public LEG()
    {
        primero = null;
    }

    public void insertarDePrimero(E isbn, E titulo, E fechaPublicacion, E autor)
    {
        Libro<E> aux = buscar(isbn);

        if (aux == null){
            Libro<E> nuevoLibro = new Libro<E>(isbn,titulo,fechaPublicacion,autor);
            nuevoLibro.siguiente = primero;
            primero = nuevoLibro;
            nuevoLibro.numeroEjemplares++;
        } else {
            aux.numeroEjemplares++;
        }
    }

    public void insertarDeUltimo(E isbn,E titulo, E autor, E fechaPublicacion, int numeroEjemplares)
    {
        Libro<E> aux1 = buscar(isbn);

        if (aux1 == null){

            Libro<E> nuevoLibro = new Libro<E>(isbn,titulo,fechaPublicacion,autor);
            Libro<E> aux = primero;

            if (aux == null){
                primero = nuevoLibro;
            } else {
                while (aux.siguiente != null)
                {
                    aux = aux.siguiente;
                }

                aux.siguiente = nuevoLibro;
                nuevoLibro.numeroEjemplares++; //indica que se añadio un nuevo libro
            }
        }    else {
            aux1.numeroEjemplares++;
        }
    }

    public void eliminar(E isbn){
        Libro<E> aux = primero, ant = null;

        while (aux != null && !aux.getIsbn().equals(isbn))
        {
            ant = aux;
            aux = aux.siguiente;
        }

        if (aux != null)
        {
            if (aux.numeroEjemplares != 1){
                aux.numeroEjemplares--;
            } else {
                if (ant == null){
                    primero = aux.siguiente;
                } else {
                    ant.siguiente = aux.siguiente;
                }
            }
        }
    }

    public Libro<E>buscar(E isbn)
    {
        Libro<E> aux = primero;

        while (aux != null && !aux.getIsbn().equals(isbn))
        {
            aux = aux.siguiente;
        }
        return aux;
    }

    public void insertarDespues(E ref, E isbn, E titulo, E fechaPublicacion,E autor, int numeroEjemplares)
    {
        Libro<E> aux1 = buscar(isbn);

        if (aux1 == null){
            Libro<E> nuevoLibro = new Libro<E>(isbn,titulo,autor,fechaPublicacion);
            Libro<E> lib = buscar(ref);

            if (lib.siguiente == null){
                lib.siguiente = nuevoLibro;
            }
            else {
                nuevoLibro.siguiente = lib.siguiente;
                lib.siguiente = nuevoLibro;
            }

            nuevoLibro.numeroEjemplares++;
        } else {
            aux1.numeroEjemplares++;
        }
    }

    public void insertarAntes(E ref ,E isbn, E titulo, E fechaPublicacion, E autor,int numeroEjemplares)
    {
        Libro<E> aux1 = buscar(isbn);

        if (aux1 == null){
            Libro<E> lib =  buscar(ref); //se crea un libro y se busca su referencia

            //llama el isbn, titulo, autor, fechaPublicacion,numeroEjemplares de lib y se asigna un nuevo isbn
            E nvoisbn = lib.getIsbn();
            lib.setIsbn(isbn);

            E nvotitulo = lib.getTitulo();
            lib.setTitulo(titulo);

            E nvoautor = lib.getAutor();
            lib.setAutor(autor);

            E nvaFecha = lib.getFechaPublicacion();
            lib.setFechaPublicacion(fechaPublicacion);

            int nvpEjemplar = lib.getNumeroEjemplares();
            lib.setNumeroEjemplares(numeroEjemplares +1);

            //llamar insertarAntes
            insertarAntes(lib.getIsbn(),nvoisbn,nvotitulo,nvaFecha,nvoautor,nvpEjemplar);
        } else {
            aux1.numeroEjemplares++;
        }
    }

    @Override
    public String toString() {

        String d = "";
        for (Libro<E> aux = primero; aux != null; aux = aux.siguiente)
        {
            d = aux.getIsbn().toString() + "\n" + aux.getTitulo().toString() + "\t" + aux.getAutor().toString() + "\t" + aux.getFechaPublicacion().toString() + "\t" + aux.getNumeroEjemplares() + "\t";
        }
        return d;
    }

    public String datos()
    {
        String d = "";
        for (Libro<E> aux = primero; aux != null; aux = aux.siguiente)
        {
            d = aux.getIsbn().toString() + "\t" + aux.getTitulo().toString() + "\n" ;
        }
        return d;


    }

    public void modificar(E ref, E isbn, E titulo, E fechaPublicacion, E autor)
    {

        Libro<E> librito= buscar(ref);


        if(isbn.toString().length() != 0)
        {
            librito.setIsbn(isbn);
        }
}
}
