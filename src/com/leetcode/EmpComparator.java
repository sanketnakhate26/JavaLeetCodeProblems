package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee
{
    private String name;
    private int salary;
    Employee() {};
    Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
}
public class EmpComparator {
    public static void main(String[] args)
    {
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee("Sanket",1000000));
        e.add(new Employee("Rahul",50000));

//        Comparator<Employee> c = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary()-o2.getSalary();
//            }
//        };
        Comparator<Employee> c = (e1,e2)->e1.getSalary()-e2.getSalary();

        Collections.sort(e,c);
//        for(Employee obj : e)
//            System.out.println(obj.getSalary());

        Iterator<Employee> it = e.iterator();
        while(it.hasNext())
            System.out.println(it.next().getSalary());


    }
}
