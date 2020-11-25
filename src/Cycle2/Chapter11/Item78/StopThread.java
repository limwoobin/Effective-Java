package Cycle2.Chapter11.Item78;

import java.util.concurrent.TimeUnit;

// 잘못된 코드 - 1초 후에 종료되지 않는다. (stopRequested 에 대한 동기화 문제)
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
           int i = 0;
           while (!stopRequested) {
               i++;
           }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
