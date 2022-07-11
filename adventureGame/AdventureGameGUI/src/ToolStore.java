
public class ToolStore extends javax.swing.JFrame {

   Player player;
    
    public ToolStore(Player player) {
        initComponents();
        this.player=player;  
        deneme(player);
    }   

    private ToolStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    //ahanda instance of metodu ile karakterlere özel ayrı silahlarımızı gösterteceğiz
    public void deneme(Object object){
        if(object instanceof Samurai){
            System.out.println("selam samurai");
        }
        else if(object instanceof Knight){
            System.out.println("selam knight");
        }
        else if(object instanceof Ninja){
            System.out.println("selam ninja");
        }
        else if(object instanceof Archer){
            System.out.println("selam archer");
        }
        else if(object instanceof Witch){
            System.out.println("selam witch");
        }
        else if(object instanceof Wizard){
            System.out.println("selam wizard");
        }
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        exp_buton = new javax.swing.JButton();
        level_buton = new javax.swing.JButton();
        money_buton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exp_buton.setText("Exp Al");
        exp_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_butonActionPerformed(evt);
            }
        });

        level_buton.setText("Level Al");
        level_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level_butonActionPerformed(evt);
            }
        });

        money_buton.setText("Para Al");
        money_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                money_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 198, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(level_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exp_buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(money_buton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(exp_buton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(level_buton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(money_buton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GameFrame fr = new GameFrame(this.player);
        this.dispose();
        fr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exp_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_butonActionPerformed
        player.getInv().setExp(player.getInv().getExp() + 1);
    }//GEN-LAST:event_exp_butonActionPerformed

    private void level_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level_butonActionPerformed
        player.inv.setLevel(player.getInv().getLevel() + 1);
    }//GEN-LAST:event_level_butonActionPerformed

    private void money_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_money_butonActionPerformed
        player.setMoney(player.getMoney() + 10);
    }//GEN-LAST:event_money_butonActionPerformed

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
            java.util.logging.Logger.getLogger(ToolStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToolStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToolStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToolStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToolStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exp_buton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton level_buton;
    private javax.swing.JButton money_buton;
    // End of variables declaration//GEN-END:variables
}
