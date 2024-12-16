package com.problems.problem_1;

public class AreaCalculator_2 {
    public static void main(String[] args) {
        int width = 5;
        int height = 10;
        int side = 4;

        // Используем универсальный метод
        System.out.println("Площадь прямоугольника: " + calculateArea(width, height));
        System.out.println("Площадь квадрата: " + calculateArea(side, side));
    }

    // Универсальный метод для расчета площади
    public static int calculateArea(int a, int b) {
        return a * b;
    }
}
