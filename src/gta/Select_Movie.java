
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
    protected int did=0;
    private final JButton b = new JButton("Back");
    private final JLabel label = new JLabel("Theatre");           
    final JComboBox cb=new JComboBox();
    private final JLabel day = new JLabel("Date");
    final JComboBox cbd=new JComboBox();
    private final JLabel t = new JLabel("Time");
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
        .addComponent(t))
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
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(t)
        .addComponent(cbt))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(d))
       ); 
        setLayout(layout); 
         b.addActionListener((ActionListener) this);
         d.addActionListener((ActionListener) this);
         cb.addItemListener((ItemListener) this);
         cbd.addItemListener((ItemListener) this);
         cbt.addItemListener((ItemListener) this);
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
            System.out.println("*");
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
                //System.out.println(a2);
                cbt.addItem(a2);
            }
         }
          catch(SQLException e){
         }
     }
     String date="";
     String time="";
    @Override
     public void itemStateChanged(ItemEvent e) { 
        if(e.getSource() == cb){
        String c=(String) cb.getSelectedItem();
        add_cbd_set(c);
        System.out.println(c);
        }
        if(e.getSource() == cbd){
            String c0=(String) cbd.getSelectedItem();
            date=c0;
            add_cbt_set(c0);
            System.out.println(date);
        }
        if(e.getSource() == cbt){
            String c1=(String) cbt.getSelectedItem();
            time=c1;
            System.out.println(time);
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
             int bid=0;
          try{
          Connection con1 = DriverManager.getConnection(url, user, password);
          Statement s = con1.createStatement();
          System.out.println(mid);
          System.out.println(tid);
          System.out.println(date);
          System.out.println(time);
          ResultSet r=s.executeQuery("select did from details where (mid='"+mid
                    +"' and tid='"+tid+"' and date='"+date+"' and time='"+time+"')");
          r.next();
          did=r.getInt(1);
          System.out.println(did);
          String q= "insert into booking(cid,did)"+"values(?,?)";
           PreparedStatement p = con1.prepareStatement(q);
           p.setInt(1,cid);
           p.setInt(2,did);
           p.execute();
          r=s.executeQuery("select bid from booking where cid="+cid+" and did="+did);
          while(r.next()){
          bid=r.getInt(1);
          }
          }
          catch(SQLException e){
         }
          seat_select f1 = new seat_select(did,bid);
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
