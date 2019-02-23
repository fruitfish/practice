package com.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTreePath
 * @Description
 * @Author GANSHU
 * @Date 2019/2/23 0023
 * @Version 1.0
 */
public class BinaryTreePath {


    public static List<String> binTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        StringBuffer sb = new StringBuffer();
        fun(root, sb, list);
        return list;
    }

    private static void fun(TreeNode root, StringBuffer sb, List<String> list) {
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(sb.toString());
            return;
        }
        if (root.left != null) {
            sb.append("->");
            fun(root.left, sb, list);
            sb.delete(sb.lastIndexOf(">") - 1, sb.length());
        }
        if (root.right != null) {
            sb.append("->");
            fun(root.right, sb, list);
            sb.delete(sb.lastIndexOf(">") - 1, sb.length());
        }
    }

    private static class TreeNode {
        TreeNode(String val) {
            this.val = val;
        }
        private TreeNode left;
        private TreeNode right;
        private String val;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("1");
        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");
        TreeNode node5 = new TreeNode("5");
        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        System.out.println(JSON.toJSONString(binTreePaths(node1)));
    }

}
