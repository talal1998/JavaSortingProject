package com.sparta.model;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        BinaryTreeSort bst = new BinaryTreeSort();
        int[] array = {3,2,1,4,10,14,7};
        bst.treeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
