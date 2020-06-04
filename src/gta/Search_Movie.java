package gta;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author anjali
 */
public class Search_Movie extends JApplet implements ActionListener {

    private final JTextField name =new JTextField  (20);//button-Search movie
    private final JButton search = new JButton ("Search");//Button-Search
    private final JLabel m= new JLabel("<< movie posters >>");
    @Override
    public void init() {
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(name, c);
        add(name);
        g1.setConstraints(search, c);
        add(search);
        c.gridy=1;
        g1.setConstraints(m, c);
        add(m);
        
        search.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
