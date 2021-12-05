package com.sparta.model;

import java.util.ArrayList;

public class BubbleSort implements Sorter {
    public int[] bubbleSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temporaryVariable = array[i];
                    array[i] = array[j];
                    array[j] = temporaryVariable;
                }
            }
        }
        return array;
    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arrayList) {
        int size = arrayList.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        } return arrayList;
    }


    @Override
    public int[] sort(int[] array) {
        return bubbleSort(array);
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        return bubbleSort(arrayList);
    }
}
