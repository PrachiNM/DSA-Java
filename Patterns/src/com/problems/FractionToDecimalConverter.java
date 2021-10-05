package com.problems;

import java.util.Scanner;

public class FractionToDecimalConverter {

    public int gcd(int a, int b){
        int temp;
        while(a != 0){
            temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }

    public void FToDConverter(double num){
        int intVal = (int)num;
        double fVal = num-intVal;
        int pVal = 1000000000;
        int g = gcd((int)(fVal*pVal), pVal);
        int numerator = (int)(fVal*pVal)/g;
        int denominator = pVal/g;
        System.out.println(intVal*denominator+numerator+"/"+denominator);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        new FractionToDecimalConverter().FToDConverter(n);
    }
}
