import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> wylosowaneZPowtorzeniami = new ArrayList<>();
        for(int i=0;i<20;i++){
            wylosowaneZPowtorzeniami.add((int)(Math.random()*50+1));
        }
        System.out.println(wylosowaneZPowtorzeniami);
        HashSet<Integer> wylosowaneBezPowtorzen = new HashSet<>();
        for (Integer  element:wylosowaneZPowtorzeniami){
            wylosowaneBezPowtorzen.add(element);
        }
        System.out.println(wylosowaneBezPowtorzen);

        for (Integer element: wylosowaneBezPowtorzen
             ) {
            boolean pierwsza = true;
            for(int i=2;i<element;i++){
                if(element%i == 0)
                    pierwsza = false;
            }
            if(pierwsza)
                System.out.print(element+", ");
        }

        List<Integer>  ciag =new ArrayList<>();
        ciag.add(1);
        for(int i =0 ;i <wylosowaneZPowtorzeniami.size()-1;i++){
            if(wylosowaneZPowtorzeniami.get(i)<=wylosowaneZPowtorzeniami.get(i+1)){
                ciag.add(ciag.get(ciag.size()-1)+1);
            }
            else{
                ciag.add(1);
            }
        }
        System.out.println(wylosowaneZPowtorzeniami);
        System.out.println(ciag);
    }
}