package com.danielvaughan.example.sort;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest extends SortTest {

    @Before
    public void setUp() throws Exception {
        sort = new BubbleSort();
        largeSortSize = 10000;
    }

}
