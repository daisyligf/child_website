package com.xiaopihai.test;

/**
 * @author daisyli
 * @create 下午8:51
 **/
public class JStackDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockclass(true));//建立一个线程
        Thread t2 = new Thread(new DeadLockclass(false));//建立另一个线程
        t1.start();//启动一个线程
        t2.start();//启动另一个线程
    }

}

class DeadLockclass implements Runnable {
    public boolean flag;
    DeadLockclass(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        if (flag) {
            while(true) {
                synchronized (Suo.o1) {
                    System.out.println("o1 " + Thread.currentThread().getName());
                    synchronized (Suo.o2) {
                        System.out.println("o2 " + Thread.currentThread().getName());
                    }
                }
            }
        }

        else {
            while (true) {
                synchronized (Suo.o2) {
                    System.out.println("o2 " + Thread.currentThread().getName());
                    synchronized (Suo.o1) {
                        System.out.println("o1 " + Thread.currentThread().getName());
                    }
                }
            }
        }
    }
}
class Suo {
    static Object o1 = new Object();
    static Object o2 = new Object();
}
