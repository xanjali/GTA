/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gta;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author user
 */
public class signUp extends javax.swing.JFrame {

    
    private static final String url = "jdbc:mysql://localhost:3306/gta";
    private static final String user = "root";
    private static final String password = "root";
    int OwnerID;
    /**
     * Creates new form signUp
     */
    public signUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        OUName = new javax.swing.JLabel();
        OUNameField = new javax.swing.JTextField();
        OPassWord = new javax.swing.JLabel();
        OPassWordField = new javax.swing.JPasswordField();
        OCPassWord = new javax.swing.JLabel();
        OCPassWordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        OEmail = new javax.swing.JLabel();
        OEmailField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OUName.setText("Theatre Name");

        OUNameField.setToolTipText("");
        OUNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OUNameFieldActionPerformed(evt);
            }
        });
        OUNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OUNameFieldKeyPressed(evt);
            }
        });

        OPassWord.setText("Password");

        OPassWordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OPassWordFieldKeyPressed(evt);
            }
        });

        OCPassWord.setText("Confirm Password");

        OCPassWordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OCPassWordFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create Owner Account");

        Submit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 255));
        Submit.setText("Submit ");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        OEmail.setText("Email ID ");

        OEmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OEmailFieldKeyPressed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 0, 255));
        BackButton.setText("<");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        Status.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OUName, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPassWord)
                            .addComponent(OCPassWord)
                            .addComponent(OEmail))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OPassWordField)
                            .addComponent(OUNameField)
                            .addComponent(OCPassWordField)
                            .addComponent(OEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OUName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OUNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OEmail)
                    .addComponent(OEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPassWord))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCPassWord)
                    .addComponent(OCPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Status, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OUNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OUNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OUNameFieldActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Tname = OUNameField.getText();
        String Temail = OEmailField.getText();
        String TPassword = new String((OPassWordField.getPassword()));
        String TCPassword = new String((OCPassWordField.getPassword()));
        if(!TPassword.equals(TCPassword)){
            Status.setText("Passwords Do Not Match !!!");
        }
        else {
            
            try{
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement stmt = connection.createStatement();
                
                //The email id must be unique
                ResultSet RS = stmt.executeQuery("select * from theatre where temail ='"+Temail+"'");
                if(!RS.next()){
                    System.out.println("It Works !!");
                    // email is unique .. insert values
                    RS= stmt.executeQuery("select * from theatre ");
                    while(RS.next())
                        OwnerID = RS.getInt(1);
                    OwnerID++;
                    stmt.execute("insert into theatre(tid,tname,tpassword,temail) values("+String.valueOf(OwnerID)+",'"+Tname+"','"+TPassword+"','"+Temail+"')");
                    OwnerLogin OL = new OwnerLogin();
                    OL.setVisible(true);
                    dispose();
                }
                else{
                    // email is already registered display error
                    Status.setText("Email entered is already registered");
                    // facilitate data reentry
                }
                
                
            }
            catch(SQLException e){
              // Status.setText("<message>");
               e.printStackTrace();
            }
            }
    }//GEN-LAST:event_SubmitActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        owner_interface OI = new owner_interface();
        OI.setSize(500,300);
        OI.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void OUNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OUNameFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_OUNameFieldKeyPressed

    private void OEmailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OEmailFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_OEmailFieldKeyPressed

    private void OPassWordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OPassWordFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_OPassWordFieldKeyPressed

    private void OCPassWordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OCPassWordFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_OCPassWordFieldKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel OCPassWord;
    private javax.swing.JPasswordField OCPassWordField;
    private javax.swing.JLabel OEmail;
    private javax.swing.JTextField OEmailField;
    private javax.swing.JLabel OPassWord;
    private javax.swing.JPasswordField OPassWordField;
    private javax.swing.JLabel OUName;
    private javax.swing.JTextField OUNameField;
    private javax.swing.JLabel Status;
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
