package com.sparta.view;

import com.sparta.model.BubbleSort;
import com.sparta.model.QuickSort;
import com.sparta.model.Sorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class View {
    private int listChoice = 0;
    private int sortChoice = 0;
    public Sorter sorter;
    public long startTime = 0;
    public long endTime = 0;

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 to generate a random Array or 2 to generate a random ArrayList: ");
        setListChoice(scanner.nextInt());
        System.out.println("Type 1 for BubbleSort and 2 for QuickSort: ");
        setSortChoice(scanner.nextInt());
    }

    public int getListChoice() {
        return listChoice;
    }

    public void setListChoice(int listChoice) {
        this.listChoice = listChoice;
    }

    public int getSortChoice() {
        return sortChoice;
    }

    public void setSortChoice(int sortChoice) {
        this.sortChoice = sortChoice;
    }
}
