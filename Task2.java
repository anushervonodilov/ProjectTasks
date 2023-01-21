package com.ProjectExercises;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of countries in the array");
        int numCountries = input.nextInt();

        int[] nums = new int[5];

        int sum = 0;

        nums[0] = 14;
        nums[1] = 40;
        nums[2] = 17;
        nums[3] = 32;
        nums[4] = 70;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);


    }
}
