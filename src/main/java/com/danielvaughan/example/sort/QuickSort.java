package com.danielvaughan.example.sort;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int wall = 0;
        while (wall < array.length - 1) {
            int pivot = array[array.length - 1];
            for (int currentElement = wall; currentElement < array.length - 1; currentElement++) {
                if (array[currentElement] < pivot) {
                    array = switchElement(array, currentElement, wall);
                    wall++;
                }
            }
            array = switchElement(array, (array.length - 1), wall);
        }
        return array;
    }

    private int[] switchElement(int[] array, int currentElement, int wall) {
        int wallElement = array[wall];
        array[wall] = array[currentElement];
        array[currentElement] = wallElement;
        return array;
    }

}
