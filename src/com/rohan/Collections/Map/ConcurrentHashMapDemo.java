package com.rohan.Collections.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                map.put(i,"Thread1");
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 2000; i++) {
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Size of HashMap : " + map.size() );
    }
}

