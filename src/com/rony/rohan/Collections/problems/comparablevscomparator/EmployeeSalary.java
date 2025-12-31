package com.rony.rohan.Collections.problems.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSalary implements Comparable<EmployeeSalary> {
    int id;
    String name;
    double salary;

    public EmployeeSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeSalary e) {
        return Double.compare(this.salary, e.salary);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + salary;
    }

    public static void main(String[] args) {
        List<EmployeeSalary> list = new ArrayList<>();
        list.add(new EmployeeSalary(1,"A",50000));
        list.add(new EmployeeSalary(2, "B", 30000));
        list.add(new EmployeeSalary(3, "C", 40000));
        Collections.sort(list);
        System.out.println(list);
    }
}
