import java.util.TreeSet;

public class CompareDemo {

    public static void main(String[] args) {

        TreeSet<Student> t = new TreeSet<>();
        t.add(new Student(12, "abc"));
        t.add(new Student(45, "def"));
        t.add(new Student(75, "jkl"));
        t.add(new Student(9, "mno"));
        t.add(new Student(8, "pqr"));
        t.add(new Student(102, "stu"));
        t.add(new Student(1, "vwx"));

        System.out.println(t);
    }

}
