package gta;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;


public class Payment_Receipt extends Frame implements ActionListener{
    private final JLabel details= new JLabel("  Receipt");
    private final JLabel name = new JLabel("Name          :                           ");
    private final JLabel movie = new JLabel("Movie          :");
    private final JLabel theatre = new JLabel("Theatre      :");
    private final JLabel date = new JLabel("Date           :");
    private final JLabel time = new JLabel("time            :");
    private final JLabel seat = new JLabel("Seat            :");
    private final JLabel amt = new JLabel("Amount       :");
    private final JLabel pay = new JLabel("    Payment Done Successfully !!!");
    private final JButton ok= new JButton("Ok");
    public Payment_Receipt() {
        setTitle("Receipt");
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
                .addComponent(pay)
                .addComponent(ok))
             
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
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(ok))
        ); 
        setLayout(layout);
        ok.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
    }

    public static void main(String args[]){
        Payment_Receipt f = new Payment_Receipt();
        f.setSize(500,300);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
         if(ae.getSource() == ok)
         {
          Search_Movie f = new Search_Movie();
          f.setSize(500,300);
          f.setVisible(true);
          dispose();
         } 
        }
         catch (Exception ex){
            ex.printStackTrace();
        } 
    }
}
