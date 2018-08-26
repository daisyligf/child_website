package com.xiaopihai.test;

/**
 * @author daisyli
 * @create 下午8:31
 **/
public class JStackDemo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
    }

}

class Thread1 implements Runnable {
    @Override
    public void run() {
        while(true) {
            System.out.println(1);
        }
    }
}
