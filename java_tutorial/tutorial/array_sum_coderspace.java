
package training;

/*
Input: ["[5, 2, 3]", "[2, 2, 3, 10, 6]"]
Output: 7-4-6-10-6

Input: ["[1, 2, 1]", "[2, 1, 5, 2]"]
Output: 3-3-6-2
*/


public class array_sum_coderspace {
    
    static void fonksiyon(int[] value1,int[] value2){
        int[] result = {};
        
        
        if(value1.length == value2.length){
            result = new int[value1.length];
            for(int i=0;i<value1.length;i++){
                result[i] = value1[i] + value2[i];
            }
        }
        
        else{
            int buyukolan = 0;
            int kucukolan = 0;
            if(value1.length > value2.length){
                buyukolan = value1.length;
                kucukolan = value2.length;
                result = new int[buyukolan];
                     for(int i=0;i<buyukolan;i++){
                     result[i] = value1[i];
                    }
            }
            else{
                buyukolan = value2.length;
                kucukolan = value1.length;
                result = new int[buyukolan];
                for(int i=0;i<buyukolan;i++){
                     result[i] = value2[i];
                    }
            }
            
            
    
            
            for(int i=0;i<kucukolan;i++){
                result[i] = value1[i] + value2[i];
            }
        }
            
        
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
    
    
    
    public static void main(String[] args) {
        
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,2,4,5,7};
        int[] array3 = {1,2};
        
        //fonksiyon(array1,array2);
        fonksiyon(array1, array3);
        
        
    }
    
}
