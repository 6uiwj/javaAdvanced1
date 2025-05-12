package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
    //main 스레드
    Thread mainThread = Thread.currentThread();
    log("mainThread = " + mainThread);
    log("mainThread.threadId()=" + mainThread.threadId()); //스레드 ID , 중복되지 않음
    log("mainThread.getName()=" + mainThread.getName()); //스레드 이름, 중복 가능
    log("mainThread.getPriority()=" + mainThread.getPriority()); //우선순위, 기본값=5, 숫자가 높을수록 우선순위가 높음
    log("mainThread.getThreadGroup()=" + mainThread.getThreadGroup());
    log("mainThread.getState()=" + mainThread.getState()); //실행될 수 있는 상태인지?

    //myThread 스레드 (새 스레드 생성)
    Thread myThread = new Thread(new HelloRunnable(), "myThread");
    log("myThread = " + myThread);
    log("myThread.threadId()=" + myThread.threadId()); //스레드 ID , 중복되지 않음
    log("myThread.getName()=" + myThread.getName()); //스레드 이름, 중복 가능
    log("myThread.getPriority()=" + myThread.getPriority()); //우선순위, 기본값=5, 숫자가 높을수록 우선순위가 높음
    log("myThread.getThreadGroup()=" + myThread.getThreadGroup());
    log("myThread.getState()=" + myThread.getState()); //실행될 수 있는 상태인지?
    }

}
