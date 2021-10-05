package com.datastructures.stack;

import java.util.Arrays;
import java.util.Scanner;

class Node{
    char chr;
    Node previous;
    public Node(char chr){
        this.chr = chr;
    }
}

class Stack{
    Node top;
    public Stack(){
        top = null;
    }

    public void push(char chr){
        Node newNode = new Node(chr);
        newNode.previous = top;
        top = newNode;
    }

    public void pop(){
        top = top.previous;
    }
}

public class BalancedParenthesesUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack stack = new Stack();
        int i = 1, n = str.length();
        if(n==0) {
            System.out.println(true);
            System.exit(0);
        }
        if(stack.top == null)
            stack.push(str.charAt(0));
        System.out.println();
        while (i<n){
            char temp = str.charAt(i);
            if(stack.top == null) {
                stack.push(temp);
                i++;
                continue;
            }
            char stackTop = stack.top.chr;
            if(stackTop == '(' && temp == ')' || stackTop == '{' && temp == '}' || stackTop == '[' && temp == ']')
                stack.pop();
            else
                stack.push(temp);
            i++;
        }
        System.out.println(stack.top==null);
    }
}
