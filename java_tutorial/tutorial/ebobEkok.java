package training;


public class ebobEkok {
    
    static void ebob(int value1, int value2){
        
        int min = 0;
        
        if(value1 < value2){
            min = value1;
        }
        else{
            min = value2;
        }
        
        int ebob = 1;
        
        for(int i=1;i<=min;i++){
            if((value1 % i == 0) && (value2%i == 0)){
                ebob = i;
            }
        }
        
        System.out.println("Ebob: " + ebob);
        
    }
    
    static void ekok(int value1, int value2){
        
        int ekok = 0;
        
        int max = value1*value2;
        
        

        
        for(int i=max;i>0;i--){
            if((i % value1 == 0) && (i%value2 == 0)){
                ekok = i;
            }
        }
        
        System.out.println("Ekok: " + ekok);    
    }
    
    
    public static void main(String[] args) {
        
        ebob(120, 50);
        ekok(120, 50);
            
    }
    
}
