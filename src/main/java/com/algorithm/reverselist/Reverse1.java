package com.algorithm.reverselist;

/**
 * @ClassName Reverse1  使用递归   链表反转
 * @Description
 * @Author GANSHU
 * @Date 2019/2/21 0021
 * @Version 1.0
 */
public class Reverse1 {

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.next= node1;
        node1.next = node2;
        node2.next = node3;

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        // 调用反转方法
        head = reverse3(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    public static Node reverse1(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.next == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = reverse1(head.next);// 先反转后续节点head.getNext()
        head.next.next = head;// 将当前结点的指针域指向前一结点
        head.next = null;// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }

    public static Node reverse2(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node rehead = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return rehead;
    }








    public static Node reverse3(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse3(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



















}

