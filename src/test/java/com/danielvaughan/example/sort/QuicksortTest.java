package com.danielvaughan.example.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuicksortTest {

    private Sort sort;

    @Before
    public void setUp() throws Exception {
        sort = new QuickSort();
    }

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
}
