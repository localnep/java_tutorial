
public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }
    
    public boolean getLocation(){ //@override abstract
        player.setHealthy(player.getrHealthy()); //canı fulledik
        System.out.println("Güvenli Evdesiniz\nSağlık fullendi");
        return true;
    }
    
}
