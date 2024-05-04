package com.alucontrol.Question3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest
{
    @Test
    public void testRecursiveBinarySearch()
    { int[] collection = {72, 12, 23, 5, 2, 16, 8, 91, 38, 56}; Search search = new Search();

        Arrays.sort(collection);
        //[2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
        //[0, 1, 2, 3,  4,  5,  6,  7,  8,  9,] index

        assertEquals(5, search.recursiveBinarySearch(collection, 23));
        assertEquals(-1, search.recursiveBinarySearch(collection, 100));//does exist
        assertEquals(4, search.recursiveBinarySearch(collection, 16));
        assertEquals(8, search.recursiveBinarySearch(collection, 72));
        assertEquals(7, search.recursiveBinarySearch(collection, 56));
        assertEquals(1, search.recursiveBinarySearch(collection, 5));
        ; }
}