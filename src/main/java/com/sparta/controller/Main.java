package com.sparta.controller;
import com.sparta.model.BinaryTreeSort;
import com.sparta.model.BubbleSort;
import com.sparta.model.QuickSort;
import com.sparta.model.Sorter;
import com.sparta.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Sorter sorter;
    private static View view;
    private static long startTime = 0;
    private static long endTime = 0;
    private static final int CHOICE_ONE = 1;
    private static final int CHOICE_TWO = 2;
    private static final int CHOICE_THREE = 3;
    private static int listChoice;
    private static int sortChoice;

    public static void main(String[] args) {
        int[] array = randomArray();
        ArrayList<Integer> arrayList = randomArrayList();
        createView();

        if (listChoice == CHOICE_ONE) {
            arrayOutput(array, sortChoice);
        } else if (listChoice == CHOICE_TWO) {
            arrayListOutput(arrayList, sortChoice);
        }
    }

    private static void arrayOutput(int[] array, int sortChoice) {
        System.out.println("Unsorted array: " + Arrays.toString(array));

        if (sortChoice == CHOICE_ONE) {
            System.out.println("Bubble Sort Chosen");
            sorter = new BubbleSort();
        } else if (sortChoice == CHOICE_TWO) {
            System.out.println("Quick Sort chosen...");
            sorter = new QuickSort();
        } else if (sortChoice == CHOICE_THREE) {
            System.out.println("Binary Tree Sort chosen...");
            sorter = new BinaryTreeSort();
        }

        startTime = System.nanoTime();
        sorter.sort(array);
        endTime = System.nanoTime();

        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Time taken: " +  (endTime - startTime) + " nano-seconds.");
    }

    private static void arrayListOutput(ArrayList<Integer> arrayList, int sortChoice) {
        System.out.println("Unsorted ArrayList: " + arrayList);

        if (sortChoice == CHOICE_ONE) {
            System.out.println("Bubble Sort Chosen");
            sorter = new BubbleSort();
        } else if (sortChoice == CHOICE_TWO) {
            System.out.println("Quick Sort chosen...");
            sorter = new QuickSort();
        } else if (sortChoice == CHOICE_THREE) {
            System.out.println("Binary Tree Sort chosen...");
            sorter = new BinaryTreeSort();
        }

        startTime = System.nanoTime();
        sorter.sort(arrayList);
        endTime = System.nanoTime();

        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Time taken: " +  (endTime - startTime) + " nano-seconds.");

    }

    private static int[] randomArray(){
        Random rd = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000);
        }
        return array;
    }

    private static ArrayList<Integer> randomArrayList() {
        Random rd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            arrayList.add(i, rd.nextInt(1000));
        }
        return arrayList;
    }

    private static void createView() {
        view = new View();
        view.userInput();
        listChoice = view.getListChoice();
        sortChoice = view.getSortChoice();
    }

}
