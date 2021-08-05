/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dj_Artist;

import Model.DBconnection;
import Welcome.Welcome1;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RwB - Pc
 */
public class djBookingList extends javax.swing.JFrame {

    /**
     * Creates new form djBookingList
     */
    public djBookingList() {
        initComponents();
        findUsers();
    }

    public ArrayList<djList> ListUsers(String ValToSearch)
    {
        ArrayList<djList> usersList = new ArrayList<djList>();
        
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        try{
            String searchQuery ="SELECT * FROM `djcart` WHERE CONCAT(`dcID`,`dcCName`,`dcName`, `dcBDate`, `dcBLocation`, `dcNOH`, `dcTotal`) LIKE '%"+ValToSearch+"%'";
            ps= DBconnection.getConnection().prepareStatement(searchQuery );
            rs=ps.executeQuery(searchQuery );
            
            djList SL;
            
            while(rs.next())
            {
                SL = new djList(
                                 rs.getInt("dcID"),
                                 rs.getString("dcCName"),
                                 rs.getString("dcName"),
                                 rs.getString("dcBDate"),
                                 rs.getString("dcBLocation"),
                                 rs.getInt("dcNOH"),
                                 rs.getInt("dcTotal")
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
        ArrayList<djList> djcart = ListUsers(djS.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Id","Customer Name ","Name ","Booking Date","Booking Location","Number of Hours need","Total"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < djcart.size(); i++)
        {
            row[0] = djcart.get(i).getId();
            row[1] = djcart.get(i).getdjCName();
            row[2] = djcart.get(i).getdjName();
            row[3] = djcart.get(i).getBDate();
            row[4] = djcart.get(i).getBL();
            row[5] = djcart.get(i).getnoh();
            row[6] = djcart.get(i).gettot();
            
            model.addRow(row);
        }
       jTable_djlist.setModel(model);
       
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        djS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_djS = new javax.swing.JButton();
        bBaccept = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_djlist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        djS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                djSActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Name");

        jButton_djS.setBackground(new java.awt.Color(0, 0, 102));
        jButton_djS.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton_djS.setForeground(new java.awt.Color(255, 255, 255));
        jButton_djS.setText("Search");
        jButton_djS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_djS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_djSActionPerformed(evt);
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_about_24px.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_left_26px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(djS, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton_djS, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(bBaccept, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(djS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_djS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bBaccept, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTable_djlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_djlist);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void djSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_djSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_djSActionPerformed

    private void jButton_djSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_djSActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton_djSActionPerformed

    private void bBacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBacceptActionPerformed
        PreparedStatement ps;
        Statement st;
        ResultSet rs;
        
        try{
            String sql ="DELETE FROM djcart WHERE dcName=?";
            ps= DBconnection.getConnection().prepareStatement(sql );

            ps.setString(1, djS.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"Booking Accepted!");

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        findUsers();
    }//GEN-LAST:event_bBacceptActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
           JOptionPane.showMessageDialog(null, "Music HUB Is A Unique Platform That Provides Solo Music Artist, Music Band And Dj Artist Worldwide. \n           We Have Top Industry Professionals From Around The World Ready To Play Your Event. \n                 All Work Is Done Remotely,You Can Just Hire You Artist or You Can Work With Us.\n\n                                                                     Thank You!!!\n\n                                                                      Contact Us\n                                                    Email :- musichub@musichub.com", "About Us", 1);       

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(djBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(djBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(djBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(djBookingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new djBookingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBaccept;
    private javax.swing.JTextField djS;
    private javax.swing.JButton jButton_djS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_djlist;
    // End of variables declaration//GEN-END:variables
}
