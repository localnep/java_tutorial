
public class Knight extends Player{

    public Knight(String playerName) {
        super(playerName, 1, 1, 1, 1, 1, 1);
    }

    @Override
    public void konus() {
        System.out.println("Knight konusuyor");
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
