package Cycle1.Chapter11.item78;

import java.util.concurrent.TimeUnit;

// 잘못된 코드
// 1초 후 메인 스레드가 stop 될것인가? NO
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
