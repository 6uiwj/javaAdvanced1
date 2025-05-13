package util;

import static util.MyLogger.log;

//Runnable을 상속받아 만드는 스레드에서 sleep을 사용하려면 try-catch를 계속 써줘야하므로
//이러한 불편함을 해결하기 위해 sleep을 유틸리티를 만들어 주자.
public abstract class ThreadUtils { //생성할 수 없게 추상으로 만들자.
    public static void sleep(long mills) {
        try {
            Thread.sleep(mills); //넘어온 시간만큼 sleep
        } catch (InterruptedException e) {
            log("인터렙트 발생, " + e.getMessage());
            throw new RuntimeException(); //체크예외를 잡아서 런타임 예외로 바꿔서 던진다.
        }
    }
}
