package com.gaganbelgur;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private int counter = 0;

    private ThreadSafeSingleton() {
        // Private constructor is added to avoid the creation of this class from outside world
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void printCounterValue(String msg) {
        System.out.println(msg + "Counter value is " + counter);
    }
}
