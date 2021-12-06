package com.sparta.sorting.test;


import com.sparta.model.QuickSort;
import com.sparta.model.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    private Sorter sorter;

    @BeforeEach
    public void setUp() {
        sorter = new QuickSort();
    }

    @DisplayName("Array Sorting Test with Interface")
    @Test
    public void quickSortArrayTest() {
        int[] initialArray = {3, 5, 8, 10, 12, 7, 1, 2};
        int[] sortedArray = {1, 2, 3, 5, 7, 8, 10, 12};
        sorter.sort(initialArray);
        String expectedResult = Arrays.toString(sortedArray);
        String actualResult = Arrays.toString(initialArray);
        assertEquals(expectedResult, actualResult);
    }

    @DisplayName("ArrayList Sorting Test using Interface")
    @Test
    public void quickSortArrayListTest() {
        ArrayList<Integer> unsortedArrayList = new ArrayList<>();
        unsortedArrayList.add(3);
        unsortedArrayList.add(5);
        unsortedArrayList.add(8);
        unsortedArrayList.add(10);
        unsortedArrayList.add(12);
        unsortedArrayList.add(7);
        unsortedArrayList.add(1);
        unsortedArrayList.add(2);

        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        sortedArrayList.add(1);
        sortedArrayList.add(2);
        sortedArrayList.add(3);
        sortedArrayList.add(5);
        sortedArrayList.add(7);
        sortedArrayList.add(8);
        sortedArrayList.add(10);
        sortedArrayList.add(12);

        sorter.sort(unsortedArrayList);
        assertEquals(sortedArrayList, unsortedArrayList);
    }

    @DisplayName("Sorting with Negative Values")
    @Test
    public void quickSortNegativeValuesTest() {
        int[] initialArray = {-3, -5, 8, 10, 12, 7, 1, 2};
        int[] sortedArray = {-5, -3, 1, 2, 7, 8, 10, 12};
        sorter.sort(initialArray);
        String expectedResult = Arrays.toString(sortedArray);
        String actualResult = Arrays.toString(initialArray);
        assertEquals(expectedResult, actualResult);
    }

}
