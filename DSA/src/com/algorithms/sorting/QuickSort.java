package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public int partition(int[] arr, int low, int high){
        int pi = high;
        int pivot = arr[high];
        int temp;
        high--;
//        int i = low-1;
//        int j = low;
        while(low <= high){
            if(arr[low]<=pivot){
                low++;
            }
            else{
                if(arr[high] <=pivot){
                    temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        arr[pi] = arr[low];
        arr[low] = pivot;
        return low;
    }

    public void quickSort(int[] arr, int low, int high){
        if(low<high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
        new QuickSort().quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
