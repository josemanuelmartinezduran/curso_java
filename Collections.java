import java.util.*;
import hola.*;


public class Collections {
    public static void main(){
        Ejemplo e = new Ejemplo();
        Demo d = new Demo();
        e.a = 3;
        List<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(10);
        for (Integer integer : l) {
            System.out.println(integer);
        }
        System.out.println(l.get(1));
        l.size();
        l.indexOf(3);
    }
    
}
