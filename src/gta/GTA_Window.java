/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//main window
package gta;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author anjali
 */
public class GTA_Window extends JApplet implements ActionListener {

    private final JButton customer =new JButton("Customer");//button for Customer
    private final JButton t_owner =new JButton("Theatre Owner");//button for Theatre Owner
    @Override
    public void init() {
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
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
