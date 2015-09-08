package com.danielvaughan.example.sort;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int wall = 1;
        while (wall < array.length) {
            report(array, wall);
            for (int i = wall; i < array.length-1; i++) {
                System.out.println("i: " + i + ": " + array[i]);
                for (int j = wall; j >= 0; j--) {
                    System.out.println("j: " + j);
                    if (array[i] < array[j]) {
                        System.out.println("i: " + array[i] + " < j: "+ array[j]);
                        array[i + 1] = array[i];
                        report(array, wall);
                    } else {
                        System.out.println("i: " + array[i] + " >= j: "+ array[j]);
                        array[i] = array[j];
                        report(array, wall);
                    }
                }
            }
            wall++;
        }
        return array;
    }

    private void report(int[] array, int wall) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nwall: " + wall);
    }
}
