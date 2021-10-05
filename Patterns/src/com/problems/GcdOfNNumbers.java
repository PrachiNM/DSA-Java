package com.problems;

public class GcdOfNNumbers {

    public int gcd(int a, int b){
        int temp;
        int g = 0;
        while(a != 0){
            temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }

    public int gcd(int N, int[] arr){
        // Your code goes here
        int i=0;
        int a = arr[0];
        int b = arr[1];
        while(i<N-1){
            if(a==0){
                i++;
                a = b;
                if(i+1<=N-1)
                    b = arr[i+1];
            }
            else{
                int temp = a;
                a = b%a;
                b = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
//        System.out.println(new GcdOfNNumbers().gcd(3, new int[]{8, 22, 15}));
//        System.out.println(new GcdOfNNumbers().gcd(34, 51));
        System.out.println((int)4.2);
    }
}