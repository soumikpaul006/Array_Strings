package com.soumik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {


        int[] a={5, 2, 3, 4, 1};

        int min=0;
        int max=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            min=min+a[i];
        }
        for(int i=1;i<a.length;i++)
        {
            max=max+a[i];
        }
        
        System.out.print(min+" "+max);
    }
}
