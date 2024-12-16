package com.problems.problem_4;

public class TemporaryVariablesExample {
    public static void main(String[] args) {
        int length = 5;
        int width = 10;

        int area = length * width; // временная переменная
        System.out.println("Площадь: " + area);

        int perimeter = 2 * (length + width); // временная переменная
        System.out.println("Периметр: " + perimeter);
    }
}

