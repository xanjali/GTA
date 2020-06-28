
package gta;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class Select_Movie extends Frame implements ActionListener,ItemListener {
    private final String url = "jdbc:mysql://localhost/gta";
    private final String user = "root";
    private final String password = "root";
    protected int mid=1;
    protected int cid=1;
    protected int tid=0;
    private final JButton b = new JButton("Back");
    private final JLabel label = new JLabel("Theatre");           
    final JComboBox cb=new JComboBox();
    private final JLabel day = new JLabel("Date");
    final JComboBox cbd=new JComboBox();
    private final JLabel time = new JLabel("Time");
    final JComboBox cbt=new JComboBox();
    private final JButton d = new JButton("Select Seat");
    public Select_Movie(int idm,int idc) {
        setTitle("Select details");
        mid=idm;
        cid=idc;
        add_cb_set();
        GroupLayout layout = new GroupLayout(this);  
        layout.setAutoCreateGaps(true);  
        layout.setAutoCreateContainerGaps(true); 
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(b).addComponent(label)
        .addComponent(day)
        .addComponent(time))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cb)
        .addComponent(cbd).addComponent(cbt)
        .addComponent(d))
        ); 
        
        layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(b))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(label)
        .addComponent(cb))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(day)
        .addComponent(cbd))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(time)
        .addComponent(cbt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(d))
       ); 
        setLayout(layout); 
         b.addActionListener((ActionListener) this);
         d.addActionListener((ActionListener) this);
         cb.addItemListener((ItemListener) this);
         cbd.addItemListener((ItemListener) this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
     }
     public static void main(String args[]) { 
        Select_Movie f =new Select_Movie(1,1);
        f.setSize(500,300);
        f.setVisible(true);
        
    }
     public final void add_cb_set(){
         //System.out.println(mid);
         try{
           Connection con = DriverManager.getConnection(url, user, password);
          Statement s = con.createStatement();
          Statement s1 = con.createStatement();
          ResultSet r0=s.executeQuery("select mname from movie where mid='"+mid+"'");
          r0.next();
          String name=r0.getString(1);
         // System.out.println(name);
          cb.addItem(" ");
          ResultSet r=s.executeQuery("select tid from movie where mname='"+name+"'");
          while (r.next()) { 
            int a=r.getInt(1);
            ResultSet r1=s1.executeQuery("select tname from theatre where tid='"+a+"'");
            r1.next();
            cb.addItem(r1.getString(1));
            System.out.println(a);
          }
         }
          catch(SQLException e){
         }
     }
     public final void add_cbd_set(String c1){
         System.out.println(c1);
         cbd.removeAllItems();
         try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement s = con.createStatement();
            ResultSet r0=s.executeQuery("select tid from theatre where tname='"+c1+"'");
            r0.next();
            tid=r0.getInt(1);
            System.out.println(tid+" "+mid);
            cbd.addItem(" ");
            ResultSet r=s.executeQuery("select date from details where mid='"+mid+"' and tid='"+tid+"'");
            while (r.next()) { 
                String a1=r.getString(1);
                System.out.println(a1);
                cbd.addItem(a1);
            }
         }
          catch(SQLException e){
         }
     }
   
     public final void add_cbt_set(String c2){
         System.out.println(c2);
         cbt.removeAllItems();
         try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement s = con.createStatement();
            cbt.addItem(" ");
            ResultSet r=s.executeQuery("select time from details where (mid='"+mid
                    +"' and tid='"+tid+"' and date='"+c2+"')");
            while (r.next()) { 
                String a2=r.getString(1);
                System.out.println(a2);
                cbt.addItem(a2);
            }
         }
          catch(SQLException e){
         }
     }
     
    @Override
     public void itemStateChanged(ItemEvent e) { 
        if(e.getSource() == cb){
        String c=(String) cb.getSelectedItem();
        add_cbd_set(c);
        }
        if(e.getSource() == cbd){
            String c0=(String) cbd.getSelectedItem();
            add_cbt_set(c0);
        }
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try
        {
         if(ae.getSource() == b)
         {
          Search_Movie f = new Search_Movie(cid);
          f.setSize(500,300);
          f.setVisible(true);
          dispose();
         } 
         if(ae.getSource() == d)
         {
          try{
          Connection con = DriverManager.getConnection(url, user, password);
          String q= "insert into booking(cid,mid,tid)"+"values(?,?,?)";
           PreparedStatement p = con.prepareStatement(q);
           p.setInt(1, cid);
           p.setInt(2,mid);
           p.setInt(3,tid);
           p.execute();
           con.close();
          }
          catch(SQLException e){
         }
          seat_select f1 = new seat_select(mid,cid,tid);
          f1.setSize(500,300);
          f1.setVisible(true);
          dispose();
         } 
        }
        catch (Exception e)
        {
        } 
    }
}
