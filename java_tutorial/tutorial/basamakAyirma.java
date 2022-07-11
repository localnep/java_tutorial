
package training;


public class basamakAyirma {
    
    static void basamaklarinaAyir(int sayi){
        
        int binler,yuzler,onlar,birler;
        
        binler = sayi/1000;
        yuzler = (sayi / 100) %10;
        onlar = (sayi / 10) % 10;
        birler = sayi % 10;
        
        System.out.println("Binler: " + binler + " Yuzler: " + yuzler + " Onlar: " + onlar + " Birler: " + birler);
        
    }
    
    
    public static void main(String[] args) {
        
        basamaklarinaAyir(9042);
        
    }
    
    
}
