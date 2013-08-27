package co.edu.um.proyectobiblioteca2.Controlador;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;
import co.edu.um.proyectobiblioteca2.Vista.ventana2;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ControladorMain {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        LEG nvalis= new LEG();

        nvalis.insertarDePrimero("09865", "Los Pilares de la Tierra", "19/11/2012", "Ken Follett");
        nvalis.insertarDePrimero("09464", "Cien años de soledad", "09/09/2011/", "Gabriel García Márquez");
        nvalis.insertarDePrimero("09456", "Harry Potter ", "08/072011", "J.K. Rowling");
        nvalis.insertarDePrimero("08963", "El Perfume ", "23/04/2000", "Patrick Süskind");

        ventana2 ven= new ventana2(nvalis);
        ven.setVisible(true);



    }
}
