
package training;

/*
Input: "never odd or even"
Output: true
Input: "eye"
Output: true
*/


public class reverse_word_coderspace {
    

static boolean kelimeTersten(String kelime){
        String result = "";
        
        for(int i=kelime.length()-1;i>=0;i--){
            result+= kelime.charAt(i);
        }
        
        kelime = kelime.replace(" ", "");
        result = result.replace(" ", "");
        
        
        if(kelime.equals(result)){
            return true;
        }
        else{
            return false;
        }     
    }
 
    public static void main(String[] args) {
        
        System.out.println(kelimeTersten("never odd or even"));
        
    }
    
}
