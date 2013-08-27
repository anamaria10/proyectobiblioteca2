package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/08/13
 * Time: 08:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlLlenar {

    LEG nvalista = new LEG();

    public controlLlenar(LEG lista){
        this.nvalista = lista;
    }

    public String llenarInformacionLibros(){
        return nvalista.datos();
    }

}
