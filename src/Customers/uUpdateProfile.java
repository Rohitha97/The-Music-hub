/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import java.text.SimpleDateFormat;
import Model.DBconnection;
import Welcome.Welcome1;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class uUpdateProfile extends javax.swing.JFrame {

  
    public uUpdateProfile() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uFName = new javax.swing.JTextField();
        uUName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uPNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        canceluser = new javax.swing.JButton();
        sSignin = new javax.swing.JButton();
        uPWD = new javax.swing.JPasswordField();
        uMale = new javax.swing.JRadioButton();
        uFemale = new javax.swing.JRadioButton();
        uLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        uBirthday = new com.toedter.calendar.JDateChooser();
        textS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Profile");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fist Name");

        uFName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        uUName.setEditable(false);
        uUName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone Number");

        uPNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        uPNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uPNoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        uEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");

        canceluser.setBackground(new java.awt.Color(255, 0, 0));
        canceluser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        canceluser.setForeground(new java.awt.Color(255, 255, 255));
        canceluser.setText("CANCEL");
        canceluser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        canceluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceluserActionPerformed(evt);
            }
        });

        sSignin.setBackground(new java.awt.Color(255, 0, 0));
        sSignin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sSignin.setForeground(new java.awt.Color(255, 255, 255));
        sSignin.setText("UPDATE");
        sSignin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSigninActionPerformed(evt);
            }
        });

        uMale.setForeground(new java.awt.Color(255, 255, 255));
        uMale.setText("Male");

        uFemale.setForeground(new java.awt.Color(255, 255, 255));
        uFemale.setText("Female");

        uLName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");

        uAddress.setColumns(20);
        uAddress.setRows(5);
        jScrollPane2.setViewportView(uAddress);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");

        textS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textS.setForeground(new java.awt.Color(153, 153, 153));
        textS.setText("                                       Enter the User Name to Search"); // NOI18N
        textS.setToolTipText("");
        textS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSFocusLost(evt);
            }
        });
        textS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(sSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(canceluser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(uMale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(uFemale))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uLName)
                            .addComponent(uFName)
                            .addComponent(uUName)
                            .addComponent(uPWD)
                            .addComponent(uPNo)
                            .addComponent(uEmail)
                            .addComponent(uBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
                    .addComponent(textS))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(textS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(uFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(uLName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(uUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(uPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(uPNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(uBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(uFemale)
                    .addComponent(uMale))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canceluser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uPNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uPNoKeyTyped

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_uPNoKeyTyped

    private void canceluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceluserActionPerformed

        dispose();
    }//GEN-LAST:event_canceluserActionPerformed

    private void sSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSigninActionPerformed

        String ufname=uFName.getText();
        String ulname=uLName.getText();
        String uuname = uUName.getText();
        String upass = String.valueOf(uPWD.getPassword());
        String uphone = uPNo.getText();
        String uemail = uEmail.getText();

        SimpleDateFormat dateformate = new SimpleDateFormat("yyyy-MM-dd");
        String ubdate = dateformate.format(uBirthday.getDate());

        String uaddress = uAddress.getText();
        String ugender = "Male";
        if(uFemale.isSelected()){
            ugender = "Female";
        }

        PreparedStatement ps;
        
            int p = JOptionPane.showConfirmDialog(null, "Are you sure to update this record ?","Update Recoed",JOptionPane.YES_NO_OPTION);
            
            if(p==0){

                try {

                    String query = "UPDATE userregister SET uFName=?,uLName=?,uUName=?,uPWD=?,uPNo=?, uEmail=?,uBirthday=?, uAddress=?, uGender=? WHERE uUName=?";
                    ps = DBconnection.getConnection().prepareStatement(query);

                    ps.setString(1, ufname);
                    ps.setString(2, ulname);
                    ps.setString(3, uuname);
                    ps.setString(4, upass);
                    ps.setString(5, uphone);
                    ps.setString(6, uemail);
                    ps.setString(7, ubdate);
                    ps.setString(8, uaddress);
                    ps.setString(9, ugender);
                    ps.setString(10, uuname);

                    ps.executeUpdate();

                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
                    dispose();
                } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null,ex);
                }
            }

    }//GEN-LAST:event_sSigninActionPerformed

    private void textSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSFocusGained
        if(textS.getText().trim().equals("Enter the User Name to Search")  ){
          //  textS.setText("");
            textS.setForeground(new Color(153,153,153));
        }
        textS.setForeground(Color.BLACK);
    }//GEN-LAST:event_textSFocusGained

    private void textSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSFocusLost

        
        if(textS.getText().trim().equals(" ")  ){
            textS.setText("                 Enter the User Name to Search ");
            uFName.setText(" ");
            uLName.setText(" ");
            uUName.setText(" ");
            uPWD.setText(" ");
            uPNo.setText(" ");
            uEmail.setText(" ");
            uAddress.setText(" ");
            uMale.setSelected(false);
            uFemale.setSelected(false);
        }
    }//GEN-LAST:event_textSFocusLost

    private void textSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            PreparedStatement ps;
            ResultSet rs;
            try{

                ps = DBconnection.getConnection().prepareStatement("SELECT * FROM `userregister` WHERE `uUName`=?");
                ps.setString(1,textS.getText());
                rs=ps.executeQuery();

                if(rs.next()){
                    uFName.setText(rs.getString(2));
                    uLName.setText(rs.getString(3));
                    uUName.setText(rs.getString(4));
                    uPWD.setText(rs.getString(5));
                    uPNo.setText(rs.getString(6));
                    uEmail.setText(rs.getString(7));
                    uBirthday.setDate(rs.getDate(8));
                    uAddress.setText(rs.getString(9));

                    if(rs.getString(10).equals("Male")){
                        uMale.setSelected(true);
                        uFemale.setSelected(false);
                    }else if(rs.getString(10).equals("Female")){
                        uMale.setSelected(false);
                        uFemale.setSelected(true);
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(uUpdateProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_textSKeyPressed

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
            java.util.logging.Logger.getLogger(uUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uUpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceluser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sSignin;
    private javax.swing.JTextField textS;
    private javax.swing.JTextArea uAddress;
    private com.toedter.calendar.JDateChooser uBirthday;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uFName;
    private javax.swing.JRadioButton uFemale;
    private javax.swing.JTextField uLName;
    private javax.swing.JRadioButton uMale;
    private javax.swing.JTextField uPNo;
    private javax.swing.JPasswordField uPWD;
    private javax.swing.JTextField uUName;
    // End of variables declaration//GEN-END:variables
}
