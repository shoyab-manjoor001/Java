import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorEx {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
            if (number == 3) {
                // list.remove(number); // This will cause ConcurrentModificationException
                iterator.remove(); // Correct way to remove during iteration
            }
        }
        System.out.println("After Modification: " + list);
    }
}
