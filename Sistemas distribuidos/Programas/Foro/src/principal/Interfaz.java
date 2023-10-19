/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno
 */
//Iini
public class Interfaz implements ActionListener {

    //Frame y paneles
    JFrame ventana = new JFrame("Ventanijirijilla");
    JPanel panel1;

    //Componentes pane11
    private JLabel lblEntrada1, lblEntrada2, lblForo;
    private JButton btnInicio, btnReiniciar;
    private JTextArea txtEntrada1, txtEntrada2, txtForo;

    //Para que funcione
    Foro f1 = new Foro(1000);

    //panel1
    private void Panel1(JPanel panel) {
        //Iniciar panel y añadir a la ventana
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        ventana.add(panel);

        //Iniciar componentes en el panel1
        lblEntrada1 = new JLabel("Entrada A");
        lblEntrada1.setBounds(15, 70, 200, 25);
        panel.add(lblEntrada1);
        lblEntrada2 = new JLabel("Entrada B");
        lblEntrada2.setBounds(555, 70, 200, 25);
        panel.add(lblEntrada2);
        lblForo = new JLabel("Foro");
        lblForo.setBounds(255, 70, 200, 25);
        panel.add(lblForo);
        btnInicio = new JButton("Iniciar Simulacion");
        btnInicio.setBounds(235, 15, 200, 25);
        btnInicio.addActionListener(this);
        panel.add(btnInicio);
        btnReiniciar = new JButton("Reiniciar simulacion");
        btnReiniciar.setBounds(445, 15, 200, 25);
        btnReiniciar.addActionListener(this);
        panel.add(btnReiniciar);
        txtEntrada1 = new JTextArea("");
        txtEntrada1.setBounds(15, 115, 300, 580);
        txtEntrada1.setEditable(false);
        panel.add(txtEntrada1);
        txtEntrada2 = new JTextArea("");
        txtEntrada2.setBounds(650, 115, 300, 580);
        txtEntrada2.setEditable(false);
        panel.add(txtEntrada2);
        txtForo = new JTextArea("");
        txtForo.setBounds(330, 115, 300, 580);
        txtForo.setEditable(false);
        panel.add(txtForo);

        //Mostar todo (Actualizar el panel)
        panel.updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Accion btnComp1
        if (e.getSource() == btnInicio) {
            btnInicio.setEnabled(false);
            btnReiniciar.setEnabled(false);
            Thread puerta1 = new Thread(new Entrada('A', f1, txtEntrada1, txtForo), "Puerta 1 ");
            Thread puerta2 = new Thread(new Entrada('B', f1, txtEntrada2, txtForo), "Puerta 2 ");
            puerta1.start();
            puerta2.start();
            btnInicio.setEnabled(true);
            btnReiniciar.setEnabled(true);

            //comp1.enviarDatos();
        } else if(e.getSource() == btnReiniciar){
            btnInicio.setEnabled(false);
            btnReiniciar.setEnabled(false);
            f1.setEspaciosDisponibles(0);
            txtEntrada1.setText("");
            txtEntrada2.setText("");
            txtForo.setText("");
            btnInicio.setEnabled(true);
            btnReiniciar.setEnabled(true);
        
        }else {
            System.out.println("CA");
        }

    }

    //Comenzar el programa
    public void Programa() {

        //Inicializar ventana con sus propiedades
        ventana.setBounds(0, 0, 1000, 760);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setAlwaysOnTop(true);
        ventana.setLocationRelativeTo(null);

        //A�adir el panel principal y volver visible la ventana
        panel1 = new JPanel();
        Panel1(panel1);
        ventana.setVisible(true);

    }
}
