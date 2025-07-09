public class ThreadEx {

    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("MyThread");
            }
        }
    };

    public static void main(String[] args) {

        ThreadEx.MyThread mr = new ThreadEx.MyThread();

        // implementing runnable interface
        Thread th = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("MyRunnable");
            }
        });

        th.start();
        mr.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }

    }

}
