package src.Java8NewFeatures;

public class AnonymousInnerClassEx {

    public static void main(String[] args) {
        // Anonymous Inner Class Example..

        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Inner Thread");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

}
