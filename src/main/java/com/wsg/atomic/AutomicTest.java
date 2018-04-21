package com.wsg.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by shanguang.wang on 18/4/16.
 */
public class AutomicTest {

    private static AtomicInteger race = new AtomicInteger(0);

    private static final int THREADS_COUNT = 20;

    private static void increase(){
        race.incrementAndGet();
    }


    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for(int i=0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0;i<10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(race);
    }

}
