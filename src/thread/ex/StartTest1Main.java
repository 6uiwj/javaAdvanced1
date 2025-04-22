package thread.ex;

import static util.MyLogger.log;

public class StartTest1Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

    static class CounterThread extends Thread {
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
