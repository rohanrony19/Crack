package com.rony.rohan.Collections.problems.comparablevscomparator;

import java.util.*;

public class EmployeeSortingDemo {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(3, "C", 40000));
        list.add(new Employee(1, "A", 50000));
        list.add(new Employee(2, "B", 30000));
        list.add(new Employee(4, "B", 50000));

        System.out.println("Original List:");
        System.out.println(list);

        // 🔹 1️⃣ Sort by ID (Ascending)
        list.sort(Comparator.comparingInt(e -> e.id));
        System.out.println("\nSort by ID (ASC):");
        System.out.println(list);

        // 🔹 2️⃣ Sort by NAME (Ascending)
        list.sort(Comparator.comparing(e -> e.name));
        System.out.println("\nSort by Name (ASC):");
        System.out.println(list);

        // 🔹 3️⃣ Sort by SALARY (Ascending)
        list.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nSort by Salary (ASC):");
        System.out.println(list);

        // 🔹 4️⃣ Sort by SALARY (Descending)
        list.sort(Comparator.comparingDouble((Employee e) -> e.salary).reversed());
        System.out.println("\nSort by Salary (DESC):");
        System.out.println(list);

        // 🔹 5️⃣ Sort by SALARY → then NAME
        list.sort(
                Comparator.comparingDouble((Employee e) -> e.salary)
                          .thenComparing(e -> e.name)
        );
        System.out.println("\nSort by Salary → Name:");
        System.out.println(list);

        // 🔹 6️⃣ Sort by NAME → then SALARY (DESC)
        list.sort(
                Comparator.comparing((Employee e) -> e.name)
                          .thenComparing(
                              Comparator.comparingDouble((Employee e) -> e.salary).reversed()
                          )
        );
        System.out.println("\nSort by Name → Salary (DESC):");
        System.out.println(list);
    }
}
