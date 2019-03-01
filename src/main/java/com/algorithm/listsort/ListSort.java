package com.algorithm.listsort;

import com.algorithm.Node;

/**
 * 一个链表，奇数位升序，偶数为降序，对该链表排序   时间复杂度o(n)
 * 例如：1 8 3 6 5 7 2 9
 * 分三步骤
 * 1.  按奇数和偶数，拆成两个链表
 * 2. 偶数的链表进行反转
 * 3. 两个有序链表进行合并
 */
public class ListSort {



















































    private static Node[] getTwoNodes(Node head) {
            Node head1 = null;  //  奇数链表
            Node head2 = null;  //  偶数链表
            Node cur1 = null;
            Node cur2 = null;

            int count = 1;
            while (head != null) {
                if(count % 2 == 1) {
                    if(head1 == null) {
                        cur1 = head;
                        head1 = cur1;
                    } else {
                        cur1.next = head;
                        cur1 = cur1.next;
                    }
                } else {
                    if(head2 == null) {
                        cur2 = head;
                        head2 = cur2;
                    } else {
                        cur2.next = head;
                        cur2 = cur2.next;
                    }
                }
                count ++;
                head = head.next;
            }
            cur1.next = null;
            cur2.next = null;
        return new Node[]{head1, head2};
    }


    private static Node reverse(Node head) {
        if(head == null) {
            return head;
        }
        Node next;
        Node pre = null;
        Node cur = null;
        while (head != null) {
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }
        return pre;
    }

    private static Node merge(Node head1, Node head2) {
        if(head1 == null && head2 == null) {
            return null;
        }
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }
        Node head;
        if(head1.val < head2.val) {
            head = head1;
            head.next = merge(head1.next, head2);
        } else {
            head = head2;
            head.next = merge(head1, head2.next);
        }
        return head;
    }


    /**
     * 1 8 3 6 5 4 7 2 9
     * @param args
     */
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(8);
        Node node3 = new Node(3);
        Node node4 = new Node(6);
        Node node5 = new Node(5);
        Node node6 = new Node(4);
        Node node7 = new Node(7);
        Node node8 = new Node(2);
        Node node9 = new Node(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        Node[] nodes = getTwoNodes(node1);

        nodes[1] = reverse(nodes[1]);

        Node head = merge(nodes[0], nodes[1]);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }









}

















