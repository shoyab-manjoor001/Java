package src.Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionLambdaEx {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(85);
        list.add(84);
        list.add(42);
        list.add(75);
        list.add(56);
        list.add(102);
        list.add(567);
        list.add(412);

        // Collections.sort(list, new MyComparator());

        // Sorting Using With help of Comparator and Lambda Expression

        Comparator<Integer> c = (a, b) -> a < b ? -1 : a > b ? 1 : 0;

        Collections.sort(list, c);

        System.out.println(list);
    }
}
