package co.edu.um.proyectobiblioteca2.Vista;

import co.edu.um.proyectobiblioteca2.Controlador.controlConsultar;
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
 * Date: 26/08/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class consultar extends JFrame implements ActionListener {

    LEG<String> Lista;

    private JTextField isbn;
    private JLabel lblisbn, tituolConsultar, lbltitulolibro;
    private JButton aceptarConsultar, cancelarConsultar, consultar;

    public consultar(LEG<String> lista){

        Lista = lista;

        setLayout(null);
        setTitle("Eliminar un Libro");
        setLocation(200,200);
        setSize(400,400);
        getContentPane().setBackground(new Color(32, 211, 255));

        isbn = new JTextField();
        lblisbn = new JLabel("ISBN");
        tituolConsultar = new JLabel("CONSULTAR UN LIBRO");
        tituolConsultar.setFont(new java.awt.Font("Segoe Print", 1, 20));
        aceptarConsultar = new JButton("Aceptar");
        cancelarConsultar = new JButton("Cancelar");
        consultar = new JButton("Consultar");
        lbltitulolibro = new JLabel("Titulo:");

        isbn.setBounds(110,150,100,40);
        lblisbn.setBounds(50,150,100,40);
        tituolConsultar.setBounds(40,20,250,80);
        aceptarConsultar.setBounds(100,250,100,40);
        cancelarConsultar.setBounds(230,250,100,40);
        consultar.setBounds(230,150,100,40);
        lbltitulolibro.setBounds(200,150,80,90);

        add(isbn);
        add(lblisbn);
        add(tituolConsultar);
        add(aceptarConsultar);
        add(cancelarConsultar);
        add(consultar);
        add(lbltitulolibro);

        aceptarConsultar.addActionListener(this);
        cancelarConsultar.addActionListener(this);
        consultar.addActionListener(this);


}

    @Override
    public void actionPerformed(ActionEvent e) {

        String referencia = isbn.getText();
        controlConsultar ctr = new controlConsultar(Lista);
        controlModificar ctm = new controlModificar(Lista);

        if (e.getSource()==cancelarConsultar)
        {
            controlvista vista = new controlvista(Lista);
            vista.cerrarVentana();
            this.setVisible(false);
        }

        if (e.getSource()==consultar){
            if (referencia.length()!=0) {
                if (ctm.ListaVentana(referencia)=="aceptar")
                {
                    String datos[]  = ctr.consultaVentana(referencia);
                    tituolConsultar.setVisible(true);

                    lblisbn.setText("ISBN:" + datos[0]);
                    lbltitulolibro.setText("Titulo:" + datos[1]);

                    lblisbn.setVisible(true);
                    lbltitulolibro.setVisible(false);



                }
            }
        }
    }
}
