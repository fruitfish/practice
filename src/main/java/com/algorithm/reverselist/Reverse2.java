package com.algorithm.reverselist;

/**
 * @ClassName Reverse2   使用遍历的方式   链表反转
 * @Description
 * @Author GANSHU
 * @Date 2019/2/21 0021
 * @Version 1.0
 */
public class Reverse2 {


    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        // 调用反转方法
        // head = reverse1(head);
        head = reverse5(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    /**
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
     */
    public static Node reverse2(Node head) {
        if (head == null)
            return head;
        Node pre = head;// 上一结点
        Node cur = head.next;// 当前结点
        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
        while (cur != null) { // 当前结点为null，说明位于尾结点
            tmp = cur.next;
            cur.next = pre;// 反转指针域的指向

            // 指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.next = null;
        return pre;
    }




    public static Node reverse3(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node pre = head;
        Node cur = head.next;
        Node tmp = null;
        while(cur != null) {
            tmp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmp;
        }
        head.next = null;
        return pre;
    }


    private static Node reverse4(Node head) {
        Node pre = null;
        Node next;
        if (head == null || head.next == null) {
            return head;
        }
        while (head != null) {
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }
        return pre;
    }



    public static Node reverse5(Node head) {
        if(head == null) {
            return head;
        }
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;

    }





}


