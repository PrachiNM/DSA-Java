package com.patterns;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int i;
        for (i=0; i<n; i++)
            array[i] = sc.nextInt();
        int lsf = 0;
        int max_profit = 0;
        int current = 1;
        int bsd = 1;
        int bdb = 0;

        while (current<n){
            if(array[current] - array[lsf] > max_profit) {
                max_profit = array[current] - array[lsf];
                bsd = current;
                bdb = lsf;
            }
            if (array[current] < array[lsf])
                lsf = current;
            current++;
        }

        System.out.printf("best day to buy: %d\nbest day to sell: %d\n",bdb, bsd);
        System.out.printf("Max Profit: %d", max_profit);
    }
}
