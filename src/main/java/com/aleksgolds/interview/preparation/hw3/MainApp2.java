package com.aleksgolds.interview.preparation.hw3;

import java.sql.JDBCType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MainApp2 {
    /**
     * 2. Реализовать потокобезопасный счетчик с помощью интерфейса Lock.
     *
     * @param args
     */

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter.incrementAndGet() + " " + Thread.currentThread().getName());
            }
        });
        Thread t2 =  new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter.incrementAndGet() + " " + Thread.currentThread().getName());
            }
        });
        Thread t3 =  new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter.incrementAndGet() + " " + Thread.currentThread().getName());
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter.incrementAndGet() + " " + Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(counter.getCount());


//    AtomicInteger atomicInteger = new AtomicInteger(0);

//    ExecutorService executor = Executors.newFixedThreadPool(3);
//    for (int i = 0; i < 100; i++) {
//        executor.submit(new Runnable() {
//            public void run() {
//                counter.getCount().incrementAndGet();
//                System.out.println(counter.getCount());
//            }
//        });


//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                counter.getCount().incrementAndGet();
//            }
//            for (int i = 0; i < 5; i++) {
//                counter.getCount().decrementAndGet();
//            }
//            System.out.println(counter.getCount() + " " + Thread.currentThread().getName());
//        });
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                counter.getCount().incrementAndGet();
//            }
//            System.out.println(counter.getCount() + " " + Thread.currentThread().getName());
//        });
//        Thread t3 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                counter.getCount().decrementAndGet();
//            }
//            System.out.println(counter.getCount() + " " + Thread.currentThread().getName());
//        });
//        Thread t5 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                counter.getCount().decrementAndGet();
//            }
//            System.out.println(counter.getCount() + " " + Thread.currentThread().getName());
//        });
//        Thread t4 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                counter.getCount().decrementAndGet();
//            }
//            System.out.println(counter.getCount() + " " + Thread.currentThread().getName());
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t1.join();
//        System.out.println(counter.getCount());


    }


}

