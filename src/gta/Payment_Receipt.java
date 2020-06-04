package gta;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JApplet;
import javax.swing.JButton;


public class Payment_Receipt extends JApplet implements ActionListener{
    private final JLabel details= new JLabel("  Receipt");
    private final JLabel name = new JLabel("Name          :                           ");
    private final JLabel movie = new JLabel("Movie          :");
    private final JLabel theatre = new JLabel("Theatre      :");
    private final JLabel date = new JLabel("Date          :");
    private final JLabel time = new JLabel("time            :");
    private final JLabel seat = new JLabel("Seat            :");
    private final JLabel amt = new JLabel("Amount       :");
    private final JLabel pay = new JLabel("    Payment Done Successfully !!!");
    @Override
    public void init() {
        GroupLayout layout = new GroupLayout(this);  
        layout.setAutoCreateGaps(true);  
        layout.setAutoCreateContainerGaps(true);  
         
        
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(details,CENTER)
                .addComponent(name)
                .addComponent(movie)
                .addComponent(theatre)
                .addComponent(date)
                .addComponent(time)
                .addComponent(seat)
                .addComponent(amt)
                .addComponent(pay))
             
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(details))  
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(name))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(movie))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(theatre))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(date))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(time))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(seat))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(amt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(pay))
        ); 
        setLayout(layout); 
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
