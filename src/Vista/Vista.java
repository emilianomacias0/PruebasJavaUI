/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Desarrollo234
 */
public class Vista extends javax.swing.JFrame {

  public void Muestra(){
    JFrame frame = new JFrame("Inicio");
    frame.setBounds(0, 0, 800, 400);    
    
    
    
    //Elementos
    JPanel pn = new JPanel();
    pn.setBounds(0, 0, 200, 100);
    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtNombre = new JTextField(20);
    JLabel lblApellidoP = new JLabel("Apellido P.:");
    JTextField txtApellidoP = new JTextField(20);
    JLabel lblApellidoM = new JLabel("Apellido M.:");
    JTextField txtApellidoM = new JTextField(20);
    lblApellidoP.setLabelFor(txtApellidoP);
    JButton b3 = new JButton("<html><center><b><u>E</u>nable</b><br>"
                 + "<font color=#ffffdd>middle button</font>");
    
    //Opciones del frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    
    //Agrega elementos al panel
    pn.add(lblNombre, GridLayout.class);
    pn.add(txtNombre, GridLayout.class);
    pn.add(lblApellidoP, GridLayout.class);
    pn.add(txtApellidoP, GridLayout.class);
    pn.add(lblApellidoM, GridLayout.class);
    pn.add(txtApellidoM, GridLayout.class);
    pn.add(b3, GridLayout.class);
    

    

    frame.add(pn);


frame.setVisible(true); 
  }
}
