package com.ProjectExercises;

public class Task4 {
    public static void main(String[] args) {

        int[][] nums = {{4, 7, 9, 11}, {12, 14, 19, 22}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    System.out.print(nums[i][j] + " ");
                }
            }

        }




    }
}
