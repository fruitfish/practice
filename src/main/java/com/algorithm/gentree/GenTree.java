package com.algorithm.gentree;

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

    /**
     *
     * @param preOrder  先序遍历数组
     * @param pstart  先序遍历数组第一个元素的位置
     * @param pend  先序遍历数组最后一个元素的位置
     * @param inOrder  中序遍历数组
     * @param istart  中序遍历数组第一个元素的位置
     * @param iend  中序遍历数组最后一个元素的位置
     * @param map  map中存的是 中序遍历数组中， 值 和 index 的关系
     * @return
     */
    private TreeNode buildTree(int[] preOrder, int pstart, int pend, int[] inOrder, int istart, int iend, HashMap<Integer, Integer> map) {
        TreeNode node = new TreeNode(preOrder[pstart]);
        if(pstart >= pend || istart >= iend) {
            return null;
        }
        int index = map.get(preOrder[pstart]);

        /**
         *  因为已经知道了index（根节点在中序遍历数组中的位置）,其实就知道了左子树的个数
         *  index - istart 就是左子树的个数， 所以左子树的终止点是  pstart + index - istart
         */
        node.left = buildTree(preOrder, pstart + 1, pstart + index - istart, inOrder, istart, index - 1, map);
        node.right = buildTree(preOrder, pstart + index - istart + 1, pend, inOrder, index + 1, iend, map);
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
