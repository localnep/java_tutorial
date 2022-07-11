
public abstract class Player {
    private String playerName;
    private int health,energy,magic,damage,defence,critical;
    
    private int money,rHealthy; //rHealthy canı fullemek için, moneyi burda tanımlamak saçma olmuş
    Inventory inv;

    public Player(String playerName, int health, int energy, int magic, int damage, int defence, int critical) {
        this.playerName = playerName;
        this.health = health;
        this.energy = energy;
        this.magic = magic;
        this.damage = damage;
        this.defence = defence;
        this.critical = critical;
        this.money = 20;
        this.inv = new Inventory();
    } 
    
    public abstract int getTotalDamage(); // artı kullanıcının attack değerini de getirtmemiz lazım
        //ayrıca ninja witch wizard için hepsi için ayrı totaldamage ayarlamamız gerekecek
        //bu yüzden totaldamage'i abstract yapsak mantıklı olur
        //return this.getDamage() + this.getInv().getDamage();
    public abstract int getTotalBlockedDamage();
    //böyle böyle aslında hepsine özel oluşturmak gerekiyor karakterlere özel silahlar içinde
    
    
    
    public void konus(){
        System.out.println("Player konuşuyor");
    }
    
    /*
    Samurai: 6 3 2 5 7 4 
    Knight: 6 2 1 9 7  1
    
    Ninja: 3 6 2 7 2 9
    Archer: 2 9 2 5 2 6
    
    Witch: 5 4 12 3 2 2
    Wizard: 7 6 8 1 1 1
    
    */


// --> Getters and Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }  

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
    
   
    
    
    
}
