package com.ProjectExercises;

public class Task5 {
    public static void main(String[] args) {

        int[][] nums = {{11, 14, 8, 3}, {21, 10, 4, 7}};

        int evenSum = 0;
        int oddSum = 0;

        for (int[] num : nums) {
            for (int row : num) {
                if (row % 2 == 0) {
                    evenSum += row;
                } else {
                    oddSum += row;
                }
            }
        }
        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);


    }
}
