package com.problems.problem_3_bad_names;

public class BadNamingExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a, b);
        System.out.println("Результат: " + c);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
