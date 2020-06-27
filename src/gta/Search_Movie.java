package gta;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author anjali
 */
public class Search_Movie extends Frame implements ActionListener {
    private static final String url = "jdbc:mysql://localhost/dbname";
    private static final String user = "root";
    private static final String password = "root";

    private final static JButton l = new JButton("Logout");
    private final static JTextField name =new JTextField  (20);//button-Search movie
    private final static JButton search = new JButton ("Search");//Button-Search
    private static final JLabel m = new JLabel("");
    private final static JButton n = new JButton ("Next >>");//next button
    public Search_Movie() {
        setTitle("Search Movie/Select Movie");
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.gridx=0;
        c.gridy=2;
        g1.setConstraints(m, c);
        add(m);
        c.gridx=3;
        c.gridy=0;
        g1.setConstraints(l, c);
        add(l);
        c.weighty=0.0001;
        c.gridx=0;
        c.gridy=1;
        g1.setConstraints(name, c);
        add(name);
        c.gridx=1;
        g1.setConstraints(search, c);
        add(search);
        c.gridx=0;
        c.gridy=3;
        g1.setConstraints(n, c);
        add(n);
        name.addActionListener((ActionListener) this);
        search.addActionListener((ActionListener) this);
        n.addActionListener((ActionListener) this);
        l.addActionListener((ActionListener) this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {

                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try
        {
         if(ae.getSource() == n)
         {
           Select_Movie f = new Select_Movie();
           f.setSize(500,300);
           f.setVisible(true);
           dispose();
         } 
         if(ae.getSource() == l){
             Customer_Interface f1 = new Customer_Interface();
             f1.setSize(500,300);
             f1.setVisible(true);
             dispose();
         }
         else{
         if(ae.getSource() == search)
         {
          try {

            Connection con = DriverManager.getConnection(url, user, password);
            Statement s = con.createStatement();
            String a = name.getText();
            System.out.println(a);
            String q ="select * from abc where name = '"+a+"'";
            ResultSet r = s.executeQuery(q);
            while(r.next()){
                m.setText(r.getInt(1)+"   "+r.getString(2));
          }
        } catch (SQLException e) {
        }
        }
       } 
      }catch (Exception e){
      }
    }
    public static void main(String args[]) { 
        Search_Movie f1 = new Search_Movie();
        f1.setSize(500,300);
        f1.setVisible(true);
        
    }
}
