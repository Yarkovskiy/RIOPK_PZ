package com.problems.problem_5;

import java.util.ArrayList;

public class TightCouplingExample {
    public static void main(String[] args) {
        // Прямое использование конкретной реализации ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Прямое использование ArrayList усложняет замену
        for (String name : names) {
            System.out.println(name);
        }
    }
}
