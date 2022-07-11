
import javax.swing.JOptionPane;

public class levelupForm extends javax.swing.JFrame {

 
    protected Player player;
    protected int remaining = 3;
    protected final int nowHealth,nowEnergy,nowMagic,nowDamage,nowDefence,nowCritical;
    
    
    public levelupForm(Player player) {
        this.setResizable(false);
        this.player = player;
        initComponents();
        nowHealth = player.getHealth();
        nowEnergy = player.getEnergy();
        nowMagic = player.getMagic();
        nowDamage = player.getDamage();
        nowDefence = player.getDefence();
        nowCritical = player.getCritical();
    }

    private levelupForm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean plusMethod(){
        if(this.remaining >0){
            this.remaining--;
            remaining_label.setText("       " +remaining);
            return true;
        }
        else{
            return false;
        }
        //System.out.println(this.remaining);
    }
    
    private boolean minusMethod(){
        if(this.remaining <3){
            this.remaining++;
            remaining_label.setText("       " + remaining);
            return true;
        }
        else{
            return false;
        }        
        //System.out.println(this.remaining);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerSkill_panel = new javax.swing.JPanel();
        damage_label = new javax.swing.JLabel();
        health_label = new javax.swing.JLabel();
        magic_label = new javax.swing.JLabel();
        energy_label = new javax.swing.JLabel();
        defence_label = new javax.swing.JLabel();
        critical_label = new javax.swing.JLabel();
        health_plus = new javax.swing.JButton();
        health_minus = new javax.swing.JButton();
        energy_minus = new javax.swing.JButton();
        magic_minus = new javax.swing.JButton();
        damage_minus = new javax.swing.JButton();
        defence_minus = new javax.swing.JButton();
        critical_minus = new javax.swing.JButton();
        critical_plus = new javax.swing.JButton();
        defence_plus = new javax.swing.JButton();
        damage_plus = new javax.swing.JButton();
        magic_plus = new javax.swing.JButton();
        energy_plus = new javax.swing.JButton();
        skill_points = new javax.swing.JLabel();
        remaining_label = new javax.swing.JLabel();
        continue_button = new javax.swing.JButton();
        hero_label = new javax.swing.JLabel();
        level_up_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Level Up!");

        //mouseEntered_panel.setVisible(false);
        playerSkill_panel.setBackground(new java.awt.Color(255, 255, 153));
        playerSkill_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerSkill_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playerSkill_panel.setFocusable(false);
        playerSkill_panel.setPreferredSize(new java.awt.Dimension(90, 120));

        damage_label.setForeground(new java.awt.Color(153, 153, 153));
        damage_label.setText("Damage: " + this.player.getDamage());
        damage_label.setPreferredSize(new java.awt.Dimension(60, 13));

        health_label.setForeground(new java.awt.Color(153, 153, 153));
        health_label.setText("Health: " + this.player.getHealth());
        health_label.setPreferredSize(new java.awt.Dimension(60, 13));

        magic_label.setForeground(new java.awt.Color(153, 153, 153));
        magic_label.setText("Magic: " + this.player.getMagic());
        magic_label.setPreferredSize(new java.awt.Dimension(60, 13));

        energy_label.setForeground(new java.awt.Color(153, 153, 153));
        energy_label.setText("Energy: " + this.player.getEnergy());
        energy_label.setPreferredSize(new java.awt.Dimension(60, 13));

        defence_label.setForeground(new java.awt.Color(153, 153, 153));
        defence_label.setText("Defence: " +this.player.getDefence());
        defence_label.setPreferredSize(new java.awt.Dimension(60, 13));

        critical_label.setForeground(new java.awt.Color(153, 153, 153));
        critical_label.setText("Critical: " + this.player.getCritical());
        critical_label.setPreferredSize(new java.awt.Dimension(60, 13));

        health_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        health_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                health_plusActionPerformed(evt);
            }
        });

        health_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        health_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                health_minusActionPerformed(evt);
            }
        });

        energy_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        energy_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energy_minusActionPerformed(evt);
            }
        });

        magic_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        magic_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magic_minusActionPerformed(evt);
            }
        });

        damage_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        damage_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage_minusActionPerformed(evt);
            }
        });

        defence_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        defence_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defence_minusActionPerformed(evt);
            }
        });

        critical_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        critical_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critical_minusActionPerformed(evt);
            }
        });

        critical_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        critical_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critical_plusActionPerformed(evt);
            }
        });

        defence_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        defence_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defence_plusActionPerformed(evt);
            }
        });

        damage_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        damage_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage_plusActionPerformed(evt);
            }
        });

        magic_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        magic_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magic_plusActionPerformed(evt);
            }
        });

        energy_plus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\plus.png")); // NOI18N
        energy_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energy_plusActionPerformed(evt);
            }
        });

        skill_points.setText("<html>skill points<br>remaining<br></html>");

        remaining_label.setText("       3");

        javax.swing.GroupLayout playerSkill_panelLayout = new javax.swing.GroupLayout(playerSkill_panel);
        playerSkill_panel.setLayout(playerSkill_panelLayout);
        playerSkill_panelLayout.setHorizontalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerSkill_panelLayout.createSequentialGroup()
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(critical_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(defence_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(health_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(energy_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(magic_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(damage_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(defence_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(damage_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(magic_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(energy_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(health_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critical_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(magic_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(energy_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critical_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defence_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damage_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(health_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(skill_points)
                    .addComponent(remaining_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        playerSkill_panelLayout.setVerticalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerSkill_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(health_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(health_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(health_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerSkill_panelLayout.createSequentialGroup()
                        .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(energy_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energy_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(energy_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(magic_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magic_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(magic_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(skill_points, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damage_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damage_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remaining_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(playerSkill_panelLayout.createSequentialGroup()
                        .addComponent(defence_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(critical_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerSkill_panelLayout.createSequentialGroup()
                        .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defence_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defence_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(critical_plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(critical_minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        continue_button.setText("Continue");
        continue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_buttonActionPerformed(evt);
            }
        });

        hero_label.setIcon(GameFrame.getIcon());

        level_up_label.setText("Level Up " + player.getInv().getLevel());
        level_up_label.setFont(new java.awt.Font("Bradley Hand ITC", 2, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(continue_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hero_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(level_up_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(level_up_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hero_label, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continue_button)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void health_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_health_plusActionPerformed
        if(plusMethod()){
            player.setHealth(player.getHealth() + 1);
            health_label.setText("Health: " + this.player.getHealth());
        }
    }//GEN-LAST:event_health_plusActionPerformed

    private void energy_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energy_plusActionPerformed
        if(plusMethod()){
            player.setEnergy(player.getEnergy() + 1);
            energy_label.setText("Energy: " + this.player.getEnergy());
        }
    }//GEN-LAST:event_energy_plusActionPerformed

    private void magic_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magic_plusActionPerformed
        if(plusMethod()){
            player.setMagic(player.getMagic() + 1);
            magic_label.setText("Magic: " + this.player.getMagic());
        }
    }//GEN-LAST:event_magic_plusActionPerformed

    private void damage_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage_plusActionPerformed
        if(plusMethod()){
            player.setDamage(player.getDamage() +1);
            damage_label.setText("Damage: " + this.player.getDamage());
        }
    }//GEN-LAST:event_damage_plusActionPerformed

    private void defence_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defence_plusActionPerformed
        if(plusMethod()){
            player.setDefence(player.getDefence() +1);
            defence_label.setText("Defence: " + this.player.getDefence());
        }
    }//GEN-LAST:event_defence_plusActionPerformed

    private void critical_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critical_plusActionPerformed
        if(plusMethod()){
            player.setCritical(player.getCritical() +1);
            critical_label.setText("Critical: " + this.player.getCritical());
        }
    }//GEN-LAST:event_critical_plusActionPerformed

    private void health_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_health_minusActionPerformed
        if(nowHealth != player.getHealth()){ //değeri fazladan düşürmeyi engellemek için
            if(minusMethod()){
            player.setHealth(player.getHealth() - 1);
            health_label.setText("Health: " + this.player.getHealth());
        }
    }
    }//GEN-LAST:event_health_minusActionPerformed

    private void energy_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energy_minusActionPerformed
        if(nowEnergy != player.getEnergy()){  
        if(minusMethod()){
            player.setEnergy(player.getEnergy() -1);
            energy_label.setText("Energy: " + this.player.getEnergy());
        }
    }
    }//GEN-LAST:event_energy_minusActionPerformed

    private void magic_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magic_minusActionPerformed
        if(nowMagic != player.getMagic()){
            if(minusMethod()){
            player.setMagic(player.getMagic() -1);
            magic_label.setText("Magic: " + this.player.getMagic());
        }
    }
    }//GEN-LAST:event_magic_minusActionPerformed

    private void damage_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage_minusActionPerformed
        if(nowDamage != player.getDamage()){
            if(minusMethod()){
            player.setDamage(player.getDamage() -1);
            damage_label.setText("Damage: " + this.player.getDamage());
        }
    } 
    }//GEN-LAST:event_damage_minusActionPerformed

    private void defence_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defence_minusActionPerformed
        if(nowDefence != player.getDefence()){
            if(minusMethod()){
            player.setDefence(player.getDefence() -1);
            defence_label.setText("Defence: " + this.player.getDefence());
        }
    } 
    }//GEN-LAST:event_defence_minusActionPerformed

    private void critical_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critical_minusActionPerformed
        if(nowCritical != player.getCritical()){
            if(minusMethod()){
            player.setCritical(player.getCritical() -1);
            critical_label.setText("Critical: " + this.player.getCritical());
        }
        }
    }//GEN-LAST:event_critical_minusActionPerformed

    private void continue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_buttonActionPerformed
        if(this.remaining == 0){
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "remaining is not 0");
        }
    }//GEN-LAST:event_continue_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(levelupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(levelupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(levelupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(levelupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new levelupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continue_button;
    private javax.swing.JLabel critical_label;
    private javax.swing.JButton critical_minus;
    private javax.swing.JButton critical_plus;
    private javax.swing.JLabel damage_label;
    private javax.swing.JButton damage_minus;
    private javax.swing.JButton damage_plus;
    private javax.swing.JLabel defence_label;
    private javax.swing.JButton defence_minus;
    private javax.swing.JButton defence_plus;
    private javax.swing.JLabel energy_label;
    private javax.swing.JButton energy_minus;
    private javax.swing.JButton energy_plus;
    private javax.swing.JLabel health_label;
    private javax.swing.JButton health_minus;
    private javax.swing.JButton health_plus;
    private javax.swing.JLabel hero_label;
    private javax.swing.JLabel level_up_label;
    private javax.swing.JLabel magic_label;
    private javax.swing.JButton magic_minus;
    private javax.swing.JButton magic_plus;
    private javax.swing.JPanel playerSkill_panel;
    private javax.swing.JLabel remaining_label;
    private javax.swing.JLabel skill_points;
    // End of variables declaration//GEN-END:variables
}
