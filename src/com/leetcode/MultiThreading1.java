package com.leetcode;

class Count extends Thread
{
    int count;
    String name;
    Count(String name)
    {
        this.name=name;
    }
    public void increment() throws InterruptedException {
        for(int i=0;i<10;i++)
        {
            System.out.println(this.name+count+++" ");
        }
    }

}
public class MultiThreading1
{
    public static void main(String[] args) throws InterruptedException {

        Count count1 = new Count("Child");
        Thread t1 = new Thread(()-> { try { count1.increment(); } catch (InterruptedException e) {} });
        t1.start();
//        t1.join();

        Count count2 = new Count("Main");
        Thread t2 = new Thread(()-> { try { count2.increment(); }catch (Exception e) {} });
        t2.start();


    }
}
