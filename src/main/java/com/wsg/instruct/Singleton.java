package com.wsg.instruct;

/**
 * Created by shanguang.wang on 18/2/25.
 */
public class Singleton {

    private volatile static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }

}
