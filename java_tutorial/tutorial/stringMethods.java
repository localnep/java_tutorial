
package training;


public class stringMethods {
    
    public static void main(String[] args) {
        
        String kelime = "Ozan";
        
        kelime.charAt(2); //a harfini döndürür
        kelime.contains("a"); //a harfini içeriyor mu? --> true döner
        kelime.equals("ozAn"); //iki string eşit mi? --> false (büyük küçük duyarlı)
        kelime.equalsIgnoreCase("OZAN"); //true (büyük küçük harf duyarlı değil
        kelime.compareTo("A"); //harf O harfindan önce olduğu için pozitif yoksa negatif kelime eşitse 0
        kelime.indexOf("a"); //kelime de kaçıncı index de? --> 2
        kelime.lastIndexOf("a"); //karakterin bulunduğu son index değerini gösterir.
        kelime.replace('a', 'c'); //a harfinin yerine c harfini koyar --> ozcn
        kelime.subSequence(1, 2); //1.indexten 2.index'e kadar (2.index dahil değil) getirir. --> z
        kelime.split(" "); //boşluk karakterine göre string'i böler ve geriye dizi döndürür
        kelime.toUpperCase(); //tüm harfleri büyük yapar
        kelime.toLowerCase(); //tüm harfleri küçük yapar
        kelime.trim(); //sağındaki ve solundaki boşlukları siler
    }
    
}
