package com.danielvaughan.example.sort;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int wall = 0;
        int last = array.length - 1;
        while (wall < last) {
            for (int pos = wall; pos < last; pos++) {
                if (array[pos] < array[last]) {
                    array = switchElement(array, pos, wall);
                    wall++;
                }
            }
            array = switchElement(array, last, wall);
        }
        return array;
    }

    private int[] switchElement(int[] array, int pos, int wall) {
        int wallElement = array[wall];
        array[wall] = array[pos];
        array[pos] = wallElement;
        return array;
    }

}
