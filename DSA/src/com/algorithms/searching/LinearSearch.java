package com.algorithms.searching;

import java.util.Scanner;

public class LinearSearch {

    public int linearSearch(int[] array, int key){
        int index = -1;
        for(int i=0; i<array.length; i++)
            if(array[i] == key) {
                index = i;
                break;
            }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        int key = sc.nextInt();
        int index = new LinearSearch().linearSearch(array, key);
        if(index < 0)
            System.out.println("Key is not found in array");
        else
            System.out.println("Key is found at index: "+index);
    }
}
