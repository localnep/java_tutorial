

import java.awt.Color;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;


public class StartFrame extends javax.swing.JFrame {
    private static String playerName;
    public static String getPlayerName() {
        return playerName;
    }
    
    
    JRadioButton buton = new JRadioButton();
    Timer timer;
    int count = 0;
            
    public StartFrame() {
        this.setResizable(false);
        initComponents();
    }
    
    public void ses_cal(){
         try {
                File file = new File("mix2.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {   
                System.err.println(e.getMessage());
        }
    }
    
    /*public void ses_cal2(){
         try {
                File file = new File("mix.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {   
                System.err.println(e.getMessage());
        }
    }*/
    
    
    public void mouseClicked(JRadioButton buton){
        
        samurai_Rbutton.setBackground(null);
        ninja_Rbutton.setBackground(null);
        witch_Rbutton.setBackground(null);
        knight_Rbutton.setBackground(null);
        archer_Rbutton.setBackground(null);
        wizard_Rbutton.setBackground(null);
        
        //ses_cal2();
        
        this.count++;
        
        //buton.setBackground(Color.RED);
        buton.setBackground(Color.GRAY);
        this.buton = buton;
        
    }
    
    
    public void mouseEntered(JRadioButton buton){
        if(buton != this.buton){
            buton.setBackground(Color.LIGHT_GRAY);
            ses_cal();
        }
    }
    
    public void mouseExit(JRadioButton buton){
        if(buton != this.buton){
            buton.setBackground(null);
        }
    }
    
    public void setPlayerSkills(int health,int energy,int magic,int damage,int defence,int critical){
        health_label.setText("Health: " + health);
        energy_label.setText("Energy: " + energy);
        magic_label.setText("Magic: " + magic);
        damage_label.setText("Damage: " + damage);
        defence_label.setText("Defence: " + defence);
        critical_label.setText("Critical: " + critical);
    }
    
    
    public void setHeroStory(String text){
        heroStory_label.setText("");
        char[] characters = new char[text.length()];
        for(int i=0;i<text.length();i++){
            characters[i] = text.charAt(i);
        }
        
            if(this.count != 1){
                timer.stop();
            }
        
            timer = new Timer(10, new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                heroStory_label.setText(heroStory_label.getText() + characters[i]);
                i++;              
                if(i == text.length()){
                    timer.stop();
                }
            }
        });timer.start(); 
    }
    
   
    //polymhorpism
   public void frameTransition(Player hero,JRadioButton buton){
       hero.konus();
       GameFrame.setIcon((ImageIcon) buton.getIcon());
       GameFrame frame = new GameFrame(hero);
       this.dispose();
       frame.setVisible(true);
   }
   
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        name_label = new javax.swing.JLabel();
        name_textField = new javax.swing.JTextField();
        samurai_Rbutton = new javax.swing.JRadioButton();
        archer_Rbutton = new javax.swing.JRadioButton();
        witch_Rbutton = new javax.swing.JRadioButton();
        wizard_Rbutton = new javax.swing.JRadioButton();
        knight_Rbutton = new javax.swing.JRadioButton();
        ninja_Rbutton = new javax.swing.JRadioButton();
        playerSkill_panel = new javax.swing.JPanel();
        damage_label = new javax.swing.JLabel();
        health_label = new javax.swing.JLabel();
        magic_label = new javax.swing.JLabel();
        energy_label = new javax.swing.JLabel();
        defence_label = new javax.swing.JLabel();
        critical_label = new javax.swing.JLabel();
        playGame_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        heroStory_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose your character");

        name_label.setText("Player Name:");

        buttonGroup1.add(samurai_Rbutton);
        samurai_Rbutton.setText("Samurai");
        samurai_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samurai.png"))); // NOI18N
        samurai_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        samurai_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                samurai_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                samurai_RbuttonMouseExited(evt);
            }
        });
        samurai_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samurai_RbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(archer_Rbutton);
        archer_Rbutton.setText("Archer");
        archer_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archer.png"))); // NOI18N
        archer_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        archer_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                archer_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                archer_RbuttonMouseExited(evt);
            }
        });
        archer_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archer_RbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(witch_Rbutton);
        witch_Rbutton.setText("Witch");
        witch_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/witch.png"))); // NOI18N
        witch_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        witch_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                witch_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                witch_RbuttonMouseExited(evt);
            }
        });
        witch_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                witch_RbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(wizard_Rbutton);
        wizard_Rbutton.setText("Wizard");
        wizard_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wizard.png"))); // NOI18N
        wizard_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        wizard_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wizard_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wizard_RbuttonMouseExited(evt);
            }
        });
        wizard_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wizard_RbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(knight_Rbutton);
        knight_Rbutton.setText("Knight");
        knight_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/knight.png"))); // NOI18N
        knight_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        knight_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                knight_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                knight_RbuttonMouseExited(evt);
            }
        });
        knight_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knight_RbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(ninja_Rbutton);
        ninja_Rbutton.setText("Ninja");
        ninja_Rbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ninja.png"))); // NOI18N
        ninja_Rbutton.setPreferredSize(new java.awt.Dimension(130, 90));
        ninja_Rbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ninja_RbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ninja_RbuttonMouseExited(evt);
            }
        });
        ninja_Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninja_RbuttonActionPerformed(evt);
            }
        });

        //mouseEntered_panel.setVisible(false);
        playerSkill_panel.setBackground(new java.awt.Color(255, 255, 153));
        playerSkill_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerSkill_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playerSkill_panel.setFocusable(false);
        playerSkill_panel.setPreferredSize(new java.awt.Dimension(90, 120));

        damage_label.setForeground(new java.awt.Color(153, 153, 153));
        damage_label.setText("Damage:");
        damage_label.setPreferredSize(new java.awt.Dimension(60, 13));

        health_label.setForeground(new java.awt.Color(153, 153, 153));
        health_label.setText("Health:");
        health_label.setPreferredSize(new java.awt.Dimension(60, 13));

        magic_label.setForeground(new java.awt.Color(153, 153, 153));
        magic_label.setText("Magic:");
        magic_label.setPreferredSize(new java.awt.Dimension(60, 13));

        energy_label.setForeground(new java.awt.Color(153, 153, 153));
        energy_label.setText("Energy:");
        energy_label.setPreferredSize(new java.awt.Dimension(60, 13));

        defence_label.setForeground(new java.awt.Color(153, 153, 153));
        defence_label.setText("Defence:");
        defence_label.setPreferredSize(new java.awt.Dimension(60, 13));

        critical_label.setForeground(new java.awt.Color(153, 153, 153));
        critical_label.setText("Critical:");
        critical_label.setPreferredSize(new java.awt.Dimension(60, 13));

        javax.swing.GroupLayout playerSkill_panelLayout = new javax.swing.GroupLayout(playerSkill_panel);
        playerSkill_panel.setLayout(playerSkill_panelLayout);
        playerSkill_panelLayout.setHorizontalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerSkill_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(health_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(energy_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magic_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defence_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critical_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        playerSkill_panelLayout.setVerticalGroup(
            playerSkill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerSkill_panelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(health_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(energy_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magic_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(damage_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defence_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(critical_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playGame_button.setText("Play Game");
        playGame_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playGame_buttonActionPerformed(evt);
            }
        });

        heroStory_label.setFont(new java.awt.Font("Bradley Hand ITC", 2, 13)); // NOI18N
        heroStory_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        heroStory_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(name_textField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playGame_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addComponent(heroStory_label, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(samurai_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(knight_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(archer_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ninja_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(witch_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wizard_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(samurai_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ninja_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(witch_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knight_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(archer_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wizard_Rbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerSkill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heroStory_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(playGame_button)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void samurai_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samurai_RbuttonMouseEntered
           mouseEntered(samurai_Rbutton);            
    }//GEN-LAST:event_samurai_RbuttonMouseEntered

    private void archer_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archer_RbuttonActionPerformed
           mouseClicked(archer_Rbutton);
           setPlayerSkills(3, 2, 4, 9, 9, 5);
           String text= "<html>"
                   +"Aliquam mollis nunc sed ipsum porta semper. Vivamus sed tortor congue, auctor lectus vitae, consectetur metus. Fusce porttitor magna a sapien fermentum venenatis."
                   +"</html>";
           setHeroStory(text);
    }//GEN-LAST:event_archer_RbuttonActionPerformed

    private void samurai_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samurai_RbuttonMouseExited
          mouseExit(samurai_Rbutton);
    }//GEN-LAST:event_samurai_RbuttonMouseExited

    private void ninja_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninja_RbuttonMouseEntered
          mouseEntered(ninja_Rbutton);
    }//GEN-LAST:event_ninja_RbuttonMouseEntered

    private void ninja_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ninja_RbuttonMouseExited
          mouseExit(ninja_Rbutton);
    }//GEN-LAST:event_ninja_RbuttonMouseExited

    private void witch_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_witch_RbuttonMouseEntered
           mouseEntered(witch_Rbutton); 
    }//GEN-LAST:event_witch_RbuttonMouseEntered

    private void witch_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_witch_RbuttonMouseExited
          mouseExit(witch_Rbutton);
    }//GEN-LAST:event_witch_RbuttonMouseExited

    private void knight_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_knight_RbuttonMouseEntered
          mouseEntered(knight_Rbutton); 
    }//GEN-LAST:event_knight_RbuttonMouseEntered

    private void knight_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_knight_RbuttonMouseExited
          mouseExit(knight_Rbutton);
    }//GEN-LAST:event_knight_RbuttonMouseExited

    private void archer_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archer_RbuttonMouseEntered
        mouseEntered(archer_Rbutton); 
    }//GEN-LAST:event_archer_RbuttonMouseEntered

    private void archer_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archer_RbuttonMouseExited
        mouseExit(archer_Rbutton);
    }//GEN-LAST:event_archer_RbuttonMouseExited

    private void wizard_RbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wizard_RbuttonMouseEntered
        mouseEntered(wizard_Rbutton); 
    }//GEN-LAST:event_wizard_RbuttonMouseEntered

    private void wizard_RbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wizard_RbuttonMouseExited
        mouseExit(wizard_Rbutton);
    }//GEN-LAST:event_wizard_RbuttonMouseExited

    private void samurai_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samurai_RbuttonActionPerformed
        mouseClicked(samurai_Rbutton);
        setPlayerSkills(5, 4, 3, 2, 1, 4);
        String text = "<html>"
                + " Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. "
                + "</html>";
        setHeroStory(text);
    }//GEN-LAST:event_samurai_RbuttonActionPerformed

    private void ninja_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninja_RbuttonActionPerformed
        mouseClicked(ninja_Rbutton);
        setPlayerSkills(3, 2, 1, 4, 5, 6);
        String text = "<html>"
                + "Proin sit amet sem dapibus, commodo nunc faucibus, lobortis justo. Sed non ipsum dolor. In porta convallis ante posuere accumsan. Phasellus ornare, sapien vel posuere facilisis, urna purus posuere massa, a tincidunt ante leo at metus. Suspendisse a ipsum volutpat turpis dignissim malesuada eget sit amet orci. Morbi nisi sem, bibendum vel placerat vel, posuere ut leo."
                +"</html>";
        setHeroStory(text);
    }//GEN-LAST:event_ninja_RbuttonActionPerformed

    private void witch_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_witch_RbuttonActionPerformed
        mouseClicked(witch_Rbutton);
        setPlayerSkills(1, 1, 2, 2, 3, 3);
        String text = "<html>"
                + "Integer lectus est, gravida et suscipit non, egestas iaculis ante. Nulla a tortor vitae sem rhoncus feugiat sit amet nec neque. Nullam laoreet condimentum elementum. Ut et tellus accumsan, accumsan lectus id, pretium quam."
                +"</html>";
        setHeroStory(text);
    }//GEN-LAST:event_witch_RbuttonActionPerformed

    private void knight_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knight_RbuttonActionPerformed
        mouseClicked(knight_Rbutton);
        setPlayerSkills(2, 3, 1, 5, 5, 7);
        String text = "<html>"
                +"Morbi vitae risus fringilla, congue metus in, porttitor sapien. Mauris tincidunt quis lectus eu lacinia. Etiam nec dui vehicula, eleifend elit tristique, gravida lacus. Pellentesque vitae magna risus"
                +"</html>";
        setHeroStory(text);
    }//GEN-LAST:event_knight_RbuttonActionPerformed

    private void wizard_RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wizard_RbuttonActionPerformed
        mouseClicked(wizard_Rbutton);
        setPlayerSkills(7, 7, 6, 6, 5, 5);
        String text = "<html>"
                +"Duis ornare mi eros, a posuere augue tempor dictum. Vivamus risus diam, congue viverra rhoncus sit amet, sagittis in nunc."
                +"</html>";
        setHeroStory(text);
    }//GEN-LAST:event_wizard_RbuttonActionPerformed

    private void playGame_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playGame_buttonActionPerformed
        if(name_textField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lütfen boş bırakmayın");
        }
        else{
            playerName = name_textField.getText();
            if(samurai_Rbutton.isSelected()){
                frameTransition(new Samurai(playerName),samurai_Rbutton);  
        }
        else if(ninja_Rbutton.isSelected()){
                frameTransition(new Ninja(playerName),ninja_Rbutton); 
        }
        else if(witch_Rbutton.isSelected()){
                frameTransition(new Witch(playerName),witch_Rbutton);    
        }
        else if(knight_Rbutton.isSelected()){
                frameTransition(new Knight(playerName),knight_Rbutton);
        }
        else if(archer_Rbutton.isSelected()){
                frameTransition(new Archer(playerName),archer_Rbutton); 
        }
        else if(wizard_Rbutton.isSelected()){
                frameTransition(new Wizard(playerName),wizard_Rbutton);
        }
        else{
            JOptionPane.showMessageDialog(this, "Lütfen bir karakter seçin");
        }
        }

    }//GEN-LAST:event_playGame_buttonActionPerformed


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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton archer_Rbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel critical_label;
    private javax.swing.JLabel damage_label;
    private javax.swing.JLabel defence_label;
    private javax.swing.JLabel energy_label;
    private javax.swing.JLabel health_label;
    private javax.swing.JLabel heroStory_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton knight_Rbutton;
    private javax.swing.JLabel magic_label;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textField;
    private javax.swing.JRadioButton ninja_Rbutton;
    private javax.swing.JButton playGame_button;
    private javax.swing.JPanel playerSkill_panel;
    private javax.swing.JRadioButton samurai_Rbutton;
    private javax.swing.JRadioButton witch_Rbutton;
    private javax.swing.JRadioButton wizard_Rbutton;
    // End of variables declaration//GEN-END:variables
}
