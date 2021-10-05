package com.patterns;

import java.util.Scanner;

public class BalancedParenthesesUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char[] array = new char[n];
        int i=-1, j=0;
        while(j<n){
            char temp = str.charAt(j);
            if(i==-1) {
                array[++i] = temp;
            }
            else{
                if(array[i] == '(' && temp == ')' || array[i] == '[' && temp == ']' || array[i] == '{' && temp == '}'){
                    i--;
                }
                else{
                    array[++i] = temp;
                }
            }
            j++;
        }
        System.out.println(i==-1);
    }
}
