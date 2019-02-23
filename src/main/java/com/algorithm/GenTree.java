package com.algorithm;

import java.util.HashMap;

/**
 * @ClassName GenTree
 * @Description
 * @Author GANSHU
 * @Date 2019/2/20 0020
 * @Version 1.0
 */
public class GenTree {

    public void buildTree(int[] preOrder, int[] inOrder) {

    }

    private TreeNode buildTree(int[] preOrder, int pstart, int pend, int[] inOrder, int istart, int iend, HashMap<Integer, Integer> map) {
        TreeNode node = new TreeNode(preOrder[pstart]);
        if(pstart >= pend || istart >= pend) {
            return null;
        }
        int index = map.get(preOrder[pstart]);
        node.left = buildTree(preOrder, pstart + 1, pstart + index - istart, inOrder, istart, index - 1, map);
        node.right = buildTree(preOrder, pstart + index - istart, pend, inOrder, index + 1, iend, map);
        return node;
    }

    /**
     * Definition for a binary tree node.
     *
     */
     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) {
             val = x;
         }
     }




}
