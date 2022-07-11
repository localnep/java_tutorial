package training;

/*
0'dan 100'e kadar asal olan sayıları ekrana yazdırma
*/


public class Asal {
    
    static boolean asalMi(int sayi){
        
        
        for(int i=2;i<sayi;i++){
            if(sayi % i == 0){
                return false;
            }    
        }
        
        return true;
    }
    
    
    
    public static void main(String[] args) {
        
         for(int i=2;i<=100;i++){
             if(asalMi(i)){
                 System.out.print(i + " ");
             }  
        }
       
          
    } 
}
