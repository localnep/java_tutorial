
package recursiveFunctions;

import java.util.Random;
import java.util.Scanner;

//Programlama 1 Final sorusu 2020

/*
Sayının kuvvetini hesaplayan recursive (kendi kendini çağıran) bir metot yazınız.
Metot şöyle olmalıdır; int kuvvetHesapla(int sayi,int kuvveti)

*/
public class Example2 {
    
    static int kuvvetHesapla(int sayi, int kuvveti){
        if(kuvveti == 0){
            return 1;
        }
        
        return sayi * kuvvetHesapla(sayi, kuvveti - 1);
        /*
        for example if the sayi 3 and kuvveti 2 is sent to the function
        3*kuvvetHesapla(3,1)                        --> kuvvetHesapla(3,2) = 9
        kuvvetHesapla(3,1) = 3*kuvvetHesapla(3,0)   --> kuvvetHesapla(3,1) = 3
        kuvvetHesapla(3,0) = 1
        */
    }
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.print("If you want to enter the values, enter 'me',"
                + " if you want to generate the values randomly, enter 'random': ");
        String choice = scn.nextLine();
        
        
        if(choice.equals("me")){
            System.out.print("Please enter the base value: ");
            int baseValue = scn.nextInt();
            System.out.print("Please enter exponent value: ");
            int exponentValue = scn.nextInt();
            System.out.println("Result: " + kuvvetHesapla(baseValue, exponentValue));
        }
        
        else if(choice.equals("random")){
            System.out.println("it is limited to avoid big results!");
            int baseValue = rnd.nextInt(6-1)+1;
            int exponentValue = rnd.nextInt(6-1)+1;
            System.out.println("Base Value: " + baseValue + " Exponent Value: " + exponentValue);
            System.out.println("Result: " + kuvvetHesapla(baseValue, exponentValue));
        }
        else{
            System.out.println("wrong choice!");
        }
        
    }
}
