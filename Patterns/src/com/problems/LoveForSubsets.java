package com.problems;
import java.util.Scanner;

class LoveForSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            int count = 0;

            while (n > 10) {
                if (n % 2 == 0)
                    count += n / 2;
                else
                    count += (n) / 2 + 1;
                n /= 4;
            }

            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                if (array[j] == 0) {
                    count++;
                    if (2 * j + 1 < n)
                        array[2 * j + 1] = -1;
                }
            }
            System.out.println(count);
        }
    }
}