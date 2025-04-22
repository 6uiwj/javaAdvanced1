package thread.ex;

import static util.MyLogger.log;

public class StartTest4Main_2 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA("A", 1000);
        ThreadA b = new ThreadA("B",500);

        Thread threadA = new Thread(a, "Thread-A");
        Thread threadB = new Thread(b, "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class ThreadA implements Runnable {
        private String content;
        private int sleepMs;

        public ThreadA(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            //fori
            while(true) {
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log(content);

            }
        }
    }

}
