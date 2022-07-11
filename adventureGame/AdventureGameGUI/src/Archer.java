
public class Archer extends Player{

    public Archer(String playerName) {
        super(playerName, 1, 1, 1, 1, 1, 1);
    }

    @Override
    public void konus() {
        System.out.println("Archer konusuyor"); //To change body of generated methods, choose Tools | Templates.
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
