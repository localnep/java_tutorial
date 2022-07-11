package stars;

/*
Draw1:
    *
    ** 
    ***
    ****   
    *****  
    ******
(7.)******* (7*)

Draw2:
    *******(7*)
    ******  
    *****
    ****
    ***
    **
(7.)*
*/


public class Example1 {
    
    public static void main(String[] args) {
        
        
        //Draw1
        
        for(int i=1;i<=7;i++){ //satır sayısı 7
            for(int j=1;j<=i;j++){ //j=0,i=1 ; j=1,i=2 ; j=2,i=3 ; j=3,i=4 ; ..
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        //Draw2
        
        for(int i=1;i<=7;i++){
            for(int j=7;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
  
        
    }   
}