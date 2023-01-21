package com.ProjectExercises;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        Arrays.sort(nums);

        System.out.println("The second largest number is " + nums[nums.length - 2]);

    }
}
