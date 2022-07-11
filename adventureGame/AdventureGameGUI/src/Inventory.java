
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Inventory {
    /*private boolean caveStone; //gizemli mağara taşı
    private boolean waterDrop; //su damlası
    private boolean canyonHill;
    private boolean Illicium_anisatum;
    private boolean end_of_the_desert;*/
    private boolean endCave,endRiver,endValley,endForest,endDesert,endHell;
    private String wName,aName; //weapon,armor Name
    private int damage,armor;
    private int level;
    private int exp = 0;
    
    public Inventory(){
        this.endCave=false;
        this.endRiver=false;
        this.endValley=false;
        this.endForest=false;
        this.endDesert=false;
        this.endHell=false;
        this.damage=0;
        this.armor=0;
        this.level = 1;
        this.exp = 0;
        this.wName=null;
        this.aName=null;    
    }
    
    public void ses_cal(){
         try {
                File file = new File("mix1.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(file));
                clip.start();
         
               } catch (Exception e) {   
                System.err.println(e.getMessage());
        }
    }
    
    public boolean isEndCave() {
        return endCave;
    }

    public void setEndCave(boolean endCave) {
        this.endCave = endCave;
    }

    public boolean isEndRiver() {
        return endRiver;
    }

    public void setEndRiver(boolean endRiver) {
        this.endRiver = endRiver;
    }

    public boolean isEndValley() {
        return endValley;
    }

    public void setEndValley(boolean endValley) {
        this.endValley = endValley;
    }

    public boolean isEndForest() {
        return endForest;
    }

    public void setEndForest(boolean endForest) {
        this.endForest = endForest;
    }

    public boolean isEndDesert() {
        return endDesert;
    }

    public void setEndDesert(boolean endDesert) {
        this.endDesert = endDesert;
    }

    public boolean isEndHell() {
        return endHell;
    }

    public void setEndHell(boolean endHell) {
        this.endHell = endHell;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        ses_cal();
        this.level = level;
        GameFrame.setMin_pros(GameFrame.getMin_pros() + 5);
        levelupForm lf = new levelupForm(GameFrame.getPlayer());
        lf.setVisible(true);
        //money static yapılabilir
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        if(this.exp >= (GameFrame.getMin_pros()-1)){ //100 de 100 olmadan level alacak
            this.setLevel(this.getLevel() + 1);
            this.exp=0;
        }
        else{
           this.exp = exp; 
        }
    }
    
    
    
}
