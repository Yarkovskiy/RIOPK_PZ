package com.problems.problem_5;

import java.util.ArrayList;
import java.util.List;

public class LooseCouplingExample {
    public static void main(String[] args) {
        // Работа через интерфейс List вместо ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Теперь реализацию легко заменить
        for (String name : names) {
            System.out.println(name);
        }
    }
}
