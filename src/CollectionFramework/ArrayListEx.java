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
        arr.add(arr2);
        System.out.println("Modified ArrayList: "+arr);
    }
}
