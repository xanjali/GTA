package gta;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;


public class Payment_Receipt extends Frame implements ActionListener{
    private final String url = "jdbc:mysql://localhost/gta";
    private final String user = "root";
    private final String password = "root";
    
    private final JLabel details= new JLabel("  Details");
    private final JLabel name = new JLabel("Name          :                           ");
    private final JLabel a1= new JLabel();
    private final JLabel movie = new JLabel("Movie          :");
    private final JLabel a2= new JLabel();
    private final JLabel theatre = new JLabel("Theatre      :");
    private final JLabel a3= new JLabel();
    private final JLabel date = new JLabel("Date            :");
    private final JLabel a4= new JLabel();
    private final JLabel time = new JLabel("time            :");
    private final JLabel a5= new JLabel();
    private final JLabel seat = new JLabel("Seat            :");
    private final JLabel a6= new JLabel();
    private final JLabel amt = new JLabel("Amount       :");
    private final JLabel a7= new JLabel();
    private final JButton ok = new JButton("Ok");
   
    
    protected int mid=1;
    protected int cid=1;
    protected int tid=2;
    public Payment_Receipt(int idm,int idc,int idt) {
        setTitle("Payment Receipt");
        mid=idm;
        cid=idc;
        tid=idt;
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
                .addComponent(amt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(a1)
                .addComponent(a2)
                .addComponent(a3)
                .addComponent(a4)
                .addComponent(a5)
                .addComponent(a6)
                .addComponent(a7)
                .addComponent(ok,CENTER))
             
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(details))  
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(name) .addComponent(a1))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(movie) .addComponent(a2))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(theatre) .addComponent(a3))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(date) .addComponent(a4))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(time) .addComponent(a5))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(seat) .addComponent(a6))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(amt) .addComponent(a7))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
        addComponent(ok))
        ); 
        setLayout(layout); 
        set_data();
        ok.addActionListener((ActionListener) this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
        
    }
     public static void main(String args[]) { 
        Payment_Receipt f =new Payment_Receipt(1,1,2);
        f.setSize(500,300);
        f.setVisible(true);
        
    }
     public final void set_data(){
         try{
          Connection con = DriverManager.getConnection(url, user, password);
          Statement s = con.createStatement();
          String q ="select cname from customer where cid='"+cid+"'";
          ResultSet r = s.executeQuery(q);
          r.next();
          a1.setText(r.getString(1));
          String q1 ="select mname from movie where mid='"+mid+"'";
          r = s.executeQuery(q1);
          r.next();
          a2.setText(r.getString(1));
          String q2 ="select tname from theatre where tid='"+tid+"'";
          r = s.executeQuery(q2);
          r.next();
          a3.setText(r.getString(1));
          String q3="select date,time from details where tid='"+tid
                  +"' and mid='"+mid+"'";
          r = s.executeQuery(q3);
          r.next();
          a4.setText(r.getString(1)); 
          a5.setText(r.getString(2));
          String str="";
          String q4="select sid from seat where tid='"+tid
                  +"' and mid='"+mid+"' and cid='"+cid+"'";
          r = s.executeQuery(q4);
          while(r.next()){
          str=str+"s"+r.getString(1)+"  "; 
          }
          a6.setText(str);
          String q5="select amt from booking where tid='"+tid
                  +"' and mid='"+mid+"' and cid='"+cid+"'";
          r = s.executeQuery(q5);
          r.next();
          a7.setText(r.getString(1)); 
         }
         catch(SQLException e){
             
         }
     }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
         if(ae.getSource() == ok)
         {
          Search_Movie f = new Search_Movie(cid);
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
