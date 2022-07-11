package training;
import java.util.Scanner;

/*
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 1221, 9889 vb.
örnek: kazak,neden,yatay
*/

public class Palindromik {
    
    static boolean palindromikSayi(int sayi){ //313
          
        int ilkdeger = sayi; //ilkdeger = 313
        int length = String.valueOf(sayi).length(); //length = 3        
        
        int kalan,deger=0; 
        
        for(int i=0;i<length;i++){ //i=0,                i=1,             i=2
            kalan = sayi%10; //kalan = 3         kalan=1          kalan=3
            deger = deger*10+kalan; //deger = 3       deger=31         deger=313
            sayi = sayi/10; //palindrom=31   palindrom=3     palindrom=0
        }
        
         if(deger == ilkdeger){
            System.out.println(deger + " Palindrom Sayidir.");
            return true;
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
            return false;
        }
    }
    
    static boolean palindromikKelime(String kelime){
        String result = "";
        
        for(int i=kelime.length()-1;i>=0;i--){
            result+= kelime.charAt(i);
        }
        
        
        
        if(kelime.equals(result)){
            System.out.println(kelime + " Palindromik kelimedir.");
            return true;
        }
        else{
            System.out.println(kelime + " Palindromik kelime değildir!");
            return false;
        }     
    }
    
    
    
    public static void main(String[] args) {
  
        palindromikSayi(313);
        
        palindromikKelime("eski dedikse");
            
       
    }  
}
