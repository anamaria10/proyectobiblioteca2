package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;
import co.edu.um.proyectobiblioteca2.Modelo.Libro;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/08/13
 * Time: 03:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlConsultar {

    LEG nvalista= new LEG();

    public controlConsultar(LEG lista) {
        this.nvalista = lista;
    }

    public String[] consultaVentana(String ref)
    {
        String infoLibro[]=new String[5]; //posiciones
        Libro lib=nvalista.buscar(ref);

        infoLibro[0] = lib.getIsbn().toString();
        infoLibro[1] = lib.getTitulo().toString();
        infoLibro[2] = lib.getAutor().toString();
        infoLibro[3] = lib.getFechaPublicacion().toString();
        infoLibro[4] = String.valueOf(lib.getNumeroEjemplares());

        return infoLibro;
    }
}

