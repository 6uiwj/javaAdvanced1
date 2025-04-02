package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        //Thread.cuurentThread : 현재 실행되는 스레드 객치 반환
        //System.out.println(Thread.currentThread().getName());
        //main -> main Thread가 자바를 실행

        System.out.println(Thread.currentThread().getName() + ": main() start");


        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        //helloTread.start() 의 동작은 이제 Thread-0이 수행
        helloThread.start(); //run을 호출하면 안됨

        //main Thread는 Thread-0의 helloThread.start실행과 관계없이 남은 코드를 실행
        // -> 따라서 helloThread.start()가 어느시점에 실행될지 모름
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
