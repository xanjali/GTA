

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


public class select_seat extends JApplet {

    private final JButton s1= new JButton("s1");  
    private final JButton s2= new JButton("s2");
    private final JButton s3= new JButton("s3");
    private final JButton s4= new JButton("s4");
    private final JButton s5= new JButton("s5");
    
    private final JButton s6= new JButton("s6");
    private final JButton s7= new JButton("s7");
    private final JButton s8= new JButton("s8");
    private final JButton s9= new JButton("s9");
    private final JButton s10= new JButton("s10");
    
    private final JButton s11= new JButton("s11");
    private final JButton s12= new JButton("s12");
    private final JButton s13= new JButton("s13");
    private final JButton s14= new JButton("s14");
    private final JButton s15= new JButton("s15");
    
    private final JButton s16= new JButton("s16");
    private final JButton s17= new JButton("s17");
    private final JButton s18= new JButton("s18");
    private final JButton s19= new JButton("s19");
    private final JButton s20= new JButton("s20");
    
    private final JButton s21= new JButton("s21");
    private final JButton s22= new JButton("s22");
    private final JButton s23= new JButton("s23");
    private final JButton s24= new JButton("s24");
    private final JButton s25= new JButton("s25");
    
    @Override
     public void init() {
        GroupLayout layout = new GroupLayout(this);  
        layout.setAutoCreateGaps(true);  
        layout.setAutoCreateContainerGaps(true); 
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(s1)
        .addComponent(s6)
        .addComponent(s11)
        .addComponent(s16)
        .addComponent(s21))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(s2)
        .addComponent(s7)
        .addComponent(s12)
        .addComponent(s17)
        .addComponent(s22))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(s3)
        .addComponent(s8)
        .addComponent(s13)
        .addComponent(s18)
        .addComponent(s23))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(s4)
        .addComponent(s9)
        .addComponent(s14)
        .addComponent(s19)
        .addComponent(s24))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(s5)
        .addComponent(s10)
        .addComponent(s15)
        .addComponent(s20)
        .addComponent(s25))
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s1)
        .addComponent(s2)
        .addComponent(s3)
        .addComponent(s4)
        .addComponent(s5))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s6)
        .addComponent(s7)
        .addComponent(s8)
        .addComponent(s9)
        .addComponent(s10))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s11)
        .addComponent(s12)
        .addComponent(s13)
        .addComponent(s14)
        .addComponent(s15))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s16)
        .addComponent(s17)
        .addComponent(s18)
        .addComponent(s19)
        .addComponent(s20))
                
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(s21)
        .addComponent(s22)
        .addComponent(s23)
        .addComponent(s24)
        .addComponent(s25))
       
       ); 
        setLayout(layout); 
        
    }

   
        // TODO start asynchronous download of heavy resources
    

    // TODO overwrite start(), stop() and destroy() methods
}
