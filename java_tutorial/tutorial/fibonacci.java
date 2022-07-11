package training;

/*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
      1 5 10 10 5 1
    ..................

0,1,1(1+0),2(1+1),3(2+1),5(3+2),8(5+3),13(8+5),21(13+8)...
*/


public class fibonacci {
    
    static void fibo(int value){ //Fibonacci series will be created as much as the entered value
        
        int previous = 0;
        int next = 1;
        int sum = 0;
        
        System.out.print(previous + " " + next); //print the first 2 values; the next numbers will be placed in accordance with the formula

        for(int i=2;i<value;i++){
            sum = next + previous;
            System.out.print(" " + sum);
            previous = next;
            next = sum;      
        }  
    }
    
    public static void main(String[] args) {
        
        fibo(50);
        
    }
    
}
