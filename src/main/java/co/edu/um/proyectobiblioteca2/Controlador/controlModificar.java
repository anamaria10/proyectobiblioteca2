package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/08/13
 * Time: 09:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlModificar {

    //Se define un objeto lista de la clase listaBiblioteca.
    LEG nvalista= new LEG();

    public controlModificar(LEG lista) {
        this.nvalista = lista;
    }


    public String ListaVentana(String isbnref)
    {
        String error= "error";
        String aceptar="aceptar";

        if(nvalista.buscar(isbnref)!=null){
            return aceptar;
        }else
        {
            return error;
        }

    }


    public void  modificarListaVentana(String isbnref, String isbn,String titulo, String fecha, String autor){

        nvalista.modificar(isbnref,isbn,titulo,fecha,autor);

    }
}
