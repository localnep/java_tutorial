package inputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
D:\ogrenciler.txt dosyası içerisinde her bir satırda aşağıdaki biçimde öğrencilere ait şu bilgiler bulunmaktadır:
ÖğrenciAdı;ÖğrenciNumarası;SayısalPuanı;SözelPuanı
Dosyada kaç satır bilgi olduğu belli değildir. Her bir satır bir öğrencinin bilgilerini içermektedir.
Eğer 100 satır var ise bunun anlamı dosyada 100 farklı öğrenciye ait bilgi vardır.
Klavyeden girilen string veritipindeki öğrenci numarasına göre dosya içerisinde öğrenci numarası
aranıp eğer ilgili öğrenci varsa sözel puanını ekrana yazdıran eğer öğrenci yoksa “Bu öğrenci
bulunamadı”, diye mesaj yazan programın kodlarını yazınız
*/


public class Example1 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your student number: ");
        String stdID = scn.nextLine();
        
        //FileReader fr = new FileReader("D:\\ogrenciler.txt");
        FileReader fr = new FileReader("C:\\Users\\erdog\\Documents\\NetBeansProjects\\Algorithms\\src\\inputOutput\\students.txt");
        BufferedReader read = new BufferedReader(fr); //line-by-line reading
        
        boolean foundIt = false; //true will be set if stdID(student number) is found.
        
        String line = read.readLine(); //first line is read
        
        while(line!=null){
            String[] array;
            array = line.split("\\;"); //array[0]: student number, array[1]: student id, array[2]:math score, array[3]:language score
            if(array[1].equals(stdID)){ //since it is a meta character, we split it by adding \\
                foundIt = true;
                System.out.println("student's language score: " + array[3]);
            }
            line = read.readLine(); //switch to new line when line ends
        }
        
        if(foundIt == false){
            System.out.println("This student was not found!");
        }
        
        read.close();
        
        
    }   
}
