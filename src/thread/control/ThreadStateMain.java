package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException{ //sleep때매 예외 처리
        Thread thread = new Thread(new MyRunnable(), "myThread"); //스레드 "객체" 생성
        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start(); //스레드의 "실제 실행 흐름" 생성
        Thread.sleep(1000);//myThread가 sleep 상태인 것을 로그로 찍기 위해 main 스레드도 1초간 재운다.
        log("myThread.state3 = " + thread.getState()); //"main"에서 'myThread" 의 상태 관찰
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState());
        log("end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
            log("start");
            log("myThread.state2 = " + Thread.currentThread().getState());
            log("sleep() start");
            Thread.sleep(3000);
            log("sleep() end");
            log("myThread.state4 = " + Thread.currentThread().getState());
            log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
