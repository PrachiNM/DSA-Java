package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
    void selectionSort(int[] arr, int n)
    {
        //code here
        int i;
        int j;
        for(i=0; i<n; i++){
            j = i;
            int minInd = i;
            while(j < n){
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
                j++;
            }

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
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
        new SelectionSort().selectionSort(array, n);
        System.out.println(Arrays.toString(array));
    }
}
