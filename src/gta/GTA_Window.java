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
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author anjali
 */
public class GTA_Window extends Frame implements ActionListener {

    private final JButton customer =new JButton("Customer");//button for Customer
    private final JButton t_owner =new JButton("Theatre Owner");//button for Theatre Owner
    public GTA_Window() {
        setTitle("GTA");
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
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
