package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public void insertionSort(int[] arr, int n){
        //code here
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                int j=i-1;
                int temp = arr[i];
                while(j>=0 && temp<arr[j]){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter size of array
        int n = sc.nextInt();
        int[] array = new int[n];
        // Enter elements of array
        for(int i=0;  i<n; i++)
            array[i] = sc.nextInt();
        new InsertionSort().insertionSort(array, n);
        System.out.println(Arrays.toString(array));
    }
}
