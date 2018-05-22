/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.*;
import Aritmetico.*;
/**
 *
 * @author uca
 */
public class Ventana extends JFrame {
    
    private JTextField caja1, caja2;
    private JButton botonSuma, botonResta, botonDivision, botonMultiplicar;
    public Ventana(){
        super("Titulo de la ventana");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        String y;
        int tipo;
        caja1 = new JTextField();
        caja1.setBounds(10, 100, 150, 30);
        botonSuma = new JButton("Sumar");
        botonSuma.setBounds(10, 150, 150, 30);
        botonResta = new JButton("Restar");
        botonResta.setBounds(200, 150, 150, 30);
        botonDivision = new JButton("Dividir");
        botonDivision.setBounds(390, 150, 150, 30);
        botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.setBounds(10, 200, 150, 30);
        caja2 = new JTextField();
        caja2.setBounds(200,100,150,30);
        Container contenedor = getContentPane();
        contenedor.add(caja1);
        contenedor.add(botonSuma);
        contenedor.add(botonResta);
        contenedor.add(botonDivision);
        contenedor.add(botonMultiplicar);
        contenedor.add(caja2);
        botonSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory = FactoryProducer.getFactory(1);
                Aritmetico Suma = factory.getNum1(1);
                
                caja2.setText(caja1.getText());
                
            }
        });
        setSize(600,600);
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Ventana().setVisible(true);
            }
        });
    }
    
}
