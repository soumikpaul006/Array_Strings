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

        int[] a=new int[m+n];

        for(int i=0;i<m;i++)
        {
            a[i]=nums1[i];
        }

        int k=0;

        for(int j=m;j<a.length;j++)
        {

            a[j]=nums2[k];
            k++;
        }

        Arrays.sort(a);

        for (int i : a) {

            System.out.print(i + " ");
        }

    }
}
