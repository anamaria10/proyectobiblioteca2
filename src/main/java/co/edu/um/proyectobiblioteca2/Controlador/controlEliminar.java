package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/08/13
 * Time: 09:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlEliminar {

    LEG nvalista = new LEG();

    public controlEliminar(LEG lista){
        this.nvalista = lista;
    }

    public void eliminar(String isbn){
        nvalista.eliminar(isbn);
    }
}
