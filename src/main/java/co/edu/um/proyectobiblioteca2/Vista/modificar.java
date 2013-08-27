package co.edu.um.proyectobiblioteca2.Vista;

import co.edu.um.proyectobiblioteca2.Modelo.LEG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 26/08/13
 * Time: 09:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class modificar extends JFrame implements ActionListener {

    LEG<String> Lista;

    private JTextField isbn;
    private JLabel lblisbn, tituolModificar;
    private JButton aceptarModificar, cancelarModificar;

    public modificar(LEG<String> lista){

        Lista = lista;

        setLayout(null);
        setTitle("Eliminar un Libro");
        setLocation(200,200);
        setSize(600,400);

        isbn = new JTextField();
        lblisbn = new JLabel("ISBN");
        tituolModificar = new JLabel("ELIMINAR UN LIBRO");
        tituolModificar.setFont(new java.awt.Font("Segoe Print", 1, 20));
        aceptarModificar = new JButton("Aceptar");
        cancelarModificar = new JButton("Cancelar");

        isbn.setBounds(110,50,60,40);
        lblisbn.setBounds(50,50,60,40);
        tituolModificar.setBounds(20,20,80,90);
        aceptarModificar.setBounds(120,100,60,40);
        cancelarModificar.setBounds(120,100,60,40);

        add(isbn);
        add(lblisbn);
        add(tituolModificar);
        add(aceptarModificar);
        add(cancelarModificar);

        aceptarModificar.addActionListener(this);
        cancelarModificar.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
