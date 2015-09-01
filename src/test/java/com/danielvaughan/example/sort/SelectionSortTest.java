package com.danielvaughan.example.sort;

import org.junit.Before;

public class SelectionSortTest extends SortTest {

    @Before
    public void setUp() throws Exception {
        sort = new SelectionSort();
        largeSortSize = 10000;
    }
}
