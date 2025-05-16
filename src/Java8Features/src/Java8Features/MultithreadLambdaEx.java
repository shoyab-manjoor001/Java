package src.Java8Features;

public class MultithreadLambdaEx {

    public static void main(String[] args) {

        // MyRunnable r = new MyRunnable();

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Using Lambda... Child Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }
    }
}
