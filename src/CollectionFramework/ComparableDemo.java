import java.util.TreeSet;

public class ComparableDemo {

    // NotePoints:
    // Comparable Interface is present in java.lang package and Contains only one
    // method ie compareTo().
    // public int compareTo(Object obj1)

    public static void main(String[] args) {

        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("B"));
        System.out.println("A".compareTo("A"));
        // System.out.println("A".compareTo(null));

        /*
         * If we depending on default natural sorting order internally JVM will call
         * compareTo() method and
         * will insert objects into the treeset. hence the object should be comparable.
         */

        // Tree Set Example.

        TreeSet ts = new TreeSet<>();
        ts.add("A");
        ts.add("Z");
        ts.add("M");
        ts.add("B");
        System.out.println(ts);

        /*
         * If we are not satisfied with the default natural sorting order or if the
         * default natuaral sorting order is not available then we can define our own
         * customised sorting by using comparator
         * 
         * Comparable is meant for default natural sorting order whereas Comparator
         * meant for customised sorting order.
         */
    }
}
