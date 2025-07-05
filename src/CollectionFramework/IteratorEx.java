import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Set;

public class IteratorEx {
    
    public static void main(String[] args) {

        Consumer<Object> print = (str) -> System.out.print(str+" ");
        Predicate<Integer> predicate = (i) -> i % 2 == 0; 

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*10));
        }

        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        // while (itr.hasNext()) {
        //     print.accept(itr.next());
        // }

        while (itr.hasNext()) {
            Integer element = (Integer) itr.next();
            if(predicate.test(element))
            {
                set.add(element);
            }
            else
            {
                itr.remove();
            }
        }
        System.out.println("List after: "+list);
        print.accept(set);
    }
}
