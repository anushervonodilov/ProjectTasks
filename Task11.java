package com.ProjectExercises;

public class Task11 {
    public static void main(String[] args) {

        String[] arr = {"Pen", "Pencil", "Flower", "Pen", "Orange"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate element is " + arr[i]);
            }
        }
    }


}
}