package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public void merge(int[] left, int[] right, int[] array){
        int l = left.length;
        int r = right.length;
        int a = array.length;
        int i=0, j=0, k=0;
        while(i<l && j<r){
            if(left[i] <= right[j]){
                array[k] = left[i];
                k++;
                i++;
            }
            else{
                array[k] = right[j];
                k++;
                j++;
            }
        }
        if(i == l){
            while(k<a){
                array[k] = right[j];
                j++;
                k++;
            }
        }
        else if(j == r){
            while (k<a){
                array[k] = left[i];
                k++;
                i++;
            }
        }
    }

    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n<2)
            return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i=0; i<mid; i++) {
            left[i] = arr[i];
        }
        for(int i=0; i<n-mid; i++) {
            right[i] = arr[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter size of array
        int n = sc.nextInt();
        int[] array = new int[n];
        // Enter elements of array
        for(int i=0;  i<n; i++)
            array[i] = sc.nextInt();
        new MergeSort().mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
