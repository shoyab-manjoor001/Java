import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList<>();
        alist.add("A");
        alist.add(12);
        alist.add(null);
        alist.add(3.0);

        System.out.println(alist);

        alist.add(0, "alist");

        System.out.println(alist);

        Object[] a = alist.toArray();

        for (Object obj : a) {

            System.out.println(obj);
        }

        
    }

}
