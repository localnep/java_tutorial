package training;
import java.util.LinkedList;
import java.util.ListIterator;


public class linkedList {
    
    public static void listeyi_bastir(LinkedList<String> list){
        for(String a: list){
            System.out.print(a + " ");
        }
    }
    
    public static void iterator_liste_bastir(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
    
    public static void sirali_ekle(LinkedList<String> list, String yeni){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){ //iterator bir yeri gösterdiği sürece
            int karsilastir = iterator.next().compareTo(yeni); //iteratörün gösterdiği değer ile gönderilen yeni değer kıyaslanıyor
            /*
            compateTo:
            karsilastir = 0 ise değerler eşit
            karsilastir = -1 ise yeni > iterator
            karlisastir > 0 ise iterator > yeni
            */
            if(karsilastir == 0){
                System.out.println("Listenizde bu eleman zaten var");
                return; //metodu sonlandır, hiçbir değer döndürmeyecek
            }
            else if(karsilastir > 0){
                iterator.previous(); //önceki değere git
                iterator.add(yeni); //yeni değeri ekle
                return;
            }
        }
        iterator.add(yeni); //eğer iterator bir yeri gostermiyorsa (list boş ise direkt ekle)  
    }
    
    public static void indeks_ile_ekle(LinkedList<String> list, String yeni,int indeks){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){  
            iterator.next();
            if(iterator.nextIndex() == indeks){
                iterator.previous(); //önceki değere git
                iterator.add(yeni);
                return;
            }
        }
        if(!iterator.hasNext()){ //sona eleman ekler
            iterator.add(yeni);
        }
    }
    
    /*
    public static void sil(LinkedList<String> list,String veri){
        list.remove(veri);
    }
*/
    
    
    
    public static void main(String[] args) {
        
        LinkedList<String> liste = new LinkedList<String>();
        liste.add("Kadikoy");
        liste.add("Ortakoy");
        liste.add("Besiktas");
        liste.add("Hisar");
        
        indeks_ile_ekle(liste, "Ozan", 99);
        listeyi_bastir(liste);
        
        
    }
    
    
    
}
