package com.soumik;

public class Main {

    public static void main(String[] args)
    {
        int[] a={11, 10, 13, 12, 5 ,5 ,15, 2, 3, 15, 6};
        int n=a.length;
        int z=findEquilibrium(a,n);
        System.out.println(z+" ");
    }
    public static int left_array(int j,int[] a)
    {
        int suml=0;
        for(int i=0;i<j;i++)
        {
            suml=suml+a[i];
        }
       // System.out.println("l:"+suml);
        return suml;
    }
    public static int right_array(int j,int[] a)
    {
        int sumr=0;
        for(int i=j+1;i<a.length;i++)
        {
            sumr=sumr+a[i];

        }
        //System.out.println("r:"+sumr);
        return sumr;
    }
    public static  int findEquilibrium(int[] arr, int n)
    {

        for(int i=1;i<n-1;i++)
        {

            int x=left_array(i,arr);
            int y=right_array(i,arr);

            if(x==y)
            {
               // System.out.println(i+" ");
                return i;
            }
        }
        return -1;
    }
}
