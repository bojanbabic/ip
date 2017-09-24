package com.interview.prepare.math;

/**
 * Created by bojan on 2/18/17.
 */
public class SingletonUtil {
    private static SingletonUtil ourInstance = new SingletonUtil();

    public static SingletonUtil getInstance() {
        return ourInstance;
    }

    private SingletonUtil() {
    }
}
