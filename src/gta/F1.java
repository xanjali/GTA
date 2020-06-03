/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class F1 extends JApplet implements ActionListener {

    private final JButton login =new JButton("Login");//button for login
    private final JButton signup =new JButton("Sign Up");//button sign up
    @Override
    public void init() {
         GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(login, c);
        add(login);
        c.gridy=1;
        g1.setConstraints(signup, c);
        add(signup);
        
        login.addActionListener((ActionListener) this);
        signup.addActionListener((ActionListener) this); 
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
