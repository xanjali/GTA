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
public class signUpUser extends javax.swing.JFrame {
    private static final String url = "jdbc:mysql://localhost:3306/gta?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "Karthik@1234";
    int CustomerID;
    /**
     * Creates new form signUpUser
     */
    public signUpUser() {
        initComponents();
        CustomerID=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UName = new javax.swing.JLabel();
        UNameField = new javax.swing.JTextField();
        UEmail = new javax.swing.JLabel();
        UEmailField = new javax.swing.JTextField();
        UPassword = new javax.swing.JLabel();
        UPassWordField = new javax.swing.JPasswordField();
        UCPassWord = new javax.swing.JLabel();
        UCPassWordField = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create User Account");

        UName.setText("User Name ");

        UNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UNameFieldKeyPressed(evt);
            }
        });

        UEmail.setText("Email ID");

        UEmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UEmailFieldKeyPressed(evt);
            }
        });

        UPassword.setText("Password");

        UPassWordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UPassWordFieldKeyPressed(evt);
            }
        });

        UCPassWord.setText("Confirm Password");

        UCPassWordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UCPassWordFieldActionPerformed(evt);
            }
        });
        UCPassWordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UCPassWordFieldKeyPressed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 255));
        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Status.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(UNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UName)
                                    .addComponent(UPassword)
                                    .addComponent(UCPassWord))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UPassWordField)
                                    .addComponent(UCPassWordField, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UName)
                    .addComponent(UNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UEmail))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPassword)
                    .addComponent(UPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UCPassWord)
                    .addComponent(UCPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Status, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Close.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 0, 51));
        Close.setText("X");

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BackButton.setForeground(new java.awt.Color(0, 0, 255));
        BackButton.setText("<");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(Close))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close)
                    .addComponent(BackButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UCPassWordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UCPassWordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UCPassWordFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Customer_Interface CI = new Customer_Interface();
        CI.setSize(500,300);
        CI.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Uname = UNameField.getText();
        String Uemail = UEmailField.getText();
        String UPassword = new String((UPassWordField.getPassword()));
        String UCPassword = new String((UCPassWordField.getPassword()));
        if(!UPassword.equals(UCPassword)){
            Status.setText("Passwords Do Not Match !!!");
        }
        else {
            
            try{
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement stmt = connection.createStatement();
                
                //The email id must be unique
                ResultSet RS = stmt.executeQuery("select * from customer where cemail ='"+Uemail+"'");
                if(!RS.first()){
                    // email is unique .. insert values
                    RS= stmt.executeQuery("select * from customer ");
                    while(RS.next())
                        CustomerID = RS.getInt(1);
                    CustomerID++;
                    stmt.execute("insert into customer(cid,cname,cpassword,cemail) values("+String.valueOf(CustomerID)+",'"+Uname+"','"+UPassword+"','"+Uemail+"')");
                    CustomerLogin CL = new CustomerLogin();
                    CL.setVisible(true);
                    dispose();
                }
                else{
                    // email is already registered display error
                    Status.setText("Email entered is already registered");
                    // facilitate data reentry
                }
                
                
            }
            catch(SQLException e){
                e.printStackTrace();
            }
            }
    }//GEN-LAST:event_SubmitActionPerformed

    private void UNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UNameFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_UNameFieldKeyPressed

    private void UEmailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UEmailFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_UEmailFieldKeyPressed

    private void UPassWordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UPassWordFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_UPassWordFieldKeyPressed

    private void UCPassWordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UCPassWordFieldKeyPressed
        // TODO add your handling code here:
        Status.setText("");
    }//GEN-LAST:event_UCPassWordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(signUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUpUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Close;
    private javax.swing.JLabel Status;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel UCPassWord;
    private javax.swing.JPasswordField UCPassWordField;
    private javax.swing.JLabel UEmail;
    private javax.swing.JTextField UEmailField;
    private javax.swing.JLabel UName;
    private javax.swing.JTextField UNameField;
    private javax.swing.JPasswordField UPassWordField;
    private javax.swing.JLabel UPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
