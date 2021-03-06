package com.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description
 * @Author GANSHU
 * @Date 2019/1/26 0026
 * @Version 1.0
 */
public class QuickSort {



    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 7, 9, 8, 3, 6, 1, 14, 21, 17, 19, 81, 31, 61};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        int[] arr1 = {1, 4, 2, 7, 9, 8, 3, 6};
//        sort1(arr1);
//        System.out.println(Arrays.toString(arr1));
    }


    /**
     *
     * @param a 需要排序的数组
     * @param l 数组中第一个元素的位置
     * @param r 数据的长度
     */
    private static void quickSort(int[] a, int l, int r){
        if(l>=r)
            return;

        int i = l; int j = r; int key = a[l];//选择第一个数为key

        while(i<j){

            while(i<j && a[j]>=key) //从右向左找第一个小于key的值
                j--;
            if(i<j){
                a[i] = a[j];
                i++;
            }

            while(i<j && a[i]<key)//从左向右找第一个大于key的值
                i++;

            if(i<j){
                a[j] = a[i];
                j--;
            }
        }
        //i == j
        a[i] = key;
        quickSort(a, l, i-1);//递归调用
        quickSort(a, i+1, r);//递归调用
    }

}
