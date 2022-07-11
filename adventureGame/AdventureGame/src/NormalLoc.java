
public abstract class NormalLoc extends Location{

    //extends ile gelen constructor'da tanımlanması gereken özellik player ve name
    public NormalLoc(Player player,String name) {
        super(player);
        this.name=name;
    }

    public boolean getLocation(){ //@override abstract
        return true; //karakterimiz bu menüdeyken savaşmayacağı için true döndürülüyor (ölemez)
    }
    
}
