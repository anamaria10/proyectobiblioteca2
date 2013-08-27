package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;
import co.edu.um.proyectobiblioteca2.Vista.adicionar;
import co.edu.um.proyectobiblioteca2.Vista.consultar;
import co.edu.um.proyectobiblioteca2.Vista.eliminar;
import co.edu.um.proyectobiblioteca2.Vista.ventana2;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/08/13
 * Time: 03:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class controlvista  {

    //Objeto de la Clase LEG
    LEG<String> Lista;


    //Constructor
    public controlvista(LEG<String> lista) {

        Lista=lista;
    }




    public void VentanaInsertar()
    {
        adicionar ven= new adicionar(Lista);
        ven.setVisible(true);

    }

    public void VentanaConsultar()
    {

        consultar con = new consultar(Lista);
        con.setVisible(true);

    }


    public void VentanaEliminar()
    {


        eliminar ven = new eliminar(Lista);
        ven.setVisible(true);

    }


    public void cerrarVentana()
    {
        ventana2 p=new ventana2(Lista);
        p.show();
    }

}
