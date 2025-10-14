package com.rohan.Collections.Map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
        imageCache.put(new String("img1"),new Image("Image 1"));
        imageCache.put(new String("img2"),new Image("Image 2"));
        System.out.println(imageCache);
        simulateApplicationRunning();
        System.gc();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }
    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}