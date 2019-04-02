package com.algorithm.intersection;

import com.algorithm.Node;

/**
 * @ClassName IntersectionOfTwoLinkedLists
 * @Description
 * @Author GANSHU
 * @Date 2019/4/2 0002
 * @Version 1.0
 */
public class IntersectionOfTwoLinkedLists {


    /**
     * 边界值判断：
     *
     * headA == null || headB == null    //有空链表，一定没有相交节点，返回null
     *
     * 变量注释：
     *
     * headALength    //headA链表的节点数，相当于长度
     *
     * headBLength    // headB链表的节点数
     *
     * p    //ListNode类型，临时变量，作为循环变量使用
     *
     * @param headA
     * @param headB
     * @return
     */
    public Node getIntersectionNode(Node headA, Node headB) {
        if (headA == null || headB == null)
            return null;

        int headALength = 0;
        int headBLength = 0;

        Node p = headA;
        while (headA != null){
            ++ headALength;
            headA = headA.next;
        }
        p = headB;
        while (headB != null){
            ++ headBLength;
            headB = headB.next;
        }

        while (headALength > headBLength) {
            headA = headA.next;
            headALength --;
        }

        while (headBLength > headALength) {
            headB = headB.next;
            headBLength --;
        }

        while (headA != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }



}
