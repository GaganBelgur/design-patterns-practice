package com.gaganbelgur;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private int counter = 0;

    private LazyInitializationSingleton() {
        // Private constructor is added to avoid the creation of this class from outside world
    }

    public static LazyInitializationSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializationSingleton();
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
