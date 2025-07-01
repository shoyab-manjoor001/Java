import java.util.Vector;
import java.util.function.Consumer;

public class VectorEx2 {

    public static void main(String[] args) throws InterruptedException {

        Vector<Integer> v = new Vector<>();

        Consumer<Object> display = (str)-> System.out.println(str);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                v.add(i);
            }
        };

        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task);

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        display.accept("Expected Result: " + 2000);
        display.accept("Actual Vector Size: " + v.size());
    }
}
