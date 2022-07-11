package stars;

/*
Draw:

    * (1)
   *** (3)
  ***** (5)
 ******* (7)
  ***** (5)
   *** (3)
    * (1)
*/

/*
Draw1:
         *  
        * *  
       * * *  
      * * * *  
     * * * * *  
    * * * * * *  
   * * * * * * *  
  * * * * * * * *  
 * * * * * * * * * (9.)(9*)

Draw2:
 * * * * * * * * * (9*)
  * * * * * * * *
   * * * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * * 
        * *
         *   (9.)
*/
public class Example2 {
    
    public static void main(String[] args) {
        
        //Draw 1
        
        int bosluk = 9; //bosluk satır sayısı arttıkça -1 azalacak
        
        for(int i=1;i<=9;i++){ //satır sayısı
            //bosluk ekleme
            for(int j=1;j<=bosluk;j++){
                System.out.print(" ");
            }
            bosluk--;
            
            //yıldız ekleme
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
        
        
        //Draw 2
        
        int bosluk2 = 1; //bosluk sayısı satır sayısı arttıkça +1 artacak
        
        for(int i=1;i<=9;i++){ //satır sayısı
            //bosluk ekleme
            for(int j=1;j<=bosluk;j++){
                System.out.print(" ");
            }
            bosluk++;
            
            //yıldız ekleme
            for(int k=9;k>=i;k--){
                System.out.print("* ");
            }
            
            System.out.println("");       
        }        
        
            
        
        
    }
}
