package com.ProjectExercises;

public class Task3 {
    public static void main(String[] args) {

        int[][] nums = {{4, 2, 3, 7}, {10, 20, 30, 70}};

        int sum = 0;

        for (int[] num : nums) {
            for (int row : num) {
                sum += row;
            }
        }
        System.out.println("The sum is " + sum);




    }
}
