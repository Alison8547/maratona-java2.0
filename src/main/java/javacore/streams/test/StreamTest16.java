package javacore.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumFor(num);
        sumStreamIterator(num);
        sumParallelStreamIterator(num);
        sumLongStreamIterator(num);
        sumParallelLongStreamIterator(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            result += i;

        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterator(long num) {
        System.out.println("sum StreamIterator");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1l, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    // 1 - 1-5
    // 2 - 6-0
    private static void sumParallelStreamIterator(long num) {
        System.out.println("sum StreamParallelIterator");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1l, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterator(long num) {
        System.out.println("sum StreamLongIterator");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterator(long num) {
        System.out.println("sum StreamParallelLongIterator");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
