import java.util.TreeSet;
import java.util.Comparator;

class CustomComparator implements Comparator {

    // using compareTo method in reverse order.
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }

    // Using compareTo Method.
    // @Override
    // public int compare(Object o1, Object o2) {
    // Integer i1 = (Integer) o1;
    // Integer i2 = (Integer) o2;

    // return -i1.compareTo(i2);
    // }

    // @Override
    // public int compare(Object o1, Object o2) {
    // Integer obj1 = (Integer) o1;
    // Integer obj2 = (Integer) o2;

    // if (obj1 < obj2)
    // return 1;
    // else if (obj1 > obj2)
    // return -1;
    // else
    // return 0;
    // }

}

public class TreeSetEx2 {

    public static void main(String[] args) {

        TreeSet t = new TreeSet<>(new CustomComparator());

        for (int i = 0; i < 10; i++) {
            t.add((int) (Math.random() * 10));
        }

        System.out.println(t);

    }

}
