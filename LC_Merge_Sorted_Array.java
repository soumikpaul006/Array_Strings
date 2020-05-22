package com.soumik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int[] a={1,2,3,0,0,0};
        int m=3;
        int[] b={2,5,6};
        int n=3;
        merge(a,m,b,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int j=0;
        for(int i=m;i< nums1.length;i++)
        {
            int temp=nums1[i];
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        for(int i:nums1)
            System.out.print(i+"");

    }
}
