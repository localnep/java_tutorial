
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class GameFrame extends javax.swing.JFrame {

    private static Player player;
    private static ImageIcon icon;
    private static int min_pros = 10;

    public static Player getPlayer() {
        return player;
    }

    
    public static ImageIcon getIcon() {
        return icon;
    }

    public static void setIcon(ImageIcon icon) {
        GameFrame.icon = icon;
    }

    public static int getMin_pros() {
        return min_pros;
    }

    public static void setMin_pros(int min_pros) {
        GameFrame.min_pros = min_pros;
    }
    
    
    
    
    public GameFrame(Player player) { 
        this.setResizable(false);
        this.player = player; //polymorphism doğru çalışıyor (:
        player.konus();
        NormalLoc loc = new NormalLoc(player) {
            
        };
        loc.getLocation();
        initComponents();
        /*go_combobox.setPreferredSize(new Dimension(200, 80)); combobox in codded
        go_combobox.setModel(populate());
        go_combobox.setRenderer(new ImagesTextRenderer());*/ 
    }

    private GameFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    

    /*private DefaultComboBoxModel populate(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\cave.png"),"Cave"));
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\river.png"),"River"));
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\valley.png"),"Valley"));
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\forest.png"),"Forest"));
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\desert.png"),"Desert"));
        dm.addElement(new ImagesNText(new ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\hell.png"),"Hell"));
        return dm;
    }*/
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        hero_label = new javax.swing.JLabel();
        playerSkill_panel = new javax.swing.JPanel();
        damage_label = new javax.swing.JLabel();
        health_label = new javax.swing.JLabel();
        magic_label = new javax.swing.JLabel();
        energy_label = new javax.swing.JLabel();
        defence_label = new javax.swing.JLabel();
        critical_label = new javax.swing.JLabel();
        hero_nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        level_label = new javax.swing.JLabel();
        exp_bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        money_label = new javax.swing.JLabel();
        shop_button = new javax.swing.JButton();
        dragonicon_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Go Adventure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hero_label.setIcon(getIcon());

        //mouseEntered_panel.setVisible(false);
        playerSkill_panel.setBackground(new java.awt.Color(255, 255, 153));
        playerSkill_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerSkill_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playerSkill_panel.setFocusable(false);
        playerSkill_panel.setPreferredSize(new java.awt.Dimension(90, 120));

        damage_label.setForeground(new java.awt.Color(153, 153, 153));
        damage_label.setText("Damage: " + this.player.getDamage() + " + " + this.player.inv.getDamage());
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
        defence_label.setText("Defence: " +this.player.getDefence() + " + " + this.player.inv.getArmor());
        defence_label.setPreferredSize(new java.awt.Dimension(60, 13));

        critical_label.setForeground(new java.awt.Color(153, 153, 153));
        critical_label.setText("Critical: " + this.player.getCritical());
        critical_label.setPreferredSize(new java.awt.Dimension(60, 13));

        javax.swing.GroupLayout playerSkill_panelLayout = new javax.swing.GroupLayout(playerSkill_panel);
        playerSkill_panel.setLayout(playerSkill_panelLayout);
        playerSkill_panelLayout.setHorizontalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(health_label, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addComponent(energy_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(magic_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(damage_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(defence_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(critical_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        playerSkill_panelLayout.setVerticalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerSkill_panelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(health_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(energy_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magic_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defence_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(critical_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        hero_nameLabel.setText("<html>" + "Welcome " + StartFrame.getPlayerName() + "</html>");
        hero_nameLabel.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jLabel1.setText("Player Stats");

        level_label.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        level_label.setText("Level: " + this.player.inv.getLevel());

        exp_bar.setValue(this.player.inv.getExp());
        exp_bar.setMaximum(getMin_pros());
        exp_bar.setStringPainted(true);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        jLabel2.setText("Exp");

        money_label.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        money_label.setText(player.getMoney() + " TL");
        money_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\money.png")); // NOI18N

        shop_button.setBackground(new java.awt.Color(255, 255, 255));
        shop_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop.png"))); // NOI18N
        shop_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shop_buttonActionPerformed(evt);
            }
        });

        dragonicon_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\dragon.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(hero_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_label)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exp_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(level_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(hero_nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shop_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dragonicon_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hero_nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shop_button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hero_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(level_label)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(exp_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(money_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dragonicon_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ToolStore ts = new ToolStore(this.player);
        this.setVisible(false);
        ts.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void shop_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop_buttonActionPerformed
        ShopFrame shop = new ShopFrame(player);
        this.dispose();
        shop.setVisible(true);
    }//GEN-LAST:event_shop_buttonActionPerformed

    

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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel critical_label;
    private javax.swing.JLabel damage_label;
    private javax.swing.JLabel defence_label;
    private javax.swing.JLabel dragonicon_label;
    private javax.swing.JLabel energy_label;
    private javax.swing.JProgressBar exp_bar;
    private javax.swing.JLabel health_label;
    private javax.swing.JLabel hero_label;
    private javax.swing.JLabel hero_nameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel level_label;
    private javax.swing.JLabel magic_label;
    private javax.swing.JLabel money_label;
    private javax.swing.JPanel playerSkill_panel;
    private javax.swing.JButton shop_button;
    // End of variables declaration//GEN-END:variables
}

