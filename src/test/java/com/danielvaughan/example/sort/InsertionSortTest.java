package com.danielvaughan.example.sort;

import org.junit.Before;
import org.junit.Ignore;

@Ignore
public class InsertionSortTest extends SortTest {

    @Before
    public void setUp() throws Exception {
        sort = new InsertionSort();
        largeSortSize = 1;
    }
}
