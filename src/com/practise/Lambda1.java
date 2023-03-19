package com.practise;
@FunctionalInterface
interface Operation
{
    int add(int a, int b);
}
@FunctionalInterface
interface Sqrt
{
    int sqrt(int a);
}
public class Lambda1
{
    public static void main(String[] args)
    {
        Operation test = (a,b)-> a+b;
        Sqrt test1 = (a)->a*a;
        System.out.println("Addition is "+test.add(10,20));
        System.out.println("Square is "+test1.sqrt(10));


    }
}
