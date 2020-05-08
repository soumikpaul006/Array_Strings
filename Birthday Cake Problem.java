package com.soumik;

public class Main {

    public static void main(String[] args)
    {


        int[] a={3 ,2, 1, 3};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {

            if(a[i]>max)
            {
                max=a[i];
            }

        }
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==max)
            {
                count=count+1;
            }
        }
        System.out.printf(count+"");
    }
}
