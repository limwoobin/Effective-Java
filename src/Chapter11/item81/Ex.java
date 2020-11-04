package Chapter11.item81;

import Chapter11.item84.SlowCountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex {
    // 동시 실행 시간을 재는 간단한 프레임워크
    public static long time(Executor executor , int concurrency , Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);

        for (int i=0; i<concurrency; i++) {
            executor.execute(() -> {
                // 타이머에게 준비를 마쳤음을 알린다.
                ready.countDown();
                try {
                    // 모든 작업자 스레드가 준비될때까지 기다린다.
                    start.await();
                    action.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }

        ready.await(); // 모든 작업자가 준비될때까지 기다린다.
        long startNanos = System.nanoTime();
        start.countDown();      // 작업자들을 깨운다.
        done.await();       // 모든 작업자가 일을 마치기를 기다린다.
        return System.nanoTime() - startNanos;
    }

    public static long time2(Executor executor , int concurrency , Runnable action) {
        SlowCountDownLatch ready = new SlowCountDownLatch(concurrency);
        SlowCountDownLatch start = new SlowCountDownLatch(1);
        SlowCountDownLatch done = new SlowCountDownLatch(concurrency);

        for (int i=0; i<concurrency; i++) {
            executor.execute(() -> {
                // 타이머에게 준비를 마쳤음을 알린다.
                ready.countDown();
                try {
                    // 모든 작업자 스레드가 준비될때까지 기다린다.
                    start.await();
                    action.run();
                } finally {
                    done.countDown();
                }
            });
        }

        ready.await(); // 모든 작업자가 준비될때까지 기다린다.
        long startNanos = System.nanoTime();
        start.countDown();      // 작업자들을 깨운다.
        done.await();       // 모든 작업자가 일을 마치기를 기다린다.
        return System.nanoTime() - startNanos;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        System.out.println("time: " + time(executorService , 1000 , () -> System.out.print("")));
        System.out.println("time2: " + time2(executorService , 1000 , () -> System.out.print("")));
        System.exit(1);
    }
}
