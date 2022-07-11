
package lotteryApp;

import java.util.Random;
import java.util.Scanner;

//Programlama 1 Vize sorusu 2020

/*
Sayısal loto programı yapılması istenmektedir. Programın kuralları şu şekilde olmalıdır;
a. Kullanıcı kaç kolon oynayacağı bilgisini girecektir.
b. Oynanabilecek kolon sayısı en fazla 8'dir.
c. Bir sayı sadece 1 kere kullanılacaktır. Yani 1 sayı sadece 1 kolondo olacak.
d. Sonrasında kullanıcının belirlediği kadar kolondaki sayılar rastgele oluşturulacaktır.
e. Her kolonda sayı dağılımına dikkat edilmelidir.
    i. Her kolondaki tek ve çift sayı adeti aynı olmalıdır.
    ii. Her kolonda 1-10, 11-20, 21-30, 31-40, 41-49 arasında en fazla 2 sayı olabilir
        Yani bir kolondaki sayılar şöyle olamaz; 4-5-8-12-17-25 -> Hata 1-10 arasında 3 tane sayı var
f. Kolonlar oluşturulduktan sonra her kolon küçükten büyüğe doğru sıralanıp ekrana yazdırılacak. 

Örnek çıktı:
Kolon 1 Sayıları: 4-5-11-12-21-26
Kolon 2 Sayıları: 1-9-14-24-39-49
Kolon 3 Sayıları: 15-18-27-28-37-40
*/


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of columns you want to play: ");
        int nColumns = scn.nextInt();
        
        while(nColumns > 8){
            System.out.println("The maximum number of columns must be 8");
            System.out.print("Please enter a column number of 8 or less: ");
            nColumns = scn.nextInt();
        }
        
        int[][] tdArray = new int[nColumns][6]; //two-dimensional Array
        
        Random rnd = new Random();
        
        for(int i = 0; i < nColumns; i++){
            int[] position = {0,0,0,0,0}; //temp array for e(ii): there must be at most 2 numbers from the same range.
            for(int j = 0; j < 6; j++){
                int generatedNumber = 0; //the number that we will insert into the array according to the desired rules.
                boolean generated = false;
                
                while(!generated){ //if this while loop is exited; unique, even-odd rule, number in the desired range are provided.
                    boolean controllerEvenOdd = true;
                    while(controllerEvenOdd){ //if this while loop is exited; unique and even-odd rule are provided.
                        boolean unique = false;
                        while(!unique){ //if this while loop is exited; unique number is generated.
                            generatedNumber = rnd.nextInt(49)+1; //generatedNumber between 1 and 49
                            boolean exit = false;
                            for(int t = 0; t <= i; t++){ //in which element of which column, it searches up to that point. will not search all elements of the array.
                                for (int k = 0; k < 6; k++){
                                    if(i == t && k == j){ //if the generatedNumber value there is not in the array
                                        exit = true;
                                        unique = true;
                                        break;                                     
                                    }
                                    if(tdArray[t][k] == generatedNumber){ ////if the generatedNumber value there is in the array
                                        exit = true;
                                        break; //this break command terminates the innermost for loop and must be again enter the while(!unique) loop and create a new generatedNumber                                     
                                    }
                                }
                                if(exit){ //exit for loop with t variable, and continue or not continue depending on the state of the unique variable.
                                    break;
                                }
                            }
                        } //exit while(!unique)-> unique number successfully generated
                        
                        boolean oddNumberController = true;
                        if(generatedNumber % 2 == 0){ //generatedNumber is even
                            oddNumberController = false;
                        }
                        
                        int nOddEven = 1; //number of odd even, goal: make even and odd numbers equal on the same line
                        for(int m = 0; m < j; m++){
                            if(oddNumberController && (tdArray[i][m] % 2 == 1)){ //if the number i generated is odd and the number in the column is odd
                                nOddEven++;          
                            }
                            if((!oddNumberController) && (tdArray[i][m] % 2 == 0)){ //if the number i generated is even and the number in the column is even
                                nOddEven++;                   
                            }
                        }
                        
                        if(nOddEven <= 3){ //if the even and odd values of the nOddEven variable are less than 3, keep generating numbers.
                                controllerEvenOdd = false;
                        }         
                    }//exit while(controllerEvenOdd); generatedNumber is both unique and conforming to the odd even rule.
                    
                    
                    int groupNumber = (int)(Math.ceil(generatedNumber / 10.00)) - 1; //group Number grouped by index number, ceil rounds up.
                    if(position[groupNumber] < 2){ //
                        position[groupNumber]++;
                        tdArray[i][j] = generatedNumber;
                        generated = true;                   
                    }            
                    /*
                    When divided into 5 clusters, cluster elements can take up to 2 elements each.
                    0.index there are numbers between 1 and 10.
                    1.index there are numbers between 11 and 20.
                    2.index there are numbers between 21 and 30.
                    3.index there are numbers between 31 and 40.
                    4.index there are number between 41 and 49.
                    Group Number between 0 and 4
                    */
                } //The generatedNumber variable is generated according to the desired rules.
            } //exit from line-counting for loop
        } //exit from column-counting for loop
        
        
        
        //sorting algorithm
        for(int i = 0; i < nColumns; i++){
            for (int h = 5; h > 0; h--){
                for(int j = 1; j <= h; j++){
                    if(tdArray[i][j-1] > tdArray[i][j]){ //position must be changed, the larger one should be shifted to the right.
                        int temp = tdArray[i][j-1];
                        tdArray[i][j-1] = tdArray[i][j];
                        tdArray[i][j] = temp;
                    }
                }
            }
        }
        
        
        System.out.println("");
        
        
        //see results, print the array to the screen
        for(int i = 0; i < tdArray.length; i++){
            for(int j = 0; j < tdArray[i].length; j++){
                System.out.print(tdArray[i][j] + " ");
            }
            System.out.println("");
        }
        
           
    }  
} //Teşekkür(ler), Süleyman Demirel Üniversitesi