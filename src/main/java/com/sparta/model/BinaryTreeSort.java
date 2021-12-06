package com.sparta.model;

import java.util.ArrayList;

public class BinaryTreeSort implements Sorter {

    private class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int item){
            key = item;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int counter;

    public BinaryTreeSort() {
        root = null;
    }

    private void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key >= root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    private void inOrderRec(Node root, int[] array) {
        if (root != null) {
            inOrderRec(root.left, array);
            array[counter] = root.key;
            counter++;
            inOrderRec(root.right, array);
        }
    }

    private void inOrderRec(Node root, ArrayList<Integer> arrayList) {
        if (root != null) {
            inOrderRec(root.left, arrayList);
            arrayList.set(counter, root.key);
            counter++;
            inOrderRec(root.right, arrayList);
        }
    }

    private void treeInsert(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            insert(arrayList.get(i));
        }
    }

    private void treeInsert(int array[]) {
        for(int i = 0; i < array.length; i++) {
            insert(array[i]);
        }
    }

    private int[] treeSort(int[] array) {
        counter = 0;
        root = null;
        treeInsert(array);
        inOrderRec(root, array);
        return array;
    }

    private ArrayList<Integer> treeSort(ArrayList<Integer> arrayList) {
        counter = 0;
        root = null;
        treeInsert(arrayList);
        inOrderRec(root, arrayList);
        return arrayList;
    }

    @Override
    public int[] sort(int[] array) {
        return treeSort(array);
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        return treeSort(arrayList);
    }

}
