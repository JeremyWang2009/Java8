package com.wsg.loader;

/**
 * Created by shanguang.wang on 18/4/2.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println("boot class path:"+System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
