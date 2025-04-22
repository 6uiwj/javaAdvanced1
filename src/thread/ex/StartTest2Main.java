package thread.ex;

import static util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(),"counter");
        thread.start();
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            //fori
            for(int i=0; i<5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                log("value: "+(i+1));

            }
        }
    }
}
