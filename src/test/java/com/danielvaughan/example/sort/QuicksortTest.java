package com.danielvaughan.example.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class QuicksortTest extends SortTest {

    @Before
    public void setUp() throws Exception {
        sort = new QuickSort();
    }

}
