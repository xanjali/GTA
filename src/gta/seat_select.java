package gta;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JFrame;



public class seat_select extends Frame implements ActionListener {
    private final String url = "jdbc:mysql://localhost/gta";
    private final String user = "root";
    private final String password = "root";
    
    private final JButton s1= new JButton("s1 ");  
    private final JButton s2= new JButton("s2 ");
    private final JButton s3= new JButton("s3 ");
    private final JButton s4= new JButton("s4 ");
    private final JButton s5= new JButton("s5 ");
    
    final JButton s6= new JButton("s6 ");
    final JButton s7= new JButton("s7 ");
    final JButton s8= new JButton("s8 ");
    final JButton s9= new JButton("s9 ");
    final JButton s10= new JButton("s10");
    
    final JButton s11= new JButton("s11");
    final JButton s12= new JButton("s12");
    final JButton s13= new JButton("s13");
    final JButton s14= new JButton("s14");
    final JButton s15= new JButton("s15");
    
    final JButton s16= new JButton("s16");
    final JButton s17= new JButton("s17");
    final JButton s18= new JButton("s18");
    final JButton s19= new JButton("s19");
    final JButton s20= new JButton("s20");
    
    final JButton s21= new JButton("s21");
    final JButton s22= new JButton("s22");
    final JButton s23= new JButton("s23");
    final JButton s24= new JButton("s24");
    final JButton s25= new JButton("s25");
    
    final JButton p= new JButton("Pay");
    
    protected int bid=1;
    protected int did=1;
     public seat_select(int idd,int idb){
         did=idd;
         bid=idb;
        setTitle("Select Seat");
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
        .addComponent(s23)
        .addComponent(p))
                
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
       
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(p))      
       ); 
        setLayout(layout);
        set_seat();
        
        s1.addActionListener((ActionListener) this);
        s2.addActionListener((ActionListener) this);
        s3.addActionListener((ActionListener) this);
        s4.addActionListener((ActionListener) this);
        s5.addActionListener((ActionListener) this);
        s6.addActionListener((ActionListener) this);
        s7.addActionListener((ActionListener) this);
        s8.addActionListener((ActionListener) this);
        s9.addActionListener((ActionListener) this);
        s10.addActionListener((ActionListener) this);
        s11.addActionListener((ActionListener) this);
        s12.addActionListener((ActionListener) this);
        s13.addActionListener((ActionListener) this);
        s14.addActionListener((ActionListener) this);
        s15.addActionListener((ActionListener) this);
        s16.addActionListener((ActionListener) this);
        s17.addActionListener((ActionListener) this);
        s18.addActionListener((ActionListener) this);
        s19.addActionListener((ActionListener) this);
        s20.addActionListener((ActionListener) this);
        s21.addActionListener((ActionListener) this);
        s22.addActionListener((ActionListener) this);
        s23.addActionListener((ActionListener) this);
        s24.addActionListener((ActionListener) this);
        s25.addActionListener((ActionListener) this);
        
        p.addActionListener((ActionListener) this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
        
    }
     public static void main(String args[]) { 
        seat_select f =new seat_select(1,1);
        f.setSize(500,300);
        f.setVisible(true);
        
    }
     
     public final void set_seat(){
         try{
         Connection con = DriverManager.getConnection(url, user, password);
          Statement s = con.createStatement();
          ResultSet r=s.executeQuery("select sid from seat where (did='"+did+"' )");
          while (r.next()) { 
              int x=r.getInt(1);
              System.out.println(x);
              switch(x){
                  case 1 :s1.setEnabled(false);break;
                  case 2 :s2.setEnabled(false);break;
                  case 3 :s3.setEnabled(false);break;
                  case 4 :s4.setEnabled(false);break;
                  case 5 :s5.setEnabled(false);break;
                  case 6 :s6.setEnabled(false);break;
                  case 7 :s7.setEnabled(false);break;
                  case 8 :s8.setEnabled(false);break;
                  case 9 :s9.setEnabled(false);break;
                  case 10 :s10.setEnabled(false);break;
                  case 11 :s11.setEnabled(false);break;
                  case 12 :s12.setEnabled(false);break;
                  case 13 :s13.setEnabled(false);break;
                  case 14 :s14.setEnabled(false);break;
                  case 15 :s15.setEnabled(false);break;
                  case 16 :s16.setEnabled(false);break;
                  case 17 :s17.setEnabled(false);break;
                  case 18 :s18.setEnabled(false);break;
                  case 19 :s19.setEnabled(false);break;
                  case 20 :s20.setEnabled(false);break;
                  case 21 :s21.setEnabled(false);break;
                  case 22 :s22.setEnabled(false);break;
                  case 23 :s23.setEnabled(false);break;
                  case 24 :s24.setEnabled(false);break;
                  case 25 :s25.setEnabled(false);break;
              }
          }
         }
         catch (SQLException e){
         }
     }
     int i=0;
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{ 
         
         Connection con1 = DriverManager.getConnection(url, user, password); 
         String q= "insert into seat(did,bid,sid) "+"values(?,?,?)";
         PreparedStatement p1 = con1.prepareStatement(q);
         if(ae.getSource() == s1){
             s1.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,1);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s2){
             s2.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,2);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s3){
             s3.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,3);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s4){
             s4.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,4);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s5){
             s5.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,5);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s6){
             s6.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,6);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s7){
             s7.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,7);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s8){
             s8.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,8);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s9){
             s9.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,9);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s10){
             s10.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,10);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s11){
             s11.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,11);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s12){
             s12.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,12);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s13){
             s13.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,13);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s14){
             s14.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,14);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s15){
             s15.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,15);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s16){
             s16.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,16);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s17){
             s17.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,17);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s18){
             s18.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,18);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s19){
             s19.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,19);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s20){
             s20.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,20);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s21){
             s21.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,21);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s22){
             s22.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,22);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s23){
             s23.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,23);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s24){
             s24.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,24);
             p1.execute();
             i++;
         }
         if(ae.getSource() == s25){
             s25.setEnabled(false);
             p1.setInt(1,did);
             p1.setInt(2,bid);
             p1.setInt(3,25);
             p1.execute();
             i++;
         }
         System.out.println(i);
     
         if(ae.getSource() == p)
         {
          Statement ss2 = con1.createStatement();
          ResultSet r2=ss2.executeQuery("select price from details where did='"+did+"'");
          r2.next();
          int x=r2.getInt(1);
          System.out.println(x);
          int i0=i;
          int amt=x*i0;
          System.out.println(amt);
          String q2= "UPDATE booking set amt ="+amt+" WHERE bid="+bid;
          System.out.println("********");
          ss2.executeUpdate(q2);
          
          Payment_Details f1 =new Payment_Details(did,bid);
          f1.setSize(500,300);
          f1.setVisible(true);
          dispose();
         } 
        }
        catch (SQLException ex)
        {
            
        } 
    }
}
