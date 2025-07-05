import java.util.HashSet;
import java.util.LinkedList;

public class HashSetEx {

    public static void main(String Args[]) {

        LinkedList ll = new LinkedList<>();

        for (int i = 0; i < 10; i++) {

            ll.add((int) (Math.random() * 10));
        }

        Utility.print.accept(ll + "");

        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("hashset");
        hashSet.add(true);
        hashSet.add(null);
        hashSet.addAll(ll);

        Utility.print.accept(hashSet + "");

    }
}
