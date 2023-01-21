package com.ProjectExercises;

public class Task8 {
    public static void main(String[] args) {

        int n = 10;
        int t1 = 0;
        int t2 = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }





    }
}
