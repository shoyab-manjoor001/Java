import java.util.Vector;
import java.util.function.Consumer;

public class VectorEx {

    public static void main(String[] args) {

        Consumer<Object> print = str -> System.out.println(str);

        Vector v = new Vector<>();
        v.add("Vector");
        v.add(12);
        v.add(12);
        v.add(0, "jkl");
        v.add(true);
        v.add(2.0);
        v.add('v');
        v.add("ends");

        print.accept(v);

        print.accept(v.clone());
        print.accept(v.get(2));
        print.accept(v.toString());
        print.accept(v.capacity());

    }
}
