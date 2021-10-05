package com.algorithms.searching;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2DArray {
    private int[] binarySearch(int[][] arr, int key){
        int outer_low = 0;
        int outer_high = arr.length-1;

        while(outer_low <= outer_high){
            int outer_mid = (outer_low+outer_high)/2;
            int[] temp = arr[outer_mid];
            int inner_low = 0;
            int inner_high = temp.length-1;
            if(key>=temp[inner_low] && key<=temp[inner_high]){
                while (inner_low<=inner_high){
                    int inner_mid = (inner_low+inner_high)/2;
                    if(key == temp[inner_mid]){
                        return new int[]{outer_mid, inner_mid};
                    }
                    else if(key<temp[inner_mid])
                        inner_high = inner_mid-1;
                    else
                        inner_low = inner_mid+1;
                }
            }
            else if (key<temp[inner_low]){
                outer_high = outer_mid-1;
            }
            else if (key>temp[inner_high]){
                outer_low = outer_mid+1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter elements of matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                array[i][j] = sc.nextInt();
        }

        for (int i=0; i<m; i++)
            System.out.println(Arrays.toString(array[i]));
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int[] index = new BinarySearch2DArray().binarySearch(array, key);
        if(index[0] == -1)
            System.out.println("Key is not present in the matrix");
        else
            System.out.println("Key is present at location: "+Arrays.toString(index));
    }
}
