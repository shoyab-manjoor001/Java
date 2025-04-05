
import java.util.ArrayList;
import java.util.List;

public class SortedEx {

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
        System.out.println("List before Sorting: " + alist);

        System.out.println("List After Sorting: " + alist.stream().sorted().toList());

        // List<Integer> ar = alist.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 >
        // i2) ? -1 : 0)).toList();

        System.out.println("Sorting in Descending oreder: "
                + alist.stream().sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).toList());

        System.out.println("Sorting in Ascending Order: "
                + alist.stream().sorted((i1, i2) -> ((i1 < i2) ? -1 : (i1 < i2) ? 1 : 0)).toList());

    }
}
