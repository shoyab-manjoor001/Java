import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<Object> arr = new ArrayList<>();
        arr.add("a");
        arr.add(12);
        arr.add(true);
        arr.add('d');
        arr.add(5.2f);

        System.out.println("ArrayList: " + arr);

        ArrayList<Object> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(0, "43");
        arr.addAll(arr2);

        System.out.println("Modified ArrayList: " + arr);

        ArrayList<Object> arr3 = new ArrayList<>();
        arr3.add(12);
        arr3.add("a");
        arr.removeAll(arr3);

        System.out.println(arr);

        System.out.println(arr.isEmpty());

        System.out.println(arr.get(2));

        System.out.println(arr.indexOf(5.2f));

        System.out.println(arr.size());

        System.out.println(arr.removeIf(i -> i instanceof Integer));
        System.out.println(arr);

        System.out.println(arr.contains("a"));

        arr.clear();
        System.out.println(arr);

        ArrayList<Object> l1 = new ArrayList();
        LinkedList<Object> l2 = new LinkedList();

        System.out.println("\nAbout ArrayList:");
        System.out.println("ArrayList is Serializable : " + (l1 instanceof Serializable));
        System.out.println("Arraylist is Clonable: " + (l1 instanceof Cloneable));
        System.out.println("ArrayList is instance of RandomAcees : " + (l1 instanceof RandomAccess));

        System.out.println("\nAbout LinkedList:");
        System.out.println("LinkedList is Serializable : " + (l2 instanceof Serializable));
        System.out.println("LinkedList is Clonable: " + (l2 instanceof Cloneable));
        System.out.println("LinkedList is instance of RandomAcees : " + (l2 instanceof RandomAccess));

    }
}
