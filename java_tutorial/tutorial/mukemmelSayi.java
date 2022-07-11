package training;

//Mükemmel Sayı: Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayıya denir.


public class mukemmelSayi {
    
    static void perfectNumber(int value){
        
        int sum = 0;
        
        for(int i=1;i<value;i++){
            if(value % i == 0){
                sum += i;
            } 
        }
        
        System.out.println("Toplam değer: " + sum);
        
        if(sum == value){
            System.out.println(value + " value is the perfect number");
        }
        else{
            System.out.println(value + " valuse is not the perfect number");
        }
    }
    
    
    static void formula(int p){
        // formula = (2^(p-1))*((2^p)-1) and p and ((2^p)-1) must be a prime number.
        double result = Math.pow(2,(p-1)) * (Math.pow(2, p)-1);
        System.out.println(result + " is a perfect number");
    }
    
    
    
    public static void main(String[] args) {
        
        perfectNumber(28);
        
        formula(7); //2,3,5,7,13,17.. (put prime number)
        
    }
    
}
