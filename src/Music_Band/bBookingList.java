/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music_Band;

import Model.DBconnection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Welcome.Welcome1;


/**
 *
 * @author RwB - Pc
 */
public class bBookingList extends javax.swing.JFrame {

    /**
     * Creates new form bBookingList
     */
    public bBookingList() {
        initComponents();
        findUsers();
    }

    public ArrayList<bList> ListUsers(String ValToSearch)
    {
        ArrayList<bList> usersList = new ArrayList<bList>();
        
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        try{
            String searchQuery ="SELECT * FROM `bandcart` WHERE CONCAT(`bcID`,`bcCName`, `bcName`, `bcBDate`, `bcBLocation`, `bcNOH`, `bcTotal`) LIKE '%"+ValToSearch+"%'";
            ps= DBconnection.getConnection().prepareStatement(searchQuery );
            rs=ps.executeQuery(searchQuery );
            
            bList SL;
            
            while(rs.next())
            {
                SL = new bList(
                                 rs.getInt("bcID"),
                                 rs.getString("bcCName"),
                                 rs.getString("bcName"),
                                 rs.getString("bcBDate"),
                                 rs.getString("bcBLocation"),
                                 rs.getInt("bcNOH"),
                                 rs.getInt("bcTotal")
                                );
                usersList.add(SL);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return usersList;
    }    
    

    public void findUsers()
    {
        ArrayList<bList> bcart = ListUsers(bandS.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Id","Customer Name ","Name ","Booking Date","Booking Location","Number of Hours need","Total"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < bcart.size(); i++)
        {
            row[0] = bcart.get(i).getId();
            row[1] = bcart.get(i).getbCName();
            row[2] = bcart.get(i).getbName();
            row[3] = bcart.get(i).getBDate();
            row[4] = bcart.get(i).getBL();
            row[5] = bcart.get(i).getnoh();
            row[6] = bcart.get(i).gettot();
            
            model.addRow(row);
        }
       jTable_blist.setModel(model);
       
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_blist = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bandS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_bS = new javax.swing.JButton();
        bBaccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_blist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_blist);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        bandS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandSActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Name");

        jButton_bS.setBackground(new java.awt.Color(0, 0, 102));
        jButton_bS.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton_bS.setForeground(new java.awt.Color(255, 255, 255));
        jButton_bS.setText("Search");
        jButton_bS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_bS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bSActionPerformed(evt);
            }
        });

        bBaccept.setBackground(new java.awt.Color(204, 0, 0));
        bBaccept.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bBaccept.setForeground(new java.awt.Color(255, 255, 255));
        bBaccept.setText("Accept your booking");
        bBaccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bBaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBacceptActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_left_26px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_about_24px.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bandS, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton_bS, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBaccept, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bandS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_bS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bBaccept, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bandSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandSActionPerformed

    private void jButton_bSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bSActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton_bSActionPerformed

    private void bBacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBacceptActionPerformed
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        String sql ="DELETE FROM bandcart WHERE bcName=?";
        try{
            ps= DBconnection.getConnection().prepareStatement(sql );
            
            ps.setString(1, bandS.getText());
            ps.executeUpdate();

           JOptionPane.showMessageDialog(null,"Booking Accepted!");

        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
        }
        findUsers();
    }//GEN-LAST:event_bBacceptActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
                    JOptionPane.showMessageDialog(null, "Music HUB Is A Unique Platform That Provides Solo Music Artist, Music Band And Dj Artist Worldwide. \n           We Have Top Industry Professionals From Around The World Ready To Play Your Event. \n                 All Work Is Done Remotely,You Can Just Hire You Artist or You Can Work With Us.\n\n                                                                     Thank You!!!\n\n                                                                      Contact Us\n                                                    Email :- musichub@musichub.com", "About Us", 1);       

    }//GEN-LAST:event_jLabel4MouseClicked
    
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
            java.util.logging.Logger.getLogger(bBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bBookingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBaccept;
    private javax.swing.JTextField bandS;
    private javax.swing.JButton jButton_bS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_blist;
    // End of variables declaration//GEN-END:variables
}
