package com.aleksgolds.interview.preparation.hw3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Counter {
    private volatile int count;
    private final Lock lock = new ReentrantLock();

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int incrementAndGet() {
        try {
            lock.lock();
            count++;
            return count;
        } finally {
            lock.unlock();
        }
    }

    public int decrementAndGet() {
        try {
            lock.lock();
            count--;
            return count;
        } finally {
            lock.unlock();
        }
    }
}
