package shop.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Computer extends javax.swing.JFrame {

    /** Creates new form Computer */
    public Computer() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ptype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pquantity = new javax.swing.JTextField();
        mprice = new javax.swing.JTextField();
        pbuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mtype = new javax.swing.JComboBox<>();
        pprice = new javax.swing.JTextField();
        mquantity = new javax.swing.JTextField();
        mbuy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rtype = new javax.swing.JComboBox<>();
        gquantity = new javax.swing.JTextField();
        rprice = new javax.swing.JTextField();
        gbuy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        gtype = new javax.swing.JComboBox<>();
        gprice = new javax.swing.JTextField();
        rquantity = new javax.swing.JTextField();
        rbuy = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Processors");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type");

        ptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD Ryzen 9", "AMD Ryzen 7", "AMD Ryzen 5", "AMD Ryzen 3", "INTEL Core i 9", "INTEL Core i 7", "INTEL Core i 5", "INTEL Core i 3" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        mprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpriceActionPerformed(evt);
            }
        });

        pbuy.setText("Buy");
        pbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbuyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Motherboard");

        mtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gigabyte X570 Aorus Xtreme DDR4 AM4 Socket AMD Motherboard", "Gigabyte B450M AORUS Elite AMD Gaming Motherboard", "Gigabyte Z490 Aorus Elite AC 10th Gen WiFi ATX Motherboard", "ASUS ROG Strix Z490-E Gaming Wi-Fi Intel 10th Gen ATX Motherboard", "ASUS TUF Gaming B550 Plus ATX AM4 Motherboard", "ASUS  Prime H410M-CS DDR4 10th Gen Intel 1200 Socket Micro ATX Motherboard", "Asrock Z590M Phantom Gaming 4 10th and 11th Gen ATX Motherboard", "Asrock B550 Phantom Gaming 4 AMD Motherboard", "Asrock B550M Steel Legend DDR4 AMD Motherboard" }));
        mtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtypeActionPerformed(evt);
            }
        });

        pprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppriceActionPerformed(evt);
            }
        });

        mbuy.setText("Buy");
        mbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbuyActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ram");

        rtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corsair Dominator Platinum RGB 8GB 3200MHz DDR4 RAM", "Corsair Dominator Platinum RGB 8GB 3600MHz DDR4 RAM", "Corsair Vengeance RGB Pro 16GB DDR4 3600MHz RAM", "G.skill Trident Z NEO RGB 8GB 3600MHz Gaming Desktop RAM", "G.skill Trident Z 8GB DDR4 3200MHz Desktop RAM", "G.skill Trident Z RGB 8GB DDR4 3200MHz Gaming Desktop RAM" }));

        gquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gquantityActionPerformed(evt);
            }
        });

        rprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpriceActionPerformed(evt);
            }
        });

        gbuy.setText("Buy");
        gbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbuyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GPU");

        gtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gigabyte rtx 3090", "Gigabyte rtx 3070", "Gigabyte rtx 2080 ti", "Sapphire r5 230", "Sapphire 6670", "Sapphire 7810" }));

        gprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpriceActionPerformed(evt);
            }
        });

        rquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rquantityActionPerformed(evt);
            }
        });

        rbuy.setText("Buy");
        rbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbuyActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(ptype, 0, 186, Short.MAX_VALUE)
                        .addComponent(mtype, 0, 1, Short.MAX_VALUE)
                        .addComponent(rtype, 0, 1, Short.MAX_VALUE))
                    .addComponent(gtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mprice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rprice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gprice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(gbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rtype, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(rbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gprice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)))
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1081, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpriceActionPerformed

    private void mtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtypeActionPerformed

    private void ppriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppriceActionPerformed

    private void gquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gquantityActionPerformed

    private void rpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpriceActionPerformed

    private void gpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpriceActionPerformed

    private void rquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rquantityActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        home hm = new home();        
hm.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbuyActionPerformed

      String pt = String.valueOf(ptype.getSelectedItem());
        String pp = pprice.getText();
        String pq = pquantity.getText();
        if(pt.isEmpty() || pp.isEmpty() || pq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO processor (ptype,pprice,pquantity) VALUES(?,?,?)");



            st.setString(1, pt);
            st.setString(2, pp);
            st.setString(3, pq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            pprice.setText("");
            pprice.requestFocus();
            ptype.setSelectedItem("");
            pquantity.setText("");

        }

        }

    }//GEN-LAST:event_pbuyActionPerformed

    private void mbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbuyActionPerformed
        String mt = String.valueOf(mtype.getSelectedItem());
        String mp = mprice.getText();
        String mq = mquantity.getText();
        if(mt.isEmpty() || mp.isEmpty() || mq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO motherboard (mtype,mprice,mquantity) VALUES(?,?,?)");



            st.setString(1, mt);
            st.setString(2, mp);
            st.setString(3, mq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            mprice.setText("");
            mprice.requestFocus();
            mtype.setSelectedItem("");
            mquantity.setText("");

        }

        }
    }//GEN-LAST:event_mbuyActionPerformed

    private void rbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbuyActionPerformed
         String rt = String.valueOf(rtype.getSelectedItem());
        String rp = rprice.getText();
        String rq = rquantity.getText();
        if(rt.isEmpty() || rp.isEmpty() || rq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO ram (rtype,rprice,rquantity) VALUES(?,?,?)");



            st.setString(1, rt);
            st.setString(2, rp);
            st.setString(3, rq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            rprice.setText("");
            rprice.requestFocus();
            rtype.setSelectedItem("");
            rquantity.setText("");

        }

        }
    }//GEN-LAST:event_rbuyActionPerformed

    private void gbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbuyActionPerformed
             String gt = String.valueOf(gtype.getSelectedItem());
        String gp = gprice.getText();
        String gq = gquantity.getText();
        if(gt.isEmpty() || gp.isEmpty() || gq.isEmpty()){
             JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);
        }else{

             Connection dbcon = DBconnect.connectDB();

            try {
                PreparedStatement st = (PreparedStatement)
                dbcon.prepareStatement("INSERT INTO gpu (gtype,gprice,gquantity) VALUES(?,?,?)");



            st.setString(1, gt);
            st.setString(2, gp);
            st.setString(3, gq);





            int rs = st.executeUpdate();



            JOptionPane.showMessageDialog(this, "Buy Successful.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);

               dispose();
               Payment hm = new Payment();
               hm.setVisible(true);

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill up the form properly.", 
                     "Error", JOptionPane.ERROR_MESSAGE);

            gprice.setText("");
            gprice.requestFocus();
            gtype.setSelectedItem("");
            gquantity.setText("");

        }

        }
    }//GEN-LAST:event_gbuyActionPerformed

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
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Computer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Computer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gbuy;
    private javax.swing.JTextField gprice;
    private javax.swing.JTextField gquantity;
    private javax.swing.JComboBox<String> gtype;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mbuy;
    private javax.swing.JTextField mprice;
    private javax.swing.JTextField mquantity;
    private javax.swing.JComboBox<String> mtype;
    private javax.swing.JButton pbuy;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField pquantity;
    private javax.swing.JComboBox<String> ptype;
    private javax.swing.JButton rbuy;
    private javax.swing.JTextField rprice;
    private javax.swing.JTextField rquantity;
    private javax.swing.JComboBox<String> rtype;
    // End of variables declaration//GEN-END:variables

}
