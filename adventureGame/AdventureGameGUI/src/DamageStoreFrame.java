
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;


public class DamageStoreFrame extends javax.swing.JFrame {

    protected Player player;
    Timer timer;
    
    
    public DamageStoreFrame(Player player) {
        this.player = player;
        this.setResizable(false);
        initComponents();
    }


    private DamageStoreFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     public void setSpeak(String text){
        write_label.setText("");
        char[] characters = new char[text.length()];
        for(int i=0;i<text.length();i++){
            characters[i] = text.charAt(i);
        }
  
            timer = new Timer(10, new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                write_label.setText(write_label.getText() + characters[i]);
                i++;              
                if(i == text.length()){
                    timer.stop();
                }
            }
        });timer.start(); 
    }
     
     public void setIconText(ImageIcon icon1,ImageIcon icon2,ImageIcon icon3,String text1,String text2,String text3){
         damage1_rButton.setIcon(icon1);
         damage2_rButton.setIcon(icon2);
         damage3_rButton.setIcon(icon3);
         damage1_rButton.setText(text1);
         damage2_rButton.setText(text2);
         damage3_rButton.setText(text3);
     }
     
     protected String text1,text2,text3;
     
     public void player_damage_icon(Object object){
         if(object instanceof Samurai){
            text1 = "<html> Kılıç1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Kılıç2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Kılıç3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\sword1.png"),new ImageIcon("src\\\\images\\\\sword2.png"),new ImageIcon("src\\images\\sword3.png"), text1, text2, text3);
        }
        else if(object instanceof Knight){
            text1 = "<html> Mızrak1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Mızrak2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Mızrak3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\spear1.png"),new ImageIcon("src\\\\images\\\\spear2.png"),new ImageIcon("src\\images\\spear3.png"), text1, text2, text3);
        }
        else if(object instanceof Ninja){
            text1 = "<html> Knife1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Knife2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Knife3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\knife1.png"),new ImageIcon("src\\\\images\\\\knife2.png"),new ImageIcon("src\\images\\knife3.png"), text1, text2, text3);
        }
        else if(object instanceof Archer){
            text1 = "<html> Arrow1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Arrow2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Arrow3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\arrow1.png"),new ImageIcon("src\\\\images\\\\arrow2.png"),new ImageIcon("src\\images\\arrow3.png"), text1, text2, text3);
        }
        else if(object instanceof Wizard){
            text1 = "<html> Wand1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Wand2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Wand3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\wand1.png"),new ImageIcon("src\\\\images\\\\wand2.png"),new ImageIcon("src\\images\\wand3.png"), text1, text2, text3);
        }
        else if(object instanceof Witch){
            text1 = "<html> Boom1 <br> Damage: 3 <br> Magic: 0 <br> Critical: 0 <br></html>";
            text2 = "<html> Boom2 <br> Damage: 6 <br> Magic: 0 <br> Critical: 2 <br></html>";
            text3 = "<html> Boom3 <br> Damage: 9 <br> Magic: 0 <br> Critical: 4 <br></html>";
            setIconText(new ImageIcon("src\\images\\boom1.png"),new ImageIcon("src\\\\images\\\\boom2.png"),new ImageIcon("src\\images\\boom3.png"), text1, text2, text3);
        }
     }
     
     public void mouseEntered(JRadioButton buton){
            buton.setBackground(Color.LIGHT_GRAY);
    }
    
    public void mouseExit(JRadioButton buton){
            buton.setBackground(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ilter_label = new javax.swing.JLabel();
        write_label = new javax.swing.JLabel();
        home_buton = new javax.swing.JButton();
        back_buton = new javax.swing.JButton();
        damage1_rButton = new javax.swing.JRadioButton();
        damage2_rButton = new javax.swing.JRadioButton();
        damage3_rButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total_money = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ilter_label.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\ilter.png")); // NOI18N

        write_label.setFont(new java.awt.Font("Bradley Hand ITC", 2, 14)); // NOI18N
        write_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        String text= "<html>"
        +"Aliquam mollis nunc sed ipsum porta semper. Vivamus sed tortor congue, auctor lectus vitae, consectetur metus. Fusce porttitor magna a sapien fermentum venenatis."
        +"</html>";
        setSpeak(text);

        home_buton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\home.png")); // NOI18N
        home_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_butonActionPerformed(evt);
            }
        });

        back_buton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_butonActionPerformed(evt);
            }
        });

        buttonGroup1.add(damage1_rButton);
        damage1_rButton.setFont(new java.awt.Font("Bradley Hand ITC", 2, 14)); // NOI18N
        damage1_rButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        player_damage_icon(player);
        damage1_rButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                damage1_rButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                damage1_rButtonMouseExited(evt);
            }
        });
        damage1_rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage1_rButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(damage2_rButton);
        damage2_rButton.setFont(new java.awt.Font("Bradley Hand ITC", 2, 14)); // NOI18N
        damage2_rButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        damage2_rButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                damage2_rButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                damage2_rButtonMouseExited(evt);
            }
        });
        damage2_rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage2_rButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(damage3_rButton);
        damage3_rButton.setFont(new java.awt.Font("Bradley Hand ITC", 2, 14)); // NOI18N
        damage3_rButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        damage3_rButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                damage3_rButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                damage3_rButtonMouseExited(evt);
            }
        });
        damage3_rButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damage3_rButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\money.png")); // NOI18N
        jLabel1.setText("10 Lira");

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\money.png")); // NOI18N
        jLabel2.setText("20 Lira");

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\money.png")); // NOI18N
        jLabel3.setText("30 Lira");

        total_money.setText("Total Money:" + player.getMoney() + " Lira");
        total_money.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        total_money.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ozan\\Documents\\NetBeansProjects\\AdventureGameGUI\\src\\images\\money.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ilter_label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(write_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(damage1_rButton)
                            .addComponent(jLabel1))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(damage2_rButton)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(damage3_rButton)
                            .addComponent(jLabel3))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(total_money, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_money, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(damage2_rButton)
                    .addComponent(damage1_rButton)
                    .addComponent(damage3_rButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ilter_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(write_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buyWeapon(JRadioButton buton, Player player){
        boolean purchased = false;
        
            if(buton == damage1_rButton && player.getMoney() >= 10){
                player.setMoney(player.getMoney() - 10);
                JOptionPane.showMessageDialog(this, "Satın alındı");
                total_money.setText(player.getMoney() + " Lira");
                purchased = true;
            }
            else if(buton == damage2_rButton && player.getMoney() >= 20){
                player.setMoney(player.getMoney() - 20);
                JOptionPane.showMessageDialog(this, "Satın alındı");
                total_money.setText(player.getMoney() + " Lira");
                purchased = true;
            }
            else if(buton == damage3_rButton && player.getMoney() >= 30){
                player.setMoney(player.getMoney() - 30);
                JOptionPane.showMessageDialog(this, "Satın alındı");
                total_money.setText(player.getMoney() + " Lira");
                purchased = true;
            }
            else{
                JOptionPane.showMessageDialog(this, "Satın alma işlemi başarısız");
                purchased = false;
            }
            
        
            if(purchased){
                if(player instanceof Samurai){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
                else if(player instanceof Knight){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
                else if(player instanceof Ninja){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
                else if(player instanceof Archer){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
                else if(player instanceof Wizard){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
                else if(player instanceof Witch){
                    if(buton == damage1_rButton)
                    player.getInv().setDamage(3);
                    else if(buton == damage2_rButton)
                    player.getInv().setDamage(6);
                    else if(buton == damage3_rButton)
                    player.getInv().setDamage(9);
                }
            }
    }

    
    private void damage1_rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage1_rButtonActionPerformed
       buyWeapon(damage1_rButton, player);
    }//GEN-LAST:event_damage1_rButtonActionPerformed

    private void home_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_butonActionPerformed
        GameFrame fr = new GameFrame(player);
        this.dispose();
        fr.setVisible(true);
    }//GEN-LAST:event_home_butonActionPerformed

    private void back_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_butonActionPerformed
        ShopFrame sf = new ShopFrame(player);
        this.dispose();
        sf.setVisible(true);
    }//GEN-LAST:event_back_butonActionPerformed

    private void damage2_rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage2_rButtonActionPerformed
       buyWeapon(damage2_rButton, player);
    }//GEN-LAST:event_damage2_rButtonActionPerformed

    private void damage3_rButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damage3_rButtonActionPerformed
      buyWeapon(damage3_rButton, player);
    }//GEN-LAST:event_damage3_rButtonActionPerformed

    private void damage1_rButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage1_rButtonMouseEntered
        mouseEntered(damage1_rButton);
    }//GEN-LAST:event_damage1_rButtonMouseEntered

    private void damage2_rButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage2_rButtonMouseEntered
        mouseEntered(damage2_rButton);
    }//GEN-LAST:event_damage2_rButtonMouseEntered

    private void damage3_rButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage3_rButtonMouseEntered
        mouseEntered(damage3_rButton);
    }//GEN-LAST:event_damage3_rButtonMouseEntered

    private void damage1_rButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage1_rButtonMouseExited
        mouseExit(damage1_rButton);
    }//GEN-LAST:event_damage1_rButtonMouseExited

    private void damage2_rButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage2_rButtonMouseExited
        mouseExit(damage2_rButton);
    }//GEN-LAST:event_damage2_rButtonMouseExited

    private void damage3_rButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_damage3_rButtonMouseExited
        mouseExit(damage3_rButton);
    }//GEN-LAST:event_damage3_rButtonMouseExited

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
            java.util.logging.Logger.getLogger(DamageStoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DamageStoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DamageStoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DamageStoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DamageStoreFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_buton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton damage1_rButton;
    private javax.swing.JRadioButton damage2_rButton;
    private javax.swing.JRadioButton damage3_rButton;
    private javax.swing.JButton home_buton;
    private javax.swing.JLabel ilter_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel total_money;
    private javax.swing.JLabel write_label;
    // End of variables declaration//GEN-END:variables
}
