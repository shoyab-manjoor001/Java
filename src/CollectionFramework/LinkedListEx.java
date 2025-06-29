import java.util.LinkedList;
import java.util.function.Consumer;

public class LinkedListEx {

    public static void main(String[] args) {

        Consumer<Object> print = str -> System.out.println(str);

        LinkedList ll = new LinkedList<>();
        ll.add("ABC");
        ll.add(30);
        ll.add('A');
        ll.add(true);
        print.accept(ll);

        ll.add(1, 21);
        ll.addFirst("First");
        print.accept(ll);
        print.accept(ll.contains(30));

        ll.clear();
        print.accept(ll);
    }

}
