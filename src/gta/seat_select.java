package gta;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class seat_select extends Frame implements ActionListener {
    
    private final JButton s1= new JButton("s1 ");  
    private final JButton s2= new JButton("s2 ");
    private final JButton s3= new JButton("s3 ");
    private final JButton s4= new JButton("s4 ");
    private final JButton s5= new JButton("s5 ");
    
    private final JButton s6= new JButton("s6 ");
    private final JButton s7= new JButton("s7 ");
    private final JButton s8= new JButton("s8 ");
    private final JButton s9= new JButton("s9 ");
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
    
    private final JButton p= new JButton("Pay");
    
    protected int mid=1;
    protected int cid=1;
    protected int tid=2;
     public seat_select(int idm,int idc,int idt){
         mid=idm;
         cid=idc;
         tid=idt;
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
        seat_select f =new seat_select(1,1,2);
        f.setSize(500,300);
        f.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try{
         
            
            
            
            
            
   
         if(ae.getSource() == p)
         {
          Payment_Details f1 =new Payment_Details();
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
