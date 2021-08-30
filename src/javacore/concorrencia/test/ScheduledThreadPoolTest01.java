package javacore.concorrencia.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalDateTime.now().format(formatter) + " beeper");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        //      executor.schedule(r, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS); // esse executa no momento q a thread acorda
        // ScheduledFuture<?> scheduleAtFixedRate = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("cancelling this scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false); // pra ele só parar quando terminar tudo
            executor.shutdown(); // shutdown -> parar de executar
        }, 10, TimeUnit.SECONDS);  // dando o delay 10 sec para isso

    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().format(formatter));
        beeper();
    }
}
