package com.example.app;

public class MyApp {

    // Method with variable arguments (varargs)
    public static int methodWithArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 0 arguments: " + methodWithArgs());
        System.out.println("Sum of 1 argument: " + methodWithArgs(1));
        System.out.println("Sum of 3 arguments: " + methodWithArgs(1, 2, 3));
        System.out.println("Sum of 5 arguments: " + methodWithArgs(1, 2, 3, 4, 5));
    }
}