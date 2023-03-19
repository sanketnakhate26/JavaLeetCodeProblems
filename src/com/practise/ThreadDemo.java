package com.practise;
import java.lang.Runnable;
//class MyRunnable implements Runnable
//{
//    @Override
//    public void run() {
//        for(int i=0; i<10; i++)
//            System.out.println("Running Child");
//    }
//}

public class ThreadDemo {
    public static void main(String[] args)
    {
//        MyRunnable runnable = new MyRunnable();
//        Thread t = new Thread(runnable);
//        t.start();
        Runnable runnable = ()->{ for(int i=0; i<10;i++) System.out.println("Running Child"); };
        Thread t = new Thread(runnable);
        t.start();

        for(int i=0; i<10;i++)
            System.out.println("Running Main");

    }
}
