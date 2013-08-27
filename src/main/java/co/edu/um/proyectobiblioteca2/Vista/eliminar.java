package co.edu.um.proyectobiblioteca2.Vista;

import co.edu.um.proyectobiblioteca2.Controlador.controlEliminar;
import co.edu.um.proyectobiblioteca2.Controlador.controlModificar;
import co.edu.um.proyectobiblioteca2.Controlador.controlvista;
import co.edu.um.proyectobiblioteca2.Modelo.LEG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/08/13
 * Time: 07:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class eliminar extends JFrame implements ActionListener {

    LEG <String> Lista;

    private JTextField isbn;
    private JLabel lblisbn, tituolEliminar;
    private JButton aceptarEliminar, cancelarEliminar;

    public eliminar(LEG<String> lista){

        Lista = lista;

        setLayout(null);
        setTitle("Eliminar un Libro");
        setLocation(200,200);
        setSize(400,400);
        getContentPane().setBackground(new Color(32, 211, 255));

        isbn = new JTextField();
        lblisbn = new JLabel("ISBN");
        tituolEliminar = new JLabel("ELIMINAR UN LIBRO");
        tituolEliminar.setFont(new java.awt.Font("Segoe Print", 1, 20));
        aceptarEliminar = new JButton("Aceptar");
        cancelarEliminar = new JButton("Cancelar");

        isbn.setBounds(110,150,100,40);
        lblisbn.setBounds(50,150,100,40);
        tituolEliminar.setBounds(40,20,250,80);
        aceptarEliminar.setBounds(100,250,100,40);
        cancelarEliminar.setBounds(230,250,100,40);

        add(isbn);
        add(lblisbn);
        add(tituolEliminar);
        add(aceptarEliminar);
        add(cancelarEliminar);

        aceptarEliminar.addActionListener(this);
        cancelarEliminar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==cancelarEliminar)
        {
            controlvista ctr = new controlvista(Lista);
            ctr.cerrarVentana();
            this.setVisible(false);
        }

        if (e.getSource()==aceptarEliminar)
        {
            String ref = lblisbn.getText();

            if (ref.length() !=0)
            {
                controlModificar mod = new controlModificar(Lista);

                if (mod.ListaVentana(ref) == "aceptar"){
                    controlEliminar eli = new controlEliminar(Lista);
                    eli.eliminar(ref);
                    controlvista vis = new controlvista(Lista);
                    vis.cerrarVentana();
                    this.setVisible(true);
                }

            }
        }

    }
}
