
import java.util.Scanner;


public abstract class Location {
    //bu 2 özelliği sınıfı extends eden class'lar consturctor'da çağırmak zorundadır
    protected Player player; //Composition
    protected String name;
    Scanner scn = new Scanner(System.in);

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
