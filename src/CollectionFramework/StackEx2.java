import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;

public class StackEx2 {

    public static void main(String[] args) {

        Consumer print = (str) -> System.out.println(str);

        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                stack.push(i);
                vector.add(i);
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        print.accept("Expected Size of Stack and Vector: " + 2000);

        print.accept("Size of Stack: " + stack.size());
        print.accept("Size of Vector: " + vector.size());

    }

}
