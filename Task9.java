package com.ProjectExercises;

public class Task9 {
    public static void main(String[] args) {

        int[] nums = {4, 7, 40, 1, 70, 45, 90};

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);


    }
}
