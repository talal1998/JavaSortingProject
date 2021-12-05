package com.sparta.controller;
import com.sparta.model.BubbleSort;
import com.sparta.model.QuickSort;
import com.sparta.model.Sorter;
import com.sparta.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Sorter sorter;
    public static long startTime = 0;
    public static long endTime = 0;
    public static final int CHOICE_ONE = 1;
    public static final int CHOICE_TWO = 2;

    public static void main(String[] args) {
        int[] array = randomArray();
        ArrayList<Integer> arrayList = randomArrayList();
        View view = new View();

        view.userInput();
        int listChoice = view.getListChoice();
        int sortChoice = view.getSortChoice();

        if (listChoice == CHOICE_ONE) {
            arrayOutput(array, sortChoice);
        } else if (listChoice == CHOICE_TWO) {
            arrayListOutput(arrayList, sortChoice);
        }
    }

    public static void arrayOutput(int[] array, int sortChoice) {
        System.out.println("Unsorted array: " + Arrays.toString(array));

        if (sortChoice == CHOICE_ONE) {
            System.out.println("Bubble Sort Chosen");
            startTime = System.nanoTime();
            sorter = new BubbleSort();
            sorter.sort(array);
            endTime = System.nanoTime();
        } else if (sortChoice == CHOICE_TWO) {
            System.out.println("Quick Sort chosen...");
            startTime = System.nanoTime();
            sorter = new QuickSort();
            sorter.sort(array);
            endTime = System.nanoTime();
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Time taken: " +  (endTime - startTime) + " nano-seconds.");
    }

    public static void arrayListOutput(ArrayList<Integer> arrayList, int sortChoice) {
        System.out.println("Unsorted ArrayList: " + arrayList);

        if (sortChoice == CHOICE_ONE) {
            System.out.println("Bubble Sort Chosen");
            startTime = System.nanoTime();
            sorter = new BubbleSort();
            sorter.sort(arrayList);
            endTime = System.nanoTime();
        } else if (sortChoice == CHOICE_TWO) {
            System.out.println("Quick Sort chosen...");
            startTime = System.nanoTime();
            sorter = new QuickSort();
            sorter.sort(arrayList);
            endTime = System.nanoTime();
        }
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Time taken: " +  (endTime - startTime) + " nano-seconds.");

    }

    public static int[] randomArray(){
        Random rd = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000);
        }
        return array;
    }

    public static ArrayList<Integer> randomArrayList() {
        Random rd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            arrayList.add(i, rd.nextInt(1000));
        }
        return arrayList;
    }

}
