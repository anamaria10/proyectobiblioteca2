package co.edu.um.proyectobiblioteca2.Vista;

import co.edu.um.proyectobiblioteca2.Controlador.controlLlenar;
import co.edu.um.proyectobiblioteca2.Controlador.controlvista;
import co.edu.um.proyectobiblioteca2.Modelo.LEG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20/08/13
 * Time: 08:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ventana2 extends JFrame implements ActionListener {

    private JTextArea jlist;
    private JButton btnelimnar, btninsertar, btnSalir, btnConsultar;
    private JLabel lbl1, lbl2, lbl3, lbl4, imagen;

    LEG <String> Lista;

    LEG lstLibrosAux, lstBiblioteca;

    public ventana2(LEG<String> nvalista)
    {
        Lista = nvalista;

        setLayout(null);
        setLocation(200,100);
        setSize(900,600);
        setTitle("Biblioteca Electrónica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(32, 211, 255));

        //Icon icoImagen = new ImageIcon(getClass().getResource("/imagenes biblioteca/libro1.jpg"));

        jlist = new JTextArea();
        jlist.setBounds(20,20,380,380);
        add(jlist);

        btninsertar = new JButton("Insertar");
        btnelimnar = new JButton("Eliminar");
        btnConsultar = new JButton("Consultar");
        btnSalir = new JButton("Salir");

        btninsertar.setBounds(20,420,180,60);
        btnelimnar.setBounds(20,500,180,60);
        btnConsultar.setBounds(220,420,180,60);
        btnSalir.setBounds(220,500,180,60);

        add(btninsertar);
        add(btnelimnar);
        add(btnConsultar);
        add(btnSalir);

        btninsertar.addActionListener(this);
        btnelimnar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnSalir.addActionListener(this);

        lbl1 = new JLabel("BIBLIOTECA");
        lbl1.setFont(new java.awt.Font("Segoe Print", 1, 40));
        lbl3 = new JLabel("ELECTRÓNICA");
        lbl3.setFont(new java.awt.Font("Segoe Print", 1, 40));
        lbl2 = new JLabel("UNIVERSIDAD"  +  " \n " + "DE");
        lbl2.setFont(new java.awt.Font("Segoe Print", 0, 30));
        lbl4 = new JLabel("MANIZALES");
        lbl4.setFont(new java.awt.Font("Segoe Print", 0, 30));
        //imagen = new JLabel(icoImagen);

        lbl1.setBounds(510,30,300,100);
        lbl2.setBounds(500,120,300,300);
        lbl3.setBounds(500,80,300,100);
        lbl4.setBounds(540,270,300,100);
        //imagen.setBounds(540,300,259,194);

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        //add(imagen);

        btninsertar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnelimnar.addActionListener(this);
        btnSalir.addActionListener(this);

        jlist.setEditable(false);

        controlLlenar info = new controlLlenar(Lista);
        jlist.setText(info.llenarInformacionLibros());

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==btnSalir){
            System.exit(0);
        }

        if (e.getSource()==btninsertar){

            controlvista ctr = new controlvista(Lista);
            ctr.VentanaInsertar();
            //setVisible(true);

        }

        if(e.getSource()==btnelimnar)
        {

            controlvista ctr = new controlvista(Lista);
            ctr.VentanaEliminar();
        }

        if(e.getSource()==btnConsultar)
        {

            controlvista ctr = new controlvista(Lista);
            ctr.VentanaConsultar();
        }


    }
        }


