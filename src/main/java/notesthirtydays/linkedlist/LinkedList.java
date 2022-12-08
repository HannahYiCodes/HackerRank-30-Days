package notesthirtydays.linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        if(head == null) {
            head = n;
        }
        else{
            Node c = traverse(head);
            c.next = n;
        }
        return head;
    }
    private static Node traverse(Node node) {
        if(node.next == null) {
            return node;
        }
        return traverse(node.next);
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

//    public static  Node insert(Node head,int data) {
//        //Complete this method
//        if (head == null) {
//            return new Node(data);
//        }
//        if( head.next == null){
//            head.next = new Node(data);
//        } else {
//            Node tmp = head;
//            while (tmp.next != null) {
//                tmp = tmp.next;
//            }
//            tmp.next = new Node(data);
//        }
//
//        return head;
//    }