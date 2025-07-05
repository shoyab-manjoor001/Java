import java.util.List;
import java.util.ListIterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.LinkedList;

public class ListIteratorEx {

    public static void main(String[] args) {

        Consumer<Object> printing = (str) -> System.out.println(str+" ");
        BiPredicate<String,String> predicate = (s1,s2) -> s1.equals(s2);
         
        List<Object> linkedList = new LinkedList<>();
        linkedList.add("ABC");
        linkedList.add("DEF");
        linkedList.add("GHI");
        linkedList.add("JKL");
        linkedList.add("MNO");

        printing.accept(linkedList);

        ListIterator listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            String s1 = (String) listIterator.next();
            if(predicate.test(s1, "DEF"))
            {
                listIterator.remove();
            }
            else if(predicate.test(s1, "MNO"))
            {
                listIterator.add("UVW");
            }
            else if(predicate.test(s1, "DEF"))
            {
                listIterator.set("XYZ");
            }
        }
        printing.accept(linkedList);
    }
}
