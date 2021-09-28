package com.algorithms.sorting;

import java.util.Arrays;

public class HeapSort {
    public void heapify(int[] arr, int root, int n){
        int large;
        large = largest(arr, root, n);
        if(large != root) {
            swap(arr, root, large);
            heapify(arr, large, n);
        }
    }

    int largest(int[] arr, int root, int n){
        int large = root;
        int left = 2*root+1;
        int right = 2*root+2;
        if(n>right && arr[root] >= arr[right])
            large = right;
        if(n>left && arr[left] >= arr[root])
            large = left;
        return large;
    }

    public void swap(int[] arr, int root, int large){
        int temp = arr[root];
        arr[root] = arr[large];
        arr[large] = temp;
    }

    public void heapSort(int[] arr, int n){
        int _n = n/2-1;
        int i;
        for(i=_n; i>=0; i--){
            heapify(arr, i, n);
        }
        heapify(arr, 0, n);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,3,2,5,7,6,8,9,0};
        new HeapSort().heapSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
