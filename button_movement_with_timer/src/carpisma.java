
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class carpisma extends javax.swing.JFrame {
    //Random rnd = new Random();
    int x,y; //b butonu
    int z,t; //a butonu
    int a,b; //c butonu
    int xhiz=-3;
    int yhiz=+2;
    int zhiz=2;
    int thiz=-3;
    int ahiz=2;
    int bhiz=-2;
    int carpismaSayisi=0;
    int ab=0;
    int ac=0;
    int bc=0;
    int sayac = 0;
    int x2;
    int y2; 
    int z2;
    int t2;
    int a2;
    int b2;
    int timersayac=0;
    //boolean basildiMi=false;
    boolean bugKontrol=false;
    boolean takilmaKontrol=false;
    
    int tempx;
    int tempy;
    int tempz;
    int tempt;
    int tempa;
    int tempb;
    
    int tempx2;
    int tempy2;
    int tempz2;
    int tempt2;
    int tempa2;
    int tempb2;
    
    int tempx3;
    int tempy3;
    int tempz3;
    int tempt3;
    int tempa3;
    int tempb3;
    
    int tempx4;
    int tempy4;
    int tempz4;
    int tempt4;
    int tempa4;
    int tempb4;
    
    boolean atakilikontrol=false;
    boolean btakilikontrol=false;
    boolean ctakilikontrol=false;
    
    Timer timer = new Timer(5,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Timer timer = (Timer)e.getSource(); //durdurmak için
                x=(int)buton.getBounds().getX(); //butonun başlangıç x konumu alındı
                y=(int)buton.getBounds().getY(); //butonun başlangıç y konumu alındı
                z=(int)buton2.getBounds().getX();
                t=(int)buton2.getBounds().getY();
                a=(int)buton3.getBounds().getX();
                b=(int)buton3.getBounds().getY();
                
                timersayac++;
                x+=xhiz;
                y+=yhiz;
                z+=zhiz;
                t+=thiz;
                a+=ahiz;
                b+=bhiz;
                
                buton.setBounds(x,y, 35, 35);
                buton2.setBounds(z, t, 35, 35);
                buton3.setBounds(a, b, 35, 35);
                
                if(x>=450 || x<=0){
                    xhiz*=-1;    //buton ekranin sonuna geldiği zaman tersi yönde hareket edecek
                }
                if(y>=230 || y<=0){
                    yhiz*=-1;
                }
                if(z>=450 || z<=0){
                    zhiz*=-1;    //buton ekranin sonuna geldiği zaman tersi yönde hareket edecek
                }
                if(t>=230 || t<=0){
                    thiz*=-1;
                }
                 if(a>=450 || a<=0){
                    ahiz*=-1;    //buton ekranin sonuna geldiği zaman tersi yönde hareket edecek
                }
                if(b>=230 || b<=0){
                    bhiz*=-1;
                }
                
                
                
                
                
                //4 lü permütasyon yaparak aynı yön izleme olayını doğru sonuca yakınlaştırıyorum.
                 //ebob ekok hesaplamaları yaparsam daha güzel sayıları kıyaslayıp daha da optimize edilebilir
                 if(timersayac%3==0 && timersayac%5!=0){
                      tempx=x2;
                      tempy=y2;
                      tempz=z2;
                      tempt=t2;
                      tempa=a2;
                      tempb=b2;
                 }
                 
                 if(timersayac%7==0 && timersayac%9!=0){
                      tempx2=x2;
                      tempy2=y2;
                      tempz2=z2;
                      tempt2=t2;
                      tempa2=a2;
                      tempb2=b2;
                 }
                 
                 if(timersayac%11==0 && timersayac%13!=0){
                      tempx3=x2;
                      tempy3=y2;
                      tempz3=z2;
                      tempt3=t2;
                      tempa3=a2;
                      tempb3=b2;
                 }
                 
                 if(timersayac%15==0 && timersayac%17!=0){
                      tempx4=x2;
                      tempy4=y2;
                      tempz4=z2;
                      tempt4=t2;
                      tempa4=a2;
                      tempb4=b2;
                 }
                 

                
                
                if(x>=455 || x<=-10 || y>=245 || y<=-10 || z>=455 || z<=-10 || t>=245 || t<=-10 || a>=455 || a<=-10 || b>=245 || b<=-10){
                    bugKontrol=true;
                    jButton2.setBackground(Color.red);
                    if(x>=455 || x<=-10 || y>=245 || y<=-10){
                                  buton.setBackground(Color.red);
                                  jButton2.setBackground(Color.red);
                               }
                    if(z>=455 || z<=-10 || t>=245 || t<=-10){
                                   buton2.setBackground(Color.red);
                                   jButton2.setBackground(Color.red);
                               }
                    if(a>=455 || a<=-10 || b>=245 || b<=-10){
                                   buton3.setBackground(Color.red);
                                   jButton2.setBackground(Color.red);
                               } 
                }
                else if((Math.abs(x2-tempx)<=2 || Math.abs(y2-tempy)<=2) && (Math.abs(x2-tempx2)<=2 || Math.abs(y2-tempy2)<=2) && (Math.abs(tempx2-tempx)<=2 || Math.abs(tempy2-tempy)<=2) &&
                             (Math.abs(x2-tempx3)<=2 || Math.abs(y2-tempy3)<=2) && (Math.abs(tempx-tempx3)<=2 || Math.abs(tempy-tempy3)<=2) && (Math.abs(tempx2-tempx3)<=2 || Math.abs(tempy2-tempy3)<=2) &&
                             (Math.abs(x2-tempx4)<=2 || Math.abs(y2-tempy4)<=2) && (Math.abs(tempx-tempx4)<=2 || Math.abs(tempy-tempy4)<=2) && (Math.abs(tempx2-tempx4)<=2 || Math.abs(tempy2-tempy4)<=2) &&
                             (Math.abs(tempx3-tempx4)<=2 || Math.abs(tempy3-tempy4)<=2) || (Math.abs(z2-tempz)<=2 || Math.abs(t2-tempt)<=2) && (Math.abs(z2-tempz2)<=2 || Math.abs(t2-tempt2)<=2) && (Math.abs(tempz2-tempz)<=2 || Math.abs(tempt2-tempt)<=2) &&
                             (Math.abs(z2-tempz3)<=2 || Math.abs(t2-tempt3)<=2) && (Math.abs(tempz-tempz3)<=2 || Math.abs(tempt-tempt3)<=2) && (Math.abs(tempz2-tempz3)<=2 || Math.abs(tempt2-tempt3)<=2) &&
                             (Math.abs(z2-tempz4)<=2 || Math.abs(t2-tempt4)<=2) && (Math.abs(tempz-tempz4)<=2 || Math.abs(tempt-tempt4)<=2) && (Math.abs(tempz2-tempz4)<=2 || Math.abs(tempt2-tempt4)<=2) &&
                             (Math.abs(tempz3-tempz4)<=2 || Math.abs(tempt3-tempt4)<=2) || (Math.abs(a2-tempa)<=2 || Math.abs(b2-tempb)<=2) && (Math.abs(a2-tempa2)<=2 || Math.abs(b2-tempb2)<=2) && (Math.abs(tempa2-tempa)<=2 || Math.abs(tempb2-tempb)<=2) &&
                             (Math.abs(a2-tempa3)<=2 || Math.abs(b2-tempb3)<=2) && (Math.abs(tempa-tempa3)<=2 || Math.abs(tempb-tempb3)<=2) && (Math.abs(tempa2-tempa3)<=2 || Math.abs(tempb2-tempb3)<=2) &&
                             (Math.abs(a2-tempa4)<=2 || Math.abs(b2-tempb4)<=2) && (Math.abs(tempa-tempa4)<=2 || Math.abs(tempb-tempb4)<=2) && (Math.abs(tempa2-tempa4)<=2 || Math.abs(tempb2-tempb4)<=2) &&
                             (Math.abs(tempa3-tempa4)<=2 || Math.abs(tempb3-tempb4)<=2)){
                  //JOptionPane.showMessageDialog(null, "takılma var");
                 //takilmaKontrol=true;
                 //jButton2.setBackground(Color.orange);
                 if(timersayac%2!=0 && timersayac%3!=0 && timersayac%5!=0 && timersayac%7!=0 && timersayac%9!=0 && timersayac%11!=0 && timersayac%13!=0 && timersayac%15!=0 && timersayac%17!=0){ //ortak katı olsun istemiyorum
                     
                     if((Math.abs(x2-tempx)<=2 || Math.abs(y2-tempy)<=2) && (Math.abs(x2-tempx2)<=2 || Math.abs(y2-tempy2)<=2) && (Math.abs(tempx2-tempx)<=2 || Math.abs(tempy2-tempy)<=2) &&
                             (Math.abs(x2-tempx3)<=2 || Math.abs(y2-tempy3)<=2) && (Math.abs(tempx-tempx3)<=2 || Math.abs(tempy-tempy3)<=2) && (Math.abs(tempx2-tempx3)<=2 || Math.abs(tempy2-tempy3)<=2) &&
                             (Math.abs(x2-tempx4)<=2 || Math.abs(y2-tempy4)<=2) && (Math.abs(tempx-tempx4)<=2 || Math.abs(tempy-tempy4)<=2) && (Math.abs(tempx2-tempx4)<=2 || Math.abs(tempy2-tempy4)<=2) &&
                             (Math.abs(tempx3-tempx4)<=2 || Math.abs(tempy3-tempy4)<=2)){ 
                         //JOptionPane.showMessageDialog(null, "b butonu takılı kalmis");
                         buton.setBackground(Color.orange);
                         jButton2.setBackground(Color.orange);
                         takilmaKontrol=true;
                         btakilikontrol=true;
                     }
                   
                     if((Math.abs(z2-tempz)<=2 || Math.abs(t2-tempt)<=2) && (Math.abs(z2-tempz2)<=2 || Math.abs(t2-tempt2)<=2) && (Math.abs(tempz2-tempz)<=2 || Math.abs(tempt2-tempt)<=2) &&
                             (Math.abs(z2-tempz3)<=2 || Math.abs(t2-tempt3)<=2) && (Math.abs(tempz-tempz3)<=2 || Math.abs(tempt-tempt3)<=2) && (Math.abs(tempz2-tempz3)<=2 || Math.abs(tempt2-tempt3)<=2) &&
                             (Math.abs(z2-tempz4)<=2 || Math.abs(t2-tempt4)<=2) && (Math.abs(tempz-tempz4)<=2 || Math.abs(tempt-tempt4)<=2) && (Math.abs(tempz2-tempz4)<=2 || Math.abs(tempt2-tempt4)<=2) &&
                             (Math.abs(tempz3-tempz4)<=2 || Math.abs(tempt3-tempt4)<=2)){
                         //JOptionPane.showMessageDialog(null, "a butonu takılı kalmis");
                         buton2.setBackground(Color.orange);
                         jButton2.setBackground(Color.orange);
                         takilmaKontrol=true;
                         atakilikontrol=true;              
                     }
                    
                     if((Math.abs(a2-tempa)<=2 || Math.abs(b2-tempb)<=2) && (Math.abs(a2-tempa2)<=2 || Math.abs(b2-tempb2)<=2) && (Math.abs(tempa2-tempa)<=2 || Math.abs(tempb2-tempb)<=2) &&
                             (Math.abs(a2-tempa3)<=2 || Math.abs(b2-tempb3)<=2) && (Math.abs(tempa-tempa3)<=2 || Math.abs(tempb-tempb3)<=2) && (Math.abs(tempa2-tempa3)<=2 || Math.abs(tempb2-tempb3)<=2) &&
                             (Math.abs(a2-tempa4)<=2 || Math.abs(b2-tempb4)<=2) && (Math.abs(tempa-tempa4)<=2 || Math.abs(tempb-tempb4)<=2) && (Math.abs(tempa2-tempa4)<=2 || Math.abs(tempb2-tempb4)<=2) &&
                             (Math.abs(tempa3-tempa4)<=2 || Math.abs(tempb3-tempb4)<=2)){
                         //JOptionPane.showMessageDialog(null, "c butonu takılı kalmis");
                         buton3.setBackground(Color.orange);
                         jButton2.setBackground(Color.orange);     
                         takilmaKontrol=true;
                         ctakilikontrol=true;           
                     }
             }
                 }
                else{
                    bugKontrol=false;
                    takilmaKontrol=false;
                    jButton2.setBackground(Color.green);
                    buton.setBackground(Color.green);
                    buton2.setBackground(Color.green);
                    buton3.setBackground(Color.green);
                }
                
                 x2=(int)buton.getBounds().getX();
                 y2=(int)buton.getBounds().getY(); 
                 z2=(int)buton2.getBounds().getX();
                 t2=(int)buton2.getBounds().getY();
                 a2=(int)buton3.getBounds().getX();
                 b2=(int)buton3.getBounds().getY();
                 
                 
                 
                //çarpışma
                if((Math.abs(x2-z2)<33 && Math.abs(y2-t2)<33)){  
                        carpismaSayisi++;
                        //JOptionPane.showMessageDialog(null, "b ile a çarpıştı" + "çarpışma:" + carpismaSayisi);  
                        ab++;
                        int xtemp=xhiz,ytemp=yhiz;
                        xhiz=zhiz;
                        yhiz=thiz;
                        zhiz=xtemp;
                        thiz=ytemp;
                        /*xhiz=rnd.nextInt(5 + 1) -5;
                        yhiz=rnd.nextInt(5 + 1) -5;
                        zhiz=rnd.nextInt(5 + 1) -5;
                        thiz=rnd.nextInt(5 + 1) -5;*/
                }
                else if((Math.abs(x2-a2)<33 && Math.abs(y2-b2)<33)){
                       carpismaSayisi++;
                       //JOptionPane.showMessageDialog(null, "b ile c çarpıştı" + "çarpışma:" + carpismaSayisi);
                       bc++;
                       int xtemp=xhiz,ytemp=yhiz;
                       xhiz=ahiz;
                       yhiz=bhiz;
                       ahiz=xtemp;
                       bhiz=ytemp;
                       /*xhiz=rnd.nextInt(5 + 1) -5;
                       yhiz=rnd.nextInt(5 + 1) -5;
                       ahiz=rnd.nextInt(5 + 1) -5;
                       bhiz=rnd.nextInt(5 + 1) -5;*/
                }
                else if((Math.abs(z2-a2)<33 && Math.abs(t2-b2)<33)){
                       carpismaSayisi++;
                       //JOptionPane.showMessageDialog(null, "a ile c çarpıştı" + "çarpışma:" + carpismaSayisi);
                       ac++;
                       int ztemp=zhiz,ttemp=thiz;
                       zhiz=ahiz;   
                       thiz=bhiz;
                       ahiz=ztemp;
                       bhiz=ttemp;
                       /*zhiz=rnd.nextInt(5 + 1) -5;
                       thiz=rnd.nextInt(5 + 1) -5;
                       ahiz=rnd.nextInt(5 + 1) -5;
                       bhiz=rnd.nextInt(5 + 1) -5;*/
                       
                }
                /*if(basildiMi==true){
                    timer.stop();
                }*/
                
                
                
                
                
            }
        });
        //timer.start();
    
    
    

    public carpisma() {
        initComponents();
        buton.setBackground(Color.GREEN);
        buton2.setBackground(Color.GREEN);
        buton3.setBackground(Color.GREEN);
        jButton2.setBackground(Color.green);
        timer.start();
                }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        buton = new javax.swing.JButton();
        buton2 = new javax.swing.JButton();
        buton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));

        buton.setText("b");
        buton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buton2.setText("a");

        buton3.setText("c");

        jButton1.setText("Bilgi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Bug Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(buton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //basildiMi=true;
        timer.stop();
        if(bugKontrol==true){
        JOptionPane.showMessageDialog(null, "Genel Bilgiler"+"\ntoplam çarpışma yayısı:" + carpismaSayisi +"\n"
                + "a ile b çarpışma sayısı: " + ab + "\n"
                        + "a ile c çarpışma sayısı: " + ac + "\n"
                                + "b ile c çarpışma sayısı: " + bc 
                +"\n" + "\nKonum Bilgileri\na butonu x: " + z + " y: " + t
        +"\nb butonu x: " + x + " y: " + y
        +"\nc butonu x: " + a + " y:" + b
        +"\n\nbug kontrol:" + "\n"  
                +"<html><body><b>" + "VAR" + "</b></p></body></html>");
        }
        else{
            JOptionPane.showMessageDialog(this, "Genel Bilgiler"+"\ntoplam çarpışma yayısı:" + carpismaSayisi +"\n"
                + "a ile b çarpışma sayısı: " + ab + "\n"
                        + "a ile c çarpışma sayısı: " + ac + "\n"
                                + "b ile c çarpışma sayısı: " + bc 
                +"\n" + "\nKonum Bilgileri\na butonu x: " + z + " y: " + t
        +"\nb butonu x: " + x + " y: " + y
        +"\nc butonu x: " + a + " y:" + b
        + "\nbug kontrol: YOK"); 
        }
        
        //JOptionPane.showMessageDialog(this,"<html><body><b>" + " hello" + "</b></p></body></html>");

        //basildiMi=false;
        timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //basildiMi=true;
        boolean kontrol = true;
        timer.stop();
         /*if((xhiz==0 && yhiz==0) || (zhiz==0 && thiz==0) || (ahiz==0 && bhiz==0)){
            JOptionPane.showMessageDialog(null, "Duran bir buton varken kullanılamaz");
            bugKontrol=false;
            takilmaKontrol=false;
            kontrol = false;
        }*/
         
        if(bugKontrol==true){
                        if(x>=455 || x<=-10 || y>=245 || y<=-10 || z>=455 || z<=-10 || t>=245 || t<=-10 || a>=455 || a<=-10 || b>=245 || b<=-10){
                               if(x>=455 || x<=-10 || y>=245 || y<=-10){
                                   JOptionPane.showMessageDialog(null, "Buga giren 'b' butonu kurtarılıyor" );
                                   buton.setBounds(50, 50, 35, 35);
                                   buton.setBackground(Color.green);
                                   bugKontrol=false;
                                   jButton2.setBackground(Color.green);
                               }
                               else if(z>=455 || z<=-10 || t>=245 || t<=-10){
                                   JOptionPane.showMessageDialog(null, "Buga giren 'a' butonu kurtarılıyor" );
                                   buton2.setBounds(50, 50, 35, 35);
                                   buton2.setBackground(Color.green);
                                   bugKontrol=false;
                                   jButton2.setBackground(Color.green);
                               }
                               else if(a>=455 || a<=-10 || b>=245 || b<=-10){
                                   JOptionPane.showMessageDialog(null, "Buga giren 'c' butonu kurtarılıyor" );
                                   buton3.setBounds(50, 50, 35, 35);
                                   buton3.setBackground(Color.green);
                                   bugKontrol=false;
                                   jButton2.setBackground(Color.green);
                               }
                               
                         }
        }
        
        else if(takilmaKontrol==true){                  
             Object[] saveOption = {"Evet","Hayır"};
             if(JOptionPane.showOptionDialog(this, "Aynı yörüngeyi izleyen buton var. Kurtaralım mı?", "UYARI", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE, null,saveOption , null) == JOptionPane.YES_OPTION)
                {
                     if(btakilikontrol==true){
                         JOptionPane.showMessageDialog(null, "Helped 'b'");
                         buton.setBounds(25, 25, 35, 35);
                         buton.setBackground(Color.green);             
                         takilmaKontrol=false;
                         btakilikontrol=false;
                         jButton2.setBackground(Color.green);   
                     }
                     else if(atakilikontrol==true){
                         JOptionPane.showMessageDialog(null, "Helped 'a'");
                         buton2.setBounds(75, 75, 35, 35);  
                         buton2.setBackground(Color.green);     
                         takilmaKontrol=false;
                         atakilikontrol=false;
                         jButton2.setBackground(Color.green);
                         
                     }
                     else if(ctakilikontrol==true){
                         JOptionPane.showMessageDialog(null, "Helped 'c'");
                         buton3.setBounds(150, 150, 35, 35);  
                         buton3.setBackground(Color.green);
                         takilmaKontrol=false;
                         ctakilikontrol=false;      
                         jButton2.setBackground(Color.green);
                     }
                 }
                            
                }
        
        
        
        
        /*if(bugKontrol==false && takilmaKontrol==false && kontrol==true)
            JOptionPane.showMessageDialog(null, "Bugda olan buton yok" );*/
        
        
        //basildiMi=false;
        timer.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(carpisma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carpisma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carpisma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carpisma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carpisma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton;
    private javax.swing.JButton buton2;
    private javax.swing.JButton buton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
