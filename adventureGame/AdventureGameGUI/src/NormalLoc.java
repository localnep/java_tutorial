
public abstract class NormalLoc extends Location{

    public NormalLoc(Player player) {
        super(player);
    }
    
    @Override
    public boolean getLocation() {
        System.out.println("normal loc");
        return true;
    }
    
}
