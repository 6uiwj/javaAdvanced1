package thread.ex;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadA(), "Thread-A");
        thread1.start();

        Thread thread2 = new Thread(new ThreadB(), "Thread-B");
        thread2.start();

    }

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            //fori
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log("A");

            }
        }
    }

    static class ThreadB implements Runnable{
        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log("B");
            }
        }
    }
}
