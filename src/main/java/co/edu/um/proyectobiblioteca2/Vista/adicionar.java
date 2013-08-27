package co.edu.um.proyectobiblioteca2.Vista;

import co.edu.um.proyectobiblioteca2.Controlador.controlvista;
import co.edu.um.proyectobiblioteca2.Modelo.LEG;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/08/13
 * Time: 06:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class adicionar extends JFrame implements ActionListener,ItemListener {


    LEG <String> Lista;

    private JLabel isbn, titulo, fechaPublicacion, autor, posicion, refe;
    private JButton aceptar, cancelar;
    private JTextField txtisbn, txttitulo, txtfecha, txtautor, isbnreferencia,txtposicion;
    private JComboBox posicionR;


    public adicionar(LEG<String> lista){

        Lista = lista;

        setLayout(null);
        setSize(700,570);
        setLocation(290,120);

        isbn = new JLabel("ISBN");
        autor = new JLabel("Autor");
        titulo = new JLabel("Título");
        fechaPublicacion = new JLabel("Fecha de Publicación");
        posicion = new JLabel("Posición");
        refe = new JLabel("ISBN de referencia");

        aceptar = new JButton("Aceptar");
        cancelar = new JButton("Cancelar");

        txtisbn = new JTextField();
        txttitulo = new JTextField();
        txtautor = new JTextField();
        txtfecha = new JTextField();
        txtposicion = new JTextField();
        isbnreferencia = new JTextField();

        posicionR.addItem("Antes de un libro");
        posicionR.addItem("Despues de un libro");

        isbn.setBounds(80,165,200,30);
        txtisbn.setBounds(220,165,200,30);
        titulo.setBounds(80,205,200,30);
        txttitulo.setBounds(220,205,200,30);
        fechaPublicacion.setBounds(80,245,200,30);
        txtfecha.setBounds(220,245,200,30);
        autor.setBounds(80, 285, 200, 30);
        txtautor.setBounds(220,285,200,30);
        posicion.setBounds(80,325,200,30);
        txtposicion.setBounds(220, 325, 200, 30);
        refe.setBounds(225, 365, 200, 30);
        isbnreferencia.setBounds(322,365,100,30);

        aceptar.setBounds(220, 435, 100, 40);
        cancelar.setBounds(320,435,100,40);

        add(isbn);
        add(isbnreferencia);
        add(autor);
        add(titulo);
        add(fechaPublicacion);
        add(posicion);
        add(refe);
        add(txtposicion);
        add(txtisbn);
        add(txtautor);
        add(txttitulo);
        add(txtfecha);
        add(aceptar);
        add(cancelar);
        add(posicionR);

        aceptar.addActionListener(this);
        cancelar.addActionListener(this);
        posicionR.addItemListener(this);


        isbnreferencia.setVisible(false);
        isbn.setVisible(false);





    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cancelar){
            controlvista cer= new controlvista(Lista);
            cer.cerrarVentana();
            this.setVisible(false);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {



    }
}
