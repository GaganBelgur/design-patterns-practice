package com.gaganbelgur;

public class SingletonClient {
    public static void main(String[] args) {
        //checkDoubleCheckedLockingSingletonClassFromMultipleThreads();

//        BillPughSingleton singleton = BillPughSingleton.getInstance();
//        System.out.println("Instance id = " + singleton.hashCode());
//
//        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
//        System.out.println("Instance id = " + singleton1.hashCode());

        checkBillPughSingletonClassFromMultipleThreads();
    }

    private static void createEagerInitializationSingletonInstance() {
        EagerInitializationSingleton singleton = EagerInitializationSingleton.getInstance();
        singleton.printCounterValue("Before Setting :");

        singleton.setCounter(4);
        System.out.println(singleton.getCounter());
        singleton.printCounterValue("After Setting :");
    }

    private static void createLazyInitializationSingletonInstance() {
        LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
        lazyInitializationSingleton.printCounterValue("Before Setting :");

        lazyInitializationSingleton.setCounter(4);
        System.out.println(lazyInitializationSingleton.getCounter());
        lazyInitializationSingleton.printCounterValue("After Setting :");
    }

    private static void checkCreatingMultipleSingletonClass() {
        LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();
        System.out.println("Instance id 1 = " + lazyInitializationSingleton1.hashCode());

        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        System.out.println("Instance id 2 = " + lazyInitializationSingleton2.hashCode());
    }

    //Problem: Two threads could check instance == null at the same time, and both will create a new instance → breaking Singleton.
    private static void checkSingletonClassFromMultipleThreads() {
        Runnable task = () -> {
            LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
            System.out.println("Instance id = " + lazyInitializationSingleton.hashCode());
            System.out.println("Thread id = " + Thread.currentThread().getId());
            System.out.println("Thread name = " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task, "Thread1");
        thread1.start();

        Thread thread2 = new Thread(task, "Thread2");
        thread2.start();
    }

    //Since `synchronized` is added at method level the creation happens only once and ensure instance is created only once and the problem is creation and execution will be slower.
    private static void checkThreadSafeSingletonClassFromMultipleThreads() {
        Runnable task = () -> {
            ThreadSafeSingleton lazyInitializationSingleton = ThreadSafeSingleton.getInstance();
            System.out.println("Instance id = " + lazyInitializationSingleton.hashCode());
            System.out.println("Thread id = " + Thread.currentThread().getId());
            System.out.println("Thread name = " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task, "Thread1");
        thread1.start();

        Thread thread2 = new Thread(task, "Thread2");
        thread2.start();
    }

    private static void checkEagerSingletonClassFromMultipleThreads() {
        Runnable task = () -> {
            EagerInitializationSingleton lazyInitializationSingleton = EagerInitializationSingleton.getInstance();
            System.out.println("Instance id = " + lazyInitializationSingleton.hashCode());
            System.out.println("Thread id = " + Thread.currentThread().getId());
            System.out.println("Thread name = " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task, "Thread1");
        thread1.start();

        Thread thread2 = new Thread(task, "Thread2");
        thread2.start();
    }

    private static void checkDoubleCheckedLockingSingletonClassFromMultipleThreads() {
        Runnable task = () -> {
            DoubleCheckedLockingSingleton lazyInitializationSingleton = DoubleCheckedLockingSingleton.getInstance();
            System.out.println("Instance id = " + lazyInitializationSingleton.hashCode());
            System.out.println("Thread id = " + Thread.currentThread().getId());
            System.out.println("Thread name = " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task, "Thread1");
        thread1.start();

        Thread thread2 = new Thread(task, "Thread2");
        thread2.start();
    }

    private static void checkBillPughSingletonClassFromMultipleThreads() {
        Runnable task = () -> {
            BillPughSingleton singleton = BillPughSingleton.getInstance();
            System.out.println("Instance id = " + singleton.hashCode());
            System.out.println("Thread id = " + Thread.currentThread().getId());
            System.out.println("Thread name = " + Thread.currentThread().getName());
        };

        for(int i=0;i<5;i++) {
            Thread thread = new Thread(task, "Thread " + i);
            thread.start();
        }
    }
}
