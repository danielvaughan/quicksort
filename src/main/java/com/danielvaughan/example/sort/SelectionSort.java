package com.danielvaughan.example.sort;

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int wall = 0;
        while (wall < array.length) {
            int min = wall;
            for (int i = wall; i < array.length; i++) {
             if (array[i] < array[min]) {
                    min = i;
                }
            }
            if (min != wall) {
                int temp = array[wall];
                array[wall] = array[min];
                array[min] = temp;

            }
            wall++;
        }
        return array;
    }

    private void report(int[] array, int wall) {
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]);
        }
        System.out.println("\nwall: "+ wall);
    }
}
