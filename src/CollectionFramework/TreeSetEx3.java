import java.util.TreeSet;

public class TreeSetEx3 {

    public static void main(String[] args) {

        TreeSet t = new TreeSet<>();
        // StringBuffer sb;
        t.add(new StringBuffer("abc"));
        t.add(new StringBuffer("ramesh"));
        t.add(new StringBuffer("xyz"));
        t.add(new StringBuffer("mno"));

        System.out.println(t);
    }
}
