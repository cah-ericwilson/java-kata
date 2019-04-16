package com.fuse;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MergeTest {

    private Merge merge = new Merge();

    @Test
    public void insert() {
        List<Integer> sorted = Arrays.asList(1, 5, 9, 12, 22);
        int num = 11;

        List<Integer> inserted = merge.insert(num, sorted);

        assertEquals(Arrays.asList(1, 5, 9, 11, 12, 22), inserted);

    }

    @Test
    public void mergeLists() {
        List<Integer> sorted1 = Arrays.asList(1, 5, 9, 12, 22);
        List<Integer> sorted2 = Arrays.asList(2, 3, 10, 12, 13, 14);

        List<Integer> merged = merge.mergeLists(sorted1, sorted2);

        assertEquals(Arrays.asList(1, 2, 3, 5, 9, 10, 12, 12, 13, 14, 22), merged);

    }
}
