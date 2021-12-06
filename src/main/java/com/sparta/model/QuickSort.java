package com.sparta.model;

import java.util.ArrayList;

public class QuickSort implements Sorter {
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    private int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
        return array;
    }

    private int partition(ArrayList<Integer> arrayList, int low, int high) {
        int pivot = arrayList.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arrayList.get(j) < pivot) {
                i++;
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(j));
                arrayList.set(j, temp);
            }
        }
        int temp = arrayList.get(i + 1);
        arrayList.set(i + 1, arrayList.get(high));
        arrayList.set(high, temp);
        return (i + 1);
    }

    private ArrayList<Integer> quickSort(ArrayList<Integer> arrayList, int low, int high) {
        if (low < high) {
            int pi = partition(arrayList, low, high);
            quickSort(arrayList, low, pi - 1);
            quickSort(arrayList, pi + 1, high);
        }
        return arrayList;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        } else if (arrayList.size() <= 1) {
            return arrayList;
        } else {
            return quickSort(arrayList, 0, arrayList.size() - 1);
        }
    }

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            return null;
        } else if (array.length <= 1) {
            return array;
        } else {
            return quickSort(array, 0, array.length - 1);
        }
    }



}
