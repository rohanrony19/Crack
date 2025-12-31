package com.rony.rohan.Collections.problems.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSalary {
    int id;
    String name;
    double salary;

    public EmployeeSalary(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return id + " " + name + " " + salary;
    }

    public static void main(String[] args) {
        List<EmployeeSalary> list = new ArrayList<>();
//        EmployeeSalary emp1 = new EmployeeSalary(1,"A",50000);
//        list.add(emp1);
//        EmployeeSalary emp2 = new EmployeeSalary(2, "B", 30000);
//        list.add(emp2);
//        EmployeeSalary emp3 = new EmployeeSalary(3, "C", 40000);
//        list.add(emp3);
        list.add(new EmployeeSalary(1,"A",50000));
        list.add(new EmployeeSalary(2, "B", 30000));
        list.add(new EmployeeSalary(3, "C", 40000));

        list.sort((e1,e2)->Double.compare(e1.salary,e2.salary));
        System.out.println(list);
    }
}
