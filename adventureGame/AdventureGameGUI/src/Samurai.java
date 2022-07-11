
public class Samurai extends Player{

    public Samurai(String playerName) {
        super(playerName, 1, 1, 1, 1, 5, 1);
    }

    @Override
    public void konus() {
        System.out.println("Samurai konuşuyor");
    }
    
     @Override
    public int getTotalDamage() {
        return this.getDamage() + this.getInv().getDamage();
    }
    
    @Override
    public int getTotalBlockedDamage() {
        return this.getDefence() + this.getInv().getArmor();
    }
    
    
}
