package Cycle2.Chapter11.Item78;

import java.util.concurrent.TimeUnit;

// volatile 필드를 사용해 스레드가 정상 종료된다.
// volatile - 데이터를 메인 메모리에서만 읽어들인다.
public class StopThread3 {
    private static volatile boolean stopRequested;

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
