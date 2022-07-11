package interviewQuestions;

/*
Koşulumuzdan sonra soru işareti koyarız daha sonra koşul doğru ise dönecek cevabı yazarız daha sonra : 
iki nokta üst üste koyarak yanlış ise dönecek cevabı yazarız.
*/


public class soruIsareti {
    
    public static void main(String[] args) {
        String[] elements = {"Yazılım","Veritabani","Network","İşletim Sistemi"};
        Object obj = (elements.length > 0 ? elements[elements.length / 2] : null);
        System.out.println(obj);
        
        System.out.println(10<<2); //10 sayısının bitlerini sola kaydır 2
    }   
}
