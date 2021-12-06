package com.sparta.model;

import java.util.ArrayList;

public class BinaryTreeSort implements Sorter {

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;
    int counter;


    BinaryTreeSort() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {

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

    public void inOrderRec(Node root, int[] array) {
        if (root != null) {
            inOrderRec(root.left, array);
            array[counter] = root.key;
            counter++;
            inOrderRec(root.right, array);
        }
    }

    public void treeInsert(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i);
        }
    }

    public void treeInsert(int array[]) {
        for(int i = 0; i < array.length; i++) {
            insert(array[i]);
        }
    }

    public int[] treeSort(int[] array) {
        treeInsert(array);
        inOrderRec(root, array);
        return array;
    }

    @Override
    public int[] sort(int[] array) {
        return null;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        return null;
    }

}
