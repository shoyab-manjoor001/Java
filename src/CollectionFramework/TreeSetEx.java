import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(Collections.reverseOrder());
        treeSet.add(12);
        treeSet.add(52);
        treeSet.add(74);
        treeSet.add(55);
        treeSet.add(120);
        treeSet.add(145);
        treeSet.add(19);
        treeSet.add(172);
        treeSet.add(172);

        Utility.print.accept(treeSet.size() + "");
        Utility.print.accept(treeSet + "");

        TreeSet treeSet2 = new TreeSet<>();

        treeSet2.add(new StringBuffer("A"));
        treeSet2.add(new StringBuffer("B"));
        treeSet2.add(new StringBuffer("b"));
        treeSet2.add(new StringBuffer("c"));
        treeSet2.add(new StringBuffer("D"));
        treeSet2.add(new StringBuffer("e"));
        treeSet2.add(new StringBuffer("F"));
        treeSet2.add(new StringBuffer("g"));

        Utility.print.accept(treeSet2.first());
        Utility.print.accept(treeSet2.last());
        Utility.print.accept(treeSet2.pollFirst());
        Utility.print.accept(treeSet2.pollLast());
        Utility.print.accept(treeSet2.toArray());

        // Utility.print.accept(treeSet2 + "");
        System.out.println(treeSet2);

    }
}
