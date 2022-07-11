
package recursiveFunctions;

//Programlama 1 Vize sorusu 2020

/*
1 sayısından kendisine parametre olarak yollanan pozitif tam sayıya kadar sayıların karelerinin toplamını
geriye döndüren Recursive (kendini çağıran) bir metot yazıp main ana metodunda kullanınız.
Örneğin metoda parametre olarak 3 değeri yollanacaksa metot 1*1+2*2+3*3 sonucunu hesaplayacaktır, ve geriye
14 değerini döndürecektir.
*/

/*
Fonksiyona sorulması gereken sorular;
i. Çalışması için dışarıdan parametre/bilgi/değer yollanacak mı? --> Evet değer değişkenimiz main fonksiyonundan gönderilecek
ii. Ne iş yapacak --> Örneğin metoda parametre olarak 3 değeri yollanacaksa metot 1*1+2*2+3*3 sonucunu hesaplayacaktır.
iii. Yaptığı iş sonucu geriye sonuç/bilgi/değer döndürecek mi? --> Evet o yüzden int türünden fonksiyonumuzu oluşturuyoruz
     istemeseydi void (geriye değer döndürmeyen) ile yapabilirdik.
*/


public class Example1 {
    
    static int F(int value){
        if(value == 1){
            return 1;
        }
        
        return F(value - 1) + (value) * (value);
        
        /*
        for example if the value 6 is sent to the function
        F(6) = F(5) + 6*6
        F(5) = F(4) + 5*5
        F(4) = F(3) + 4*4
        F(3) = F(2) + 3*3
        F(2) = F(1) + 2*2
        F(1) = it goes into the if block and results in 1.
        */
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(F(3));
        
    }
}
