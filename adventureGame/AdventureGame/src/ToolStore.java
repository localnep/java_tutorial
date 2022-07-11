
public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }
    
    public boolean getLocation(){ //@method override
        System.out.println("Para: " + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.print("Seçim: ");
        int selTol = scn.nextInt();
        int selItemID;
        switch(selTol){
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;
        }
        return true;
    }
    
    
    
    
    public int armorMenu(){
        System.out.println("1. Hafif Zırh -> Para:15 Def:2");
        System.out.println("2. Orta Zırh -> Para:25 Def:3");
        System.out.println("3. Ağır Zırh -> Para:40 Def:7");
        System.out.println("4. Çıkış");
        int selArmorID = scn.nextInt();
        return selArmorID;   
    }
    
    public void buyArmor(int ItemID){
        int avoid=0,price=0;
        String aName=null;
        switch(ItemID){
                case 1:
                    avoid=1;
                    aName="Hafif Zırh";
                    price=15;
                    break;
                case 2:
                    avoid=3;
                    aName="Orta Zırh";
                    price=25;
                    break;
                case 3:
                    avoid=5;
                    aName="Ağır Zırh";
                    price=40;
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
        
        if(price>0){
        if(player.getMoney() >= price){
            player.getInv().setArmor(avoid);
            player.getInv().setaName(aName);
            player.setMoney(player.getMoney()-price);
            System.out.println(aName + " satın aldınız. Engellenen Hasar: " + player.getInv().getArmor());
            System.out.println("Kalan paranız: " + player.getMoney());
        }
        else{
            System.out.println("Bakiye yetersiz");
        }
     }  
    }
    

    public int weaponMenu(){
        System.out.println("1. Tabanca -> Para:25 Hasar:2");
        System.out.println("2. Kılıç -> Para:35 Hasar:3");
        System.out.println("3. Tüfek -> Para:45 Hasar:7");
        System.out.println("4. Çıkış");
        int selWeaponID = scn.nextInt();
        return selWeaponID;        
    }
    
    public void buyWeapon(int ItemID){
        int damage=0,price=0;
        String wName=null;
        switch(ItemID){
                case 1:
                    damage=2;
                    wName="Tabanca";
                    price=25;
                    break;
                case 2:
                    damage=3;
                    wName="Kılıç";
                    price=35;
                    break;
                case 3:
                    damage=7;
                    wName="Tüfek";
                    price=45;
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
        
        
        if(price>0){
        if(player.getMoney() >= price){
        player.getInv().setDamage(damage);
        player.getInv().setwName(wName);
        player.setMoney(player.getMoney()-price);
        System.out.println(wName + " satın aldınız. Önceki Hasar: " + player.getDamage() + " Yeni Hasarınız: " + player.getTotalDamage());
            System.out.println("Kalan paranız: " + player.getMoney());
        }
        else{
            System.out.println("Bakiye yetersiz");
        }
     }  
  
    }
    
}
