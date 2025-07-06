import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BiFunction;

class MyDemoComparator implements Comparator {

    BiFunction<Integer, Integer, Integer> check = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;

    @Override
    public int compare(Object o1, Object o2) {

        Integer obj1 = (Integer) o1;
        Integer obj2 = (Integer) o2;

        return check.apply(obj1, obj2);

        // return obj1.compareTo(obj2);
        // return obj2.compareTo(obj1);
        // return -obj2.compareTo(obj1);

        // "Will add elements in reverse insertion order along with duplicates"
        // return -1;

        // "will add elements in insertion order along with duplicate"
        // return 1;

        // "Will Insert only one element."
        // return 0;
    }

}

public class ComparatorEx {

    public static void main(String[] args) {

        Utility.print.accept("A".compareTo("Z"));
        Utility.print.accept("a".compareTo("Z"));
        Utility.print.accept("a".compareTo("a"));

        ArrayList<Integer> alist = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>(new MyDemoComparator());

        for (int i = 0; i < 5; i++) {
            Integer val = (int) (Math.random() * 10);
            alist.add(val);
            treeSet.add(val);
        }

        System.out.println("List of Elements: " + alist);
        System.out.println("TreeSet: " + treeSet);

    }
}
