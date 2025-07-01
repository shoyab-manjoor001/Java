import java.util.Vector;
import java.util.function.Consumer;
import java.util.Stack;
import java.util.Enumeration;

public class EnumerationEx {

    public static void main(String[] args) {

        Consumer<Object> printf = (str) -> System.out.print(str + " ");

        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            vector.add((int) (Math.random() * 100));
            stack.add((int) (Math.random() * 100));
        }

        // printf.accept(stack);
        // printf.accept(vector);

        printf.accept("\nElements of Vector: ");

        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            printf.accept(i);
        }

        printf.accept("\n\nElements of Stack: ");

        Enumeration e2 = stack.elements();
        while (e2.hasMoreElements()) {
            Integer i = (Integer) e2.nextElement();
            printf.accept(i);
        }
    }

}
