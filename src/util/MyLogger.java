package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLogger { //직접 생성할 수 없게 추상클래스로

    //시간이기 때문에 포매팅이 필요
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
