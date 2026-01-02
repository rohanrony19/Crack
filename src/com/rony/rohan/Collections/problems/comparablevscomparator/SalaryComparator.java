package com.rony.rohan.Collections.problems.comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary,e2.salary);
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "A", 50000));
        list.add(new Employee(2, "B", 30000));
        list.add(new Employee(3, "C", 40000));

        System.out.println("Before Sorting:");
        System.out.println(list);

        // 👉 Using SalaryComparator
        Collections.sort(list, new SalaryComparator()); // Comparator

        System.out.println("\nAfter Sorting by Salary:");
        System.out.println(list);
    }
}
