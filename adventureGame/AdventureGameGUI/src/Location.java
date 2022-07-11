
public abstract class Location {
    protected Player player;
    protected String name;
    
    public Location(Player player) {
        this.player=player;
    }
    
    //override edilecek
    public abstract boolean getLocation(); //true-false dönerek ölüp-ölmediğini kontrol edeceğiz
    
    
     public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
