package interviewQuestions;

/*
Return duplicate characters from a string

write a java method to return duplicate characters (occurrence >=2) from an input string
in the same order they are in the input.
each duplicate characters must exist only once in the output string

Example
Input: "happy"
Output: "p"

Input: "improper"
Output: "pr"
*/


public class tekrarlananHarf {
    
    static String duplicate(String kelime){
        
    String result = "";
    
    for(int i=0;i<kelime.length()-1;i++){
        for(int j=i+1;j<kelime.length();j++){
            if(kelime.charAt(i) == kelime.charAt(j)){
                String harfler = "";
                harfler += kelime.charAt(i);
                if(!result.contains(harfler)){
                    result += kelime.charAt(i);
                }
            }  
        }
    }  

    return result;
    }
    
    
    static char encoktekrarEdenHarf (String kelime){
        
        char result = ' ';
        int temp = 0;
        
        for(int i=0;i<kelime.length()-1;i++){
            int say = 0;
            for(int j=i;j<kelime.length();j++){
                if(kelime.charAt(i) == kelime.charAt(j)){
                    say++;
                }
            }
            if(say > temp){
                result = kelime.charAt(i);
                temp = say;
            }
        }
        
        System.out.print("Tekrar sayisi: " + temp + " ");
        return result;
    }
    
    
    public static void main(String[] args) {
        System.out.println(duplicate("happy"));
        System.out.println(encoktekrarEdenHarf("aabbbaaaacccaaaddddaaaaffffffaooppaawwweeerrrttyyuuı"));
    }
    
}
