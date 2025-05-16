package src.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {

        /**
         * @param args
         */
        public static void main(String[] args) {

                // Arraylist of Integer Objects.
                ArrayList<Integer> alist = new ArrayList<Integer>();
                alist.add(45);
                alist.add(56);
                alist.add(35);
                alist.add(20);
                alist.add(10);
                alist.add(32);
                alist.add(68);
                alist.add(33);
                System.out.println("\nList before Sorting: " + alist);

                // Sorting using Natural sorting (Uses Comparable Internally)
                System.out.println("\nList After Sorting: " + alist.stream().sorted().toList());

                // Sorting using Comparator Inetrface.. DESCENDING ORDER.
                System.out.println("\nSorting in Descending oreder: m1 "
                                + alist.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).toList());

                // OR
                // Sorting using Comparator Inetrface.. DESCENDING ORDER.
                System.out.println("\nSorting in Descending oreder: m2 "
                                + alist.stream().sorted((i1, i2) -> -i1.compareTo(i2)).toList());

                // OR
                // Sorting using Comparator Inetrface.. DESCENDING ORDER.
                System.out.println("\nSorting in Descending oreder: m3 "
                                + alist.stream().sorted((i1, i2) -> i2.compareTo(i1)).toList());

                // Sorting using Comparator Inetrface..ASCENDING OREDER.
                System.out.println("\nSorting in Ascending Order: "
                                + alist.stream().sorted((i1, i2) -> ((i1 < i2) ? -1 : (i1 < i2) ? 1 : 0)).toList());

                // String Examples...

                List<String> names = Arrays.asList("Rohit Sharma", "Virat Kohli", "Shikhar Dhawan",
                                "Sachin Tendulkar",
                                "ABD", "Shane Watson", "Sdc", "Ksd");

                System.out.println("\nOriginal List of Names : " + names);

                // Natural Sorting Order..ie Based on the Alphabet case sensitive.
                System.out.println("\nNatural Sorting Order : " + names.stream().sorted().toList());

                // Custom Sorting of String

                Comparator<String> comparator = (s1, s2) -> {
                        int l1 = s1.length();
                        int l2 = s2.length();
                        return (l1 < l2 ? -1 : l1 > l2 ? +1 : s1.compareTo(s2));
                };

                System.out.println("\nBased On Increasing Lenght: " + names.stream().sorted(comparator).toList());
        }
}
