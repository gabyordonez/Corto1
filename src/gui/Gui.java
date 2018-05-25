/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author gabyordonez
 */
public class Gui extends JFrame{

    private JTextField caja1, caja2, caja3;
    private JButton boton1, boton2, boton3, boton4, boton5;
    
    public Gui() {
        super("Calculadora");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        caja1 = new JTextField("Operacion a realizar");
        caja1.setBounds(10, 100, 150, 30);

        
        boton1 = new JButton("Suma");
        boton1.setBounds(10, 150, 150, 30);
        
        boton2 = new JButton("Resta");
        boton2.setBounds(10, 150, 150, 30);
        
        boton3 = new JButton("Multiplicacion");
        boton3.setBounds(10, 150, 150, 30);
        
        boton4 = new JButton("Division");
        boton4.setBounds(10, 150, 150, 30);
        
        boton5 = new JButton("Binario");
        boton5.setBounds(10, 150, 150, 30);
        
        caja2 = new JTextField("Introducir numero 1: ");
        caja2.setBounds(10, 200, 150, 30);
        
        caja3 = new JTextField();
        caja3.setBounds(10, 200, 150, 30);
        
        Container contenedor = getContentPane();
        

        contenedor.add(caja1);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);
        
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   caja2.setText(caja1.getText());
                    
            }
        });
       
        setSize(300,300);
    }
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    
    
}