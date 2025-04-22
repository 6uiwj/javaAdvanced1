package thread.start;

import static util.MyLogger.log;
//익명클래스 이용하기 -> 인터페이스 바로 구현
public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }
    //정적 중첩 클래스 사용 (특정 클래스에서만 사용할 때)

}
