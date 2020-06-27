
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


public class Payment_Details extends Frame implements ActionListener{
    private final JLabel details= new JLabel("  Details");
    private final JLabel name = new JLabel("Name          :                           ");
    private final JLabel movie = new JLabel("Movie          :");
    private final JLabel theatre = new JLabel("Theatre      :");
    private final JLabel date = new JLabel("Date            :");
    private final JLabel time = new JLabel("time            :");
    private final JLabel seat = new JLabel("Seat            :");
    private final JLabel amt = new JLabel("Amount       :");
    private final JButton pay = new JButton("Pay");
    private final JButton b = new JButton("Back");
    
    public Payment_Details() {
        setTitle("Payment Details");
        GroupLayout layout = new GroupLayout(this);  
        layout.setAutoCreateGaps(true);  
        layout.setAutoCreateContainerGaps(true);  
         
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(b)
                .addComponent(details,CENTER)
                .addComponent(name)
                .addComponent(movie)
                .addComponent(theatre)
                .addComponent(date)
                .addComponent(time)
                .addComponent(seat)
                .addComponent(amt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(pay,CENTER))
             
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b))
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
        b.addActionListener((ActionListener) this);
        pay.addActionListener((ActionListener) this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
        
    }
     public static void main(String args[]) { 
        Payment_Details f =new Payment_Details();
        f.setSize(500,300);
        f.setVisible(true);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
       try{
         if(ae.getSource() == b)
         {
          seat_select f = new seat_select();
          f.setSize(500,300);
          f.setVisible(true);
          dispose();
         } 
         if(ae.getSource() == pay)
         {
          Payment_Receipt f1 =new Payment_Receipt();
          f1.setSize(500,300);
          f1.setVisible(true);
          dispose();
         } 
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        } 
    }
}
