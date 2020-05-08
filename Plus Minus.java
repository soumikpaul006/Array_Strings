package com.soumik;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {

        int[] arr={-4, 3, -9, 0, 4, 1 };

        float p=0;
        float m=0;
        float z=0;
        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]>0)
            {
                p=p+1;
            }
            if(arr[i]<0)
            {
                m=m+1;

            }
            if(arr[i]==0)
            {
                z=z+1;
            }
        }


        System.out.printf("%1.6f\n",p/arr.length);
        System.out.printf("%1.6f\n",m/arr.length);
        System.out.printf("%1.6f\n",z/arr.length);


    }
}
