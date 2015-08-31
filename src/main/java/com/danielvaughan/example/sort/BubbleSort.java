package com.danielvaughan.example.sort;

public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < (n-1); i++) {
            for(int pos=0; pos<(n-1); pos++)
            {
                if (array[pos]>array[pos+1])
                {
                    int temp = array[pos+1];
                    array[pos+1]=array[pos];
                    array[pos]=temp;
                }
            }
        }
        return array;
    }

}
