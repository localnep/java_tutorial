
import java.util.Scanner;


public class Game {
    Player player; //composition
    Location location; 
    Scanner scn = new Scanner(System.in);
    
    public void login(){
        System.out.print("İsim: ");
        String playerName = scn.nextLine();
        player=new Player(playerName);
        player.selectCha();
        start();
    }
    
    public void start(){
        while(true){
        System.out.println("");
        System.out.println("Nereye gidiyoruz?");
        System.out.println("1. Güvenli Ev");
        System.out.println("2. Mağara");
        System.out.println("3. Orman");
        System.out.println("4. Nehir");
        System.out.println("5. Mağaza");
        
        int selLoc = scn.nextInt();
        while(selLoc<0 || selLoc>5){
            System.out.print("Lütfen geçerli bir seçim yapınız: ");
            selLoc = scn.nextInt();
        }
        
        switch(selLoc){ //Polymorphism
            case 1:
                location = new SafeHouse(player);
                break;
            case 2:
                location = new Cave(player);
                break;
            case 3:
                location = new Forest(player);
                break;
            case 4:
                location = new River(player);
                break;
            case 5:
                location = new ToolStore(player);
                break;
        }
        
        
        //Oyunu bitirmek
            if(location.getClass().getName().equals("SafeHouse")){
                if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()){
                    System.out.println("Tebrikler, Win");
                    break;
                }
            }
            if(!location.getLocation()){
                System.out.println("Game Over");
                break;
            }
        }
        }
    }
