package com.datastructures.linkedlists;

class LinkedList{
    Node head;
    public LinkedList(){
        head = null;
    }

    public Node insert(int data){
        if(head == null){
            return new Node(data);
        }
        Node newNode = new Node(data);
        Node node = head;
        while(node.next != null)
            node = node.next;
        node.next = newNode;
        return head;
    }

    public void display(){
        Node node = head;
        if( node == null)
            return;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}

public class SwapNodesWOSwappingData {
    private void swapNodesWOSwappingData(LinkedList linkedList, int data1, int data2){
        if(linkedList.head == null)
            return;
        boolean flag1=false, flag2=false;


        LinkedList.Node node1 = null;
        LinkedList.Node node2 = null;
        LinkedList.Node node3 = null;
        LinkedList.Node node4 = null;

        LinkedList.Node node = linkedList.head;
        LinkedList.Node prev = linkedList.head;

        while (node != null){
            if (node.data == data1){
                flag1 = true;
                node1 = prev;
                node2 = node;
            }
            else if (node.data == data2){
                flag2 = true;
                node3 = prev;
                node4 = node;
            }
            prev = node;
            node = node.next;
            if(flag1 && flag2)
                break;
        }
        if(!(flag1 && flag2))
            return;
        if(node1 == linkedList.head)
            linkedList.head = node4;
        node = node2.next;
        node1.next = node4;
        node3.next = node2;
        node2.next = node4.next;
        node4.next = node;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i=1; i<11; i++)
            linkedList.head = linkedList.insert(i);
        linkedList.display();
        System.out.println();
        new SwapNodesWOSwappingData().swapNodesWOSwappingData(linkedList,1, 5);
        linkedList.display();
    }
}
