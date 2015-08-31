package com.danielvaughan.example.sort;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortTest {

    protected Sort sort;
    protected int largeSortSize  = 10_000_000;

    @Test
    public void given_321_return_123() throws Exception {
        assertArrayEquals(new int[]{1, 2, 3}, sort.sort(new int[]{3, 2, 1}));
    }

    @Test
    public void given_35421_return_12345() throws Exception {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sort.sort(new int[]{3, 5, 4, 2, 1}));
    }

    @Test
    public void given_47556_return_12345() throws Exception {
        assertArrayEquals(new int[]{4, 5, 5, 6, 7}, sort.sort(new int[]{4, 7, 5, 5, 6}));
    }

    @Test
    public void given_large_sort() throws Exception {
        Random random = new Random();
        int num = largeSortSize;
        int[] ints = new int[num];
        for (int i=0; i< num; i++)
        {
            ints[i] = random.nextInt();
        }
        sort.sort(ints);
    }

}
