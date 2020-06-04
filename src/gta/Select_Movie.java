
package gta;

import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.CENTER;


public class Select_Movie extends JApplet {

    private final JLabel label = new JLabel("Theatre");    
    String theatre[]={"t1","t2","t3","t4","t5"};        
    final JComboBox cb=new JComboBox(theatre);  
    private final JLabel day = new JLabel("Day");
    private final JLabel tday = new JLabel("      Today");
    private final JRadioButton rb1 = new JRadioButton();
    private final JLabel tom = new JLabel("      Tomorrow");
    private final JRadioButton rb2 = new JRadioButton();
    private final JLabel time = new JLabel("Time");
    private final JRadioButton s1 = new JRadioButton();
    private final JLabel l1 = new JLabel("     Slot1");
    private final JRadioButton s2 = new JRadioButton();
    private final JLabel l2 = new JLabel("     Slot2");
    private final JButton d = new JButton("Select Seat");
    @Override
     public void init() {
        GroupLayout layout = new GroupLayout(this);  
        layout.setAutoCreateGaps(true);  
        layout.setAutoCreateContainerGaps(true); 
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(label)
        .addComponent(day)
        .addComponent(time))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cb)
        .addComponent(rb1).addComponent(tday)
        .addComponent(rb2).addComponent(tom)
        .addComponent(s1).addComponent(l1)
        .addComponent(s2).addComponent(l2)
        .addComponent(d))
       
                /*.addComponent(theatre)
                .addComponent(date)
                .addComponent(time)
                .addComponent(seat)
                .addComponent(amt)
                .addComponent(pay))*/
             
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(label)
        .addComponent(cb))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(day)
        .addComponent(rb1).addComponent(tday))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(rb2).addComponent(tom))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(time)
        .addComponent(s1).addComponent(l1))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s2).addComponent(l2))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(d))
        /*.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(time))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(seat))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(amt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(pay))*/
       ); 
        setLayout(layout); 
        
    }

   
        // TODO start asynchronous download of heavy resources
    

    // TODO overwrite start(), stop() and destroy() methods
}
