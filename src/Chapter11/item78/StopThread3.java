package Chapter11.item78;

import java.util.concurrent.TimeUnit;

// volatile 필드를 이용해 정상 종료
// volatile -> 데이터를 CPU 캐시메모리가 아닌 무조건 메인 메모리에서 읽어오는 기법
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
