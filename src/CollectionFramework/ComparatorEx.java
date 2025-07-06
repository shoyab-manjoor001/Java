import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BiFunction;

class MyComparator implements Comparator {

    BiFunction<Integer, Integer, Integer> check = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;

    @Override
    public int compare(Object o1, Object o2) {

        Integer obj1 = (Integer) o1;
        Integer obj2 = (Integer) o2;

        return check.apply(obj1, obj2);
    }

}

public class ComparatorEx {

    public static void main(String[] args) {

        Utility.print.accept("A".compareTo("Z"));
        Utility.print.accept("a".compareTo("Z"));
        Utility.print.accept("a".compareTo("a"));

        TreeSet t = new TreeSet<>(new MyComparator());

        for (int i = 0; i < 10; i++) {
            t.add((int) (Math.random() * 10));
        }

        System.out.println(t);
    }
}
