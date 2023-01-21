package com.ProjectExercises;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int numElements = input.nextInt();

        int sum = 0;

        int[] myArray = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter each element " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
            sum += myArray[i];
        }
        System.out.println("The sum of elements is " + sum);

    }
}
