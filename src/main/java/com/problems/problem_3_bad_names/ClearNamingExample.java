package com.problems.problem_3_bad_names;

public class ClearNamingExample {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int sum = calculateSum(firstNumber, secondNumber);
        System.out.println("Сумма чисел: " + sum);
    }

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
