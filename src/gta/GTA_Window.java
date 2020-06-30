/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//main window
package gta;

import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author anjali
 */
public class GTA_Window extends Frame implements ActionListener {
    
    private final JButton customer =new JButton("    Customer    ");//button for Customer
    private final JButton t_owner =new JButton("Theatre Owner");//button for Theatre Owner
    private final ImageIcon logo = new ImageIcon("/home/anjana/Desktop/gta_pop.png");
    Image i=logo.getImage();
    Image i1=i.getScaledInstance(150,125,java.awt.Image.SCALE_SMOOTH);
    ImageIcon logo1 = new ImageIcon(i1);
    private final JLabel img=new JLabel(logo1);
    private final ImageIcon l = new ImageIcon("/home/anjana/Desktop/gta0.png");
    Image i2=l.getImage();
    Image i12=i2.getScaledInstance(150,125,java.awt.Image.SCALE_SMOOTH);
    ImageIcon logo12= new ImageIcon(i12);
    private final JLabel img2=new JLabel(logo12);
    public GTA_Window() {
        setTitle("GTA");
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weightx=0.0001;
        g1.setConstraints(img, c);
        add(img);
        c.gridy=1;
        g1.setConstraints(img2, c);
        add(img2);
        c.gridx=2;
        c.gridy=0;
        g1.setConstraints(customer, c);
        add(customer);
        c.gridy=1;
        g1.setConstraints(t_owner, c);
        add(t_owner);
        
        customer.addActionListener((ActionListener) this);
        t_owner.addActionListener((ActionListener) this); 
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
    }
    public static void main(String args[]) { 
        GTA_Window f = new GTA_Window();
        f.setSize(500,300);
        f.setVisible(true);
    }
    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void actionPerformed(ActionEvent ae) {
        try
        {
         if(ae.getSource() == customer)
         {
          Customer_Interface fc = new Customer_Interface();
          fc.setSize(500,300);
          fc.setVisible(true);
          dispose();
         } 
         else if(ae.getSource() == t_owner){
            owner_interface fo = new owner_interface();
            fo.setSize(500,300);
            fo.setVisible(true);
            dispose();
         }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
    
      
    
}
