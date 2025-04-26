package src.CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList<>();
        arr.add("a");
        arr.add(12);
        arr.add(true);
        arr.add('d');
        arr.add(5.2f);

        System.out.println("ArrayList: " + arr);

        ArrayList arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(0,"43");
        arr.addAll(arr2);

        System.out.println("Modified ArrayList: "+arr);

        ArrayList arr3 = new ArrayList<>();
        arr3.add(12);
        arr3.add("a");
//        arr.removeAll(arr3);

        System.out.println(arr);

        System.out.println(arr.isEmpty());

        System.out.println(arr.get(2));

        System.out.println(arr.indexOf(5.2f));

        System.out.println(arr.size());

        System.out.println(arr.removeIf(i->i instanceof Integer));
        System.out.println(arr);

        System.out.println(arr.contains("a"));

        arr.clear();
        System.out.println(arr);
    }
}
