import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArrayListEx {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> unsafeList = new ArrayList<>();

        List<Integer> safeList = Collections.synchronizedList(new ArrayList<>());

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                unsafeList.add(i);
                safeList.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("UnsafeList size: " + unsafeList.size()); // Likely < 2000
        System.out.println("SafeList size: " + safeList.size()); // Always 2000
    }
}
