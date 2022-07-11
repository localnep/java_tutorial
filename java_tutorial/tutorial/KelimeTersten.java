package training;
import java.util.Scanner;

/*
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
For example: if the input string is "Hello World and Coders" 
then your program should return the string sredoC dna dlroW olleH.

Input: "coderbyte"
Output: etybredoc

Input: "I Love Code"
Output: edoC evoL I
*/

public class KelimeTersten {
    
    public static String FirstReverse(String str) {
        
    //char[] harfler = new char[str.length()];
    String kelime = "";
    
        
    for(int i=str.length()-1;i>=0;i--){
        //harfler[i] = str.charAt(i);  
        kelime+= str.charAt(i);
    }  
       
   
    return kelime;
  }
    
    
    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine()));
        
    } 
    
}
