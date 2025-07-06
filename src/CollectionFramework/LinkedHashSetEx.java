import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetEx {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            ll.add((int) (Math.random() * 10));
        }

        // Utility.print.accept(ll + "");

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("hashset");
        linkedHashSet.add(true);
        linkedHashSet.add(null);
        linkedHashSet.addAll(ll);

        Utility.print.accept(linkedHashSet.contains("A"));
        Utility.print.accept(linkedHashSet.getClass().getName());
        Utility.print.accept(linkedHashSet.toArray().length);
        Utility.print.accept(linkedHashSet.size());

        Utility.print.accept(linkedHashSet + "");
    }
}
