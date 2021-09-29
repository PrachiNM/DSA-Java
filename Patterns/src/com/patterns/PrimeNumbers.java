package com.patterns;

import java.util.Scanner;

class PrimeNumbers{

    private boolean isPrime(long n){
        if(n <= 1 || n%2 == 0)
            return false;
        int i = 3;
        while(i*i <= n){
            if(n % i == 0) {
                System.out.println(i);
                return false;
            }
            i+=2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.println(new PrimeNumbers().isPrime(n));
    }
}