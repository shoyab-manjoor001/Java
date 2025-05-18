package src.Java8NewFeatures;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> alist = new ArrayList<>();
        alist.add(new Employee(13, "Aman"));
        alist.add(new Employee(23, "Sam"));
        alist.add(new Employee(31, "John"));
        alist.add(new Employee(65, "Tonny"));
        alist.add(new Employee(30, "Alfredo"));

        System.out.println("Before Sorting:");
        for (Employee employee : alist) {
            System.out.println(employee);
        }

        // Sorting of Employee on basis of empid (descending order)

        Collections.sort(alist, (e1, e2) -> e1.getEno() < e2.getEno() ? 1 : -1);

        System.out.println("\nAfter Sorting:");
        for (Employee employee : alist) {
            System.out.println(employee);
        }

        // Sorting of Employee on basis of Name (descending order)

        Collections.sort(alist, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println("\nAfter Sorting:");
        for (Employee employee : alist) {
            System.out.println(employee);
        }
    }
}
