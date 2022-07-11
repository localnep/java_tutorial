
public abstract class BattleLoc extends Location{
    protected Obstacle obs; //composition -> has a
    protected String award; //ödül

    public BattleLoc(Player player, String name, Obstacle obs, String award) {
        super(player); //kalıtım ile gelen özellik
        this.name = name;
        this.obs = obs;
        this.award=award;
    }
    
    public boolean getLocation(){ //@override abstract
        int obsCount = obs.Count();
        System.out.println("Şuan buradasınız: " + this.getName());
        System.out.println(obs.getName() + " çıkabilir");
        System.out.println("<s>avaş veya <k>aç");
        String selCase = scn.nextLine();
        selCase = selCase.toUpperCase();  //büyük harfe çevrildi
        if(selCase.equals("S")){
            if(combat(obsCount)){
                System.out.println(this.getName() + " bölgesinde ki tüm düşmanları temizlediniz");
                if(this.award.equals("Food") && player.getInv().isFood() == false){
                    System.out.println(this.award + " kazandınız");
                    player.getInv().setFood(true);
                }
                else if(this.award.equals("water") && player.getInv().isWater() == false){
                    System.out.println(this.award + " kazandınız");
                    player.getInv().setWater(true);
                }
                else if(this.award.equals("Firewood") && player.getInv().isFirewood() == false){
                    System.out.println(this.award + " kazandınız");
                    player.getInv().setFirewood(true);
                }
                return true;
            }
            if(player.getHealthy() <= 0){
                System.out.println("Öldünüz");
                return false;
            }
        }
        return true;
    }
    
    public boolean combat(int obsCount){
        for(int i=0; i<obsCount; i++){
            int defObsHealth = obs.getHealth();
            playerStats();
            enemyStats();
            System.out.println(obs.Count() + " adet canavar var");
            while(player.getHealthy() > 0 && obs.getHealth() > 0){
                System.out.print("(v)ur veya (k)aç: ");
                String selCase = scn.nextLine();
                selCase = selCase.toUpperCase();
                if(selCase.equals("V")){
                    System.out.println("Siz vuruyorsunuz");
                    obs.setHealth(obs.getHealth() - player.getTotalDamage());
                    afterHit();
                    if(obs.getHealth() > 0){
                        System.out.println("Canavar size vurdu");
                        player.setHealthy(player.getHealthy() - (obs.getDamage()-player.getInv().getArmor()));
                        afterHit();
                    }
                    
                }
                else{
                    return false;
                }
            }
            if(obs.getHealth() <= 0 && player.getHealthy() > 0){
                System.out.println(obs.getName() + " öldü");
                System.out.println(obs.getName() + " size " + obs.getAward() + " birim para kazandırdı");
                player.setMoney(player.getMoney() + obs.getAward());
                System.out.println("Güncel paranız: " + player.getMoney());
                obs.setHealth(defObsHealth);
            }
            else{
                return false; //ödüysek
            }
        }
        return true;
    }
    
    public void  afterHit(){
        System.out.println("Oyuncu canı: " + player.getHealthy());
        System.out.println(obs.getName() + " canı: " + obs.getHealth());
    }
    
    public void playerStats(){
        System.out.println("Oyuncu Değerleri:");
        System.out.println("Can: " + player.getHealthy());
        System.out.println("Hasar: " + player.getTotalDamage());
        System.out.println("Para: " + player.getMoney());
        if(player.getInv().getDamage() > 0){
            System.out.println("Silah: " + player.getInv().getwName());
        }
        if(player.getInv().getArmor() > 0){
            System.out.println("Zırh: " + player.getInv().getaName());
        }
    }
    
    public void enemyStats(){
        System.out.println(obs.getName() + " Değerleri:");
        System.out.println("Can: " + obs.getHealth());
        System.out.println("Hasar " + obs.getDamage());
        System.out.println("Ödül: " + obs.getAward());
    }
}
