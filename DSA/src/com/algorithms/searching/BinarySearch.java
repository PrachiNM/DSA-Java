package com.algorithms.searching;

import java.util.Scanner;

public class BinarySearch {
    public int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length;
        int index = -1;
        int mid;
        while (low<high){
            mid = (low+high)/2;
            if(key == array[mid]){
                index = mid;
                break;
            }
            else if(key<array[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            System.exit(0);
        int[] array = new int[n];
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        int key = sc.nextInt();
        int index = new BinarySearch().binarySearch(array, key);
        if(index<0)
            System.out.println("Key not present in array");
        else
            System.out.println("Key present at index: "+index);
    }
}
