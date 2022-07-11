
import java.util.Scanner;


public class Player {
    private int damage,healthy,money,rHealthy; //rHealthy canı fullemek için
    private String name,cName;
    private Inventory inv; //Composition
    Scanner scn = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv=new Inventory();
    }
    
    
    //karakter seçimi
    public void selectCha(){
        switch(chaMenu()){
            case 1:
                initPlayer("Samurai", 5, 21, 15);
                break;
            case 2:
                initPlayer("Okçu", 7, 18, 21);
                break;
            case 3:
                initPlayer("Şovalye", 8, 24, 5);
                break;
        }
        //System.out.println("Seçiminiz: " + this.getName());
    }
    
    public int chaMenu(){
        System.out.println("Karakterinizi seçin.");
        System.out.println("Samurai -> Hasar:5 Sağlık:21 Para:15");
        System.out.println("Okçu -> Hasar:7 Sağlık:18 Para:20");
        System.out.println("Şovalye -> Hasar:8 Sağlık:24 Para:5");
        System.out.print("Seçim: ");
        int chaID = scn.nextInt();
        while(chaID<1 || chaID>3){
            System.out.println("Lütfen geçerli bir karakter seçin");
            chaID=scn.nextInt();
        }
        return chaID;
    }
    
    //Karakterlere özelliklerini atama metodu -> Constructor'da kullanıldı
    public void initPlayer(String cName, int damage, int healthy, int money){
        setName(cName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setrHealthy(healthy);
    }
    
    
    //karakterimizin silahıyla birlikte total damage'i hesaplayabilmek için
    public int getTotalDamage(){
        return this.getDamage() + this.getInv().getDamage();
    }
    
    

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }
    
    
    
}
