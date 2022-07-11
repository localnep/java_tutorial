
package interviewQuestions;

import java.util.ArrayList;

//Logo yazılım soru 24

public class arrayList {
    
    
    
static private ArrayList<Integer> Execute(String input){
    
        String[] array = input.split(" "); //gelen input ifadesindeki değerleri boşluklara göre bölerek dizi oluştur
        //gelen ifade: Logo 11 elma -10 111 69
        System.out.println(array[0]); //array[0] = Logo
        System.out.println(array[1]); //array[1] = 11
        System.out.println(array[2]); //array[2] = elma
        System.out.println(array[3]); //array[3] = -10
        System.out.println(array[4]); //array[4] = 111
        System.out.println(array[5]); //array[5] = 69
        
        ArrayList<Integer> result = new ArrayList<Integer>(); //result arrayList'i oluşturduk
        
        
        for(int i=0;i<array.length;){ //geziniyoruz i[0]:'logo', i[1]:11, i[2]:'elma', i[3]:-10... 
            try{
                result.add(Integer.parseInt(array[i])); //i[0] ifadesi int'e dönüştürülemiyor, hata verecek
                i++;
            }
            catch(Exception e){ //i[0] ifadesi exception fırlatır yani catch edilir
                i++; 
            }
        }
        
        //bu döngü sonucu result ArrayList'i = result{11,-10,111,69}, size=4
        //System.out.println(result);
        
        
        for(int i=0;i<result.size()-1;i++){         //i=0, i=1, i=2
            for(int y=i+1;y<result.size();y++){     //y=1, y=2, y=3, y=4
                if(result.get(i) > result.get(y)){  //result[0] > result[1] ise yani 11 > -10'mu --> true
                    int temp = result.get(i);       // temp = 11
                    result.set(i, result.get(y));   // result[0] = -10
                    result.set(y, temp);            // result[1] = 11 yani küçüğü sola büyüğü sağa çekiyor sıralama
                }
            }
        }
        return result;
}
    
  
    
    
    public static void main(String args[]){
        
        System.out.println(Execute("Logo 11 elma -10 111 69"));
        
      }
    }