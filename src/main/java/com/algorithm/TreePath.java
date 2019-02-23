package com.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TreePath
 * @Description
 * @Author GANSHU
 * @Date 2019/2/23 0023
 * @Version 1.0
 */
public class TreePath {


    public static List<String> treePaths(TreePath.TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        StringBuffer sb = new StringBuffer();
        fun(root, sb, list);
        return list;
    }

    private static void fun(TreeNode root, StringBuffer sb, List<String> list) {
        sb.append(root.val);
        if (root.children == null) {
            list.add(sb.toString());
            return;
        }
        List<TreeNode> children = root.children;
        for(TreeNode node : children) {
            sb.append("->");
            fun(node, sb, list);
            sb.delete(sb.lastIndexOf(">") - 1, sb.length());
        }
    }

    private static class TreeNode {
        TreeNode(String val) {
            this.val = val;
        }
        private List<TreeNode> children;
        private String val;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("1");
        TreeNode node2 = new TreeNode("2");
        TreeNode node3 = new TreeNode("3");
        TreeNode node4 = new TreeNode("4");
        TreeNode node5 = new TreeNode("5");
        TreeNode node6 = new TreeNode("6");
        TreeNode node7 = new TreeNode("7");
        TreeNode node8 = new TreeNode("8");

        List<TreeNode> list1 = new ArrayList<>();
        list1.add(node2);
        list1.add(node3);
        list1.add(node4);
        node1.children = list1;

        List<TreeNode> list2 = new ArrayList<>();
        list2.add(node5);
        list2.add(node6);
        node2.children = list2;

        List<TreeNode> list6 = new ArrayList<>();
        list6.add(node7);
        node6.children = list6;

        List<TreeNode> list4 = new ArrayList<>();
        list4.add(node8);
        node4.children = list4;

        System.out.println(JSON.toJSONString(treePaths(node1)));
    }


}
