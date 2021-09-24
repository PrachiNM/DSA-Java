package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public void bubbleSort(int[] arr, int n){
        if(n == 0 || n == 1)
            return;
        boolean flag;
        int temp;
        for(int j=0; j<n; j++){
            flag = false;
            for(int i=0; i<n-j-1; i++){
                if(arr[i]>arr[i+1]){
                     temp = arr[i];
                     arr[i] = arr[i+1];
                     arr[i+1] = temp;
                     flag = true;
                }
            }
            if(!flag)
                return;
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
        new BubbleSort().bubbleSort(array, n);
        System.out.println(Arrays.toString(array));
    }
}
