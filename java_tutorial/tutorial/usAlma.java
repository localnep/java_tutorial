package training;
import java.util.Random;
import java.util.Scanner;

/*
Üst alma işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun başladığı zaman 2 ile 5
arasında rastgele bir tane sayı tutulacak, sonra 2-4 arasında rastgele başka bir sayı tutulacak
(tutulan sayıların aynı olup olmaması önemli değildir. Bunun ile ilgili kontrol yapmanıza gerek
yoktur). Tutulan sayılardan ilki sayının kendisi ikincisi ise kuvvetini (üssünü) temsil
etmektedir(birinciSayiikinciSayi). Kullanıcıya birinciSayi nin ikinciSayi kuvveti nedir diye sorulmalı ve
cevap istenmelidir. Eğer kullanıcı doğru cevap verirse “Tebrikler Bildiniz” değil ise “Üzgünüm
Bilemediniz” diye mesaj verecektir. Her cevaptan sonra “Tekrar Oynamak istiyormusunuz(e/E)?”
şeklinde bir soru sorulacak ve eğer kullanıcı “e” veya “E” ile karşılık verirse oyun tekrar
başlayacaktır değilse oyun sonlandırılacaktır. Bu işlemleri yapan programın kodlarını yazınız.

Örnek:
2 nin 3 kuvveti nedir=?
Cevap=8  Kullanıcı buradaki 8 değerini klavyeden girecek
Tebrikler Bildiniz.
Tekrar Oynamak istiyormusunuz(e/E)? E
3 nin 2 kuvveti nedir=?
Cevap=27  Kullanıcı buradaki 27 değerini klavyeden girecek
Üzgünüm Bilemediniz.
Tekrar Oynamak istiyormusunuz(e/E)? H
*/
public class usAlma {
    
    static int exponentiation(int base, int exponent){
        
        int result = 1;
        
        for(int i=1;i<=exponent;i++){
            result *= base; 
        }
        
       return result;
    }
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        boolean isAgain = true; //to replay the game.
        
        while(isAgain){
            //rnd.nextInt(bitisSayisi-baslangicSayisi)+baslangicSayisi;
            int baseValue = rnd.nextInt(6-2)+2; //takes a value between the baseValue (5,2)
            int exponentValue = rnd.nextInt(5-2)+2; //takes a value between the exponentValue (4,2)
                  
            System.out.println("Base: " + baseValue + " Exponent: " + exponentValue);
            System.out.print("What is the result? ");
            int result = scn.nextInt();
            
            if(exponentiation(baseValue, exponentValue) == result){
                System.out.println("Congratulations, your answer is correct.");
            }
            else{
                System.out.println("Sorry, your answer is wrong");
            }
            
            System.out.println("");
            
            System.out.print("Do you want to play again? (y/Y): ");
            scn.nextLine(); //dummy code, scn.nextInt'den sonra enter'a basıldığında enter'ı cevap olarak almasın
            String answer = scn.nextLine();
            
            if(answer.toLowerCase().equals("y")){
                isAgain = true;
            }
            else{
                isAgain = false;
            }     
        } //end of while loop
        
        
    }
}
