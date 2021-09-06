package javacore.concorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable..%n", Thread.currentThread().getName());
        }
        return String.format("%s finished this, the random number is %d", Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(randomNumberCallable);
        String s = future.get();

        System.out.printf("program finished %s", s);
        executor.shutdown();

    }
}
