/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//customer login-signup page
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
public class owner_interface extends Frame implements ActionListener {

    private final JButton login =new JButton("  Login  ");//button for login
    private final JButton signup =new JButton("Sign Up");//button sign up
    private final JButton b=new JButton("<<");
    private final ImageIcon logo = new ImageIcon("/home/anjana/Desktop/c.png");
    Image i=logo.getImage();
    Image i1=i.getScaledInstance(150,125,java.awt.Image.SCALE_SMOOTH);
    ImageIcon logo1 = new ImageIcon(i1);
    private final JLabel img=new JLabel(logo1);
    public owner_interface() {
        setTitle("THEATRE OWNER");
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        g1.setConstraints(b, c);
        add(b);
        c.weighty=0.0001;
        c.weightx=0.0001;
        c.gridx=1;
        c.gridy=1;
        g1.setConstraints(img, c);
        add(img);
        c.gridy=2;
        g1.setConstraints(login, c);
        add(login);
        c.gridy=3;
        g1.setConstraints(signup, c);
        add(signup);
        b.addActionListener((ActionListener) this);
        login.addActionListener((ActionListener) this);
        signup.addActionListener((ActionListener) this); 
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
    }

    public static void main(String args[]) { 
        owner_interface fo = new owner_interface();
        fo.setSize(500,300);
        fo.setVisible(true);
        
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try
        {
         if(ae.getSource() == b)
         {
          GTA_Window f = new GTA_Window();
          f.setSize(500,300);
          f.setVisible(true);
          dispose();
         } 
         else if(ae.getSource() == login)
         {
          OwnerLogin f = new OwnerLogin();
          f.setVisible(true);
          dispose();
         }
         else if(ae.getSource() == signup)
         {
          signUp f = new signUp();
          f.setVisible(true);
          dispose();
         }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        } 
    }
}
