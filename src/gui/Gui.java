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
import corto1.AbstractFactory; 
import corto1.FactoryProducer;
import corto1.operaciones.Aritmetica;
import corto1.converter.Binario;
import corto1.converter.Converter;

/**
 *
 * @author gabyordonez
 */
public class Gui extends JFrame{
    AbstractFactory Factory;

    private JTextField caja1, caja2, caja3, caja4;
    private JButton boton1, boton2, boton3, boton4, boton5;
    
    public Gui() {
        super();
        initComponent();
    }

    /**
     *
     */
    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        caja1 = new JTextField();
        caja1.setBounds(10, 90, 150, 30);

        caja2 = new JTextField();
        caja2.setBounds(200, 90, 150, 30);
        
        caja3 = new JTextField("TOTAL");
        caja3.setBounds(10, 300, 50, 30);
        caja3.setEditable(false);
        
        caja4 = new JTextField();
        caja4.setBounds(100, 300, 150, 30);
        caja4.setEditable(false);
        
        boton1 = new JButton("Suma");
        boton1.setBounds(10, 150, 150, 30);
        
        boton2 = new JButton("Resta");
        boton2.setBounds(200, 150, 150, 30);
        
        boton3 = new JButton("Multiplicacion");
        boton3.setBounds(10, 200, 150, 30);
        
        boton4 = new JButton("Division");
        boton4.setBounds(200, 200, 150, 30);
        
        boton5 = new JButton("Binario");
        boton5.setBounds(90, 250, 150, 30);
        
        
        Container contenedor = getContentPane();
        

        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(caja3);
        contenedor.add(caja4);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);
        
     
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetica c = Factory.getAritmetica("Suma");        
                double a1 = Integer.parseInt(caja1.getText());
                double b = Integer.parseInt(caja2.getText());
                caja4.setText(c.Operar(a1, b));
                    
            }
        });
        
           boton2.addActionListener(new ActionListener() {
            private AbstractFactory Factory;
            @Override
            public void actionPerformed(ActionEvent e) {
                Factory = corto1.FactoryProducer.getFactory("Aritmetica");
                Aritmetica c = Factory.getAritmetica("resta");        
                double a1 = Integer.parseInt(caja1.getText());
                double b = Integer.parseInt(caja2.getText());
                caja4.setText(c.Operar(a1, b));
                    
            }
        });
           
              boton1.addActionListener(new ActionListener() {
            private AbstractFactory Factory;
            @Override
            public void actionPerformed(ActionEvent e) {
                Factory = corto1.FactoryProducer.getFactory("Aritmetica");
                Aritmetica c = Factory.getAritmetica("multiplicacion");        
                double a1 = Integer.parseInt(caja1.getText());
                double b = Integer.parseInt(caja2.getText());
                caja4.setText(c.Operar(a1, b));
                    
            }
        });
              
                 boton1.addActionListener(new ActionListener() {
            private AbstractFactory Factory;
            @Override
            public void actionPerformed(ActionEvent e) {
                Factory = corto1.FactoryProducer.getFactory("Aritmetica");
                Aritmetica c = Factory.getAritmetica("division");        
                double a1 = Integer.parseInt(caja1.getText());
                double b = Integer.parseInt(caja2.getText());
                caja3.setText(c.Operar(a1, b));
                    
            }
        });
       
                    boton1.addActionListener(new ActionListener() {
            private AbstractFactory Factory;
            @Override
            public void actionPerformed(ActionEvent e) {
                Factory = corto1.FactoryProducer.getFactory("Converter");
                Converter c = Factory.getConverter("binario");        
                double a1 = Integer.parseInt(caja1.getText());
                caja4.setText(c.Convertir(a1));
                    
            }
        });
                    
        setSize(400,400);
    }
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Gui().setVisible(true);
        });
    }
    
    
}