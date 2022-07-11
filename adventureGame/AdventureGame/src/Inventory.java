
public class Inventory {
    private boolean water,food,firewood; //3'nüde tamamlarsak oyun bitirilecek
    private String wName,aName; //weapon,armor Name
    private int damage,armor;

    public Inventory() { //oyun başlangıcında hiçbirşey alınmamış default hali, player cons'da çağrıldı
        this.water=false;
        this.food=false;
        this.firewood=false;
        this.damage=0;
        this.armor=0;
        this.wName=null;
        this.aName=null;
    }
    

    
    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
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

}
