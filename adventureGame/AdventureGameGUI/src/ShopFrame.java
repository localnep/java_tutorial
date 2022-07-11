
import javax.swing.JOptionPane;


public class ShopFrame extends javax.swing.JFrame {

    protected Player player;
    
    public ShopFrame(Player player) {
        this.setResizable(false);
        this.player = player;
        initComponents();
    }

    private ShopFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        damage_buton = new javax.swing.JButton();
        armor_buton = new javax.swing.JButton();
        potion_buton = new javax.swing.JButton();
        home_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        damage_buton.setBackground(new java.awt.Color(255, 255, 255));
        damage_buton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\sword.png")); // NOI18N
        damage_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage_butonActionPerformed(evt);
            }
        });

        armor_buton.setBackground(new java.awt.Color(255, 255, 255));
        armor_buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/armor.png"))); // NOI18N
        armor_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armor_butonActionPerformed(evt);
            }
        });

        potion_buton.setBackground(new java.awt.Color(255, 255, 255));
        potion_buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/potion.png"))); // NOI18N
        potion_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potion_butonActionPerformed(evt);
            }
        });

        home_buton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\home.png")); // NOI18N
        home_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(damage_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(armor_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(potion_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(home_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(home_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(armor_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damage_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potion_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_butonActionPerformed
        GameFrame fr = new GameFrame(this.player);
        this.dispose();
        fr.setVisible(true);
    }//GEN-LAST:event_home_butonActionPerformed

    private void damage_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage_butonActionPerformed
        DamageStoreFrame dsf = new DamageStoreFrame(player);
        this.dispose();
        dsf.setVisible(true);
    }//GEN-LAST:event_damage_butonActionPerformed

    private void armor_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armor_butonActionPerformed
        JOptionPane.showMessageDialog(this, "maybe soon");
    }//GEN-LAST:event_armor_butonActionPerformed

    private void potion_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potion_butonActionPerformed
        JOptionPane.showMessageDialog(this, "maybe soon");
    }//GEN-LAST:event_potion_butonActionPerformed


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
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton armor_buton;
    private javax.swing.JButton damage_buton;
    private javax.swing.JButton home_buton;
    private javax.swing.JButton potion_buton;
    // End of variables declaration//GEN-END:variables
}
