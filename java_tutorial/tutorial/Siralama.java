package training;
import java.util.Random;

/*
Verilen sayılardan en büyük ve en küçük sayıyı bulun ve küçükten büyüğe doğru sıralayın.
*/


public class Siralama {
    
    
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int[] sayilar = new int[20];
        
        //sayıları oluşturma
        for(int i=0;i<sayilar.length;i++){
            int sayi = rnd.nextInt(100); //0-99 arası
            sayilar[i] = sayi;    
        }
        
        //sayıları yazdırma
        for(int i=0;i<sayilar.length;i++){
            System.out.print(sayilar[i] + " ");
        }
        
        //sayıları sıralama
        for(int i=0;i<sayilar.length-1;i++){
            for(int j=i+1;j<sayilar.length;j++){
                if(sayilar[i] > sayilar[j]){
                    int temp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = temp;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //en büyük en küçük bul
        for(int i=0;i<sayilar.length;i++){
            if(sayilar[i] < min){
                min = sayilar[i];
            }
            if(sayilar[i] > max){
                max = sayilar[i];
            }
        }
        
        System.out.println("");
        System.out.println("******************************************");
        
        System.out.println("Küçükten büyüğe sıralı");
        
        //sayıları yazdırma
        for(int i=0;i<sayilar.length;i++){
            System.out.print(sayilar[i] + " ");
        }
        
        
        System.out.println("");
        //en büyük en küçük yazdırma
        System.out.println("En büyük sayı: " + max + " En küçük sayı: " + min);

    }  
}
