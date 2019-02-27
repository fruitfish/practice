package com.algorithm.mergelist;

/**
 * @ClassName MergeTwoList
 * @Description
 * @Author GANSHU
 * @Date 2019/2/27 0027
 * @Version 1.0
 */
public class MergeTwoList {

    public Node mergeTwoLists(Node n1, Node n2) {
        // 类似归并排序中的合并过程
        Node newHead = new Node(0);
        Node cur = newHead;
        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                cur.next = n1;
                cur = cur.next;
                n1 = n1.next;
            } else {
                cur.next = n2;
                cur = cur.next;
                n2 = n2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (n1 == null) {
            cur.next = n2;
        } else {
            cur.next = n1;
        }
        return newHead.next;
    }

    static class Node {
        int val;
        Node next;

        Node(int x) {
            val = x;
        }
    }

    private static Node merge(Node n1, Node n2) {
        Node newHead = new Node(0);
        Node cur = newHead;
        while (n1 != null && n2 != null) {
            if(n1.val < n2.val) {
                cur.next = n1;
                cur = cur.next;
                n1 = n1.next;
            } else {
                cur.next = n2;
                cur = cur.next;
                n2 = n2.next;
            }
        }
        if(n1 == null) {
            cur.next = n2;
        }
        if(n2 == null) {
            cur.next = n1;
        }
        return newHead.next;
    }


    public static void main(String[] args) {

        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(4);

        Node b1 = new Node(1);
        Node b2 = new Node(3);
        Node b3 = new Node(4);

        a1.next = a2;
        a2.next = a3;

        b1.next = b2;
        b2.next = b3;

        merge(a1, b1);

    }










}
