package com.patterns;

import java.util.Scanner;

public class FindElementPresentOddNoOfTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        int num = array[0];
        for (int i=1; i<n; i++)
            num ^=array[i];
        System.out.println(num);
    }
}
