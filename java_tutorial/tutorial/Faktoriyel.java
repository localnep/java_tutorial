package training;
import java.util.Scanner;

/*
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. 
For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
For the test cases, the range will be between 1 and 18 and the input will always be an integer.

Examples
Input: 4
Output: 24

Input: 8
Output: 40320
*/

public class Faktoriyel {
    
    public static int FirstFactorial(int num) {
    // code goes here 
    int result = 1;
    
    if((num < 1) || (num > 18)){
        System.out.println("Lütfen 1 ile 18 arasında bir sayı girin");
        return result = 0;
    }
    
        
    for(int i=num;i>=1;i--){
        result *= i; //1*4 = 4, 4*3=12, 12*2=24, 24*1=24
        return result;
    }
    
    return result;
  }
    
    
    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);
    System.out.print(FirstFactorial(scn.nextInt()));
        
    }
    
}
