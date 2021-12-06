package com.sparta.model;

import java.util.ArrayList;

public class BinaryTreeSort implements Sorter {

    private class Node {
        int key;
        Node left;
        Node right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTreeSort() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public ArrayList<Integer> treeSort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i);
        }

        return arrayList;
    }

    public int[] treeSort(int array[]) {
        for(int i = 0; i < array.length; i++) {
            insert(array[i]);
        }
        return array;
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
