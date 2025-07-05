import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

public class CursorEx {
    
    public static void main(String[] args) {
        
        Consumer<String> show = (str) -> System.out.println(str+" ");
        // System.out.println();
        Vector vector = new Vector<>();

        Enumeration e = vector.elements();
        Iterator iterator = vector.iterator();
        ListIterator listIterator = vector.listIterator();
        
        show.accept(e.getClass().getName());
        show.accept(iterator.getClass().getName());
        show.accept(listIterator.getClass().getName());


    }
}
