package com.soumik;
import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());


        while(testcases-- > 0){
            int sizeOfArray = Integer.parseInt(br.readLine());

            int arr[] = new int[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for(int index = 0;index < sizeOfArray; index++){
                arr[index] = Integer.parseInt(elements[index]);
            }

            Main obj = new Main();
            obj.largestAndSecondLargest(sizeOfArray, arr);
        }
    }

    static void largestAndSecondLargest(int sizeOfArray, int arr[])
    {

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max)
            {

                max2=arr[i];
            }
            if(max==max2 || max2==Integer.MIN_VALUE)
            {
                max2=-1;
            }


        }
        System.out.println(max + " " + max2);
    }
}
