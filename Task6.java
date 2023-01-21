package com.ProjectExercises;

public class Task6 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swapping");
        System.out.println("Value of num1 is " + num1);
        System.out.println("Value of num2 is " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping");
        System.out.println("Value of num1 is " + num1);
        System.out.println("Value of num2 is " + num2);



    }
}
