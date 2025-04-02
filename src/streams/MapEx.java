package src.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(45);
        alist.add(56);
        alist.add(35);
        alist.add(20);
        alist.add(10);
        alist.add(32);
        alist.add(68);
        alist.add(33);

        List<Integer> list = alist.stream().filter(i -> i<35).toList();
        System.out.println("Failed Students: "+list);
        System.out.println("No. of Failed Students: "+ (long) list.size());

         List<Integer> updatedList = list.stream().map(i -> i+5).toList();
         System.out.println("After Grace Marks of Students: "+updatedList);

    }
}
