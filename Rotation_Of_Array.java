package com.soumik;
import java.util.Scanner;
public class Main {
    public  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter number");
        int N =sc.nextInt();
        int[] arr=getInteger(N);
        int[] pa=printAarry(arr);

        System.out.println("enter number of rotation");
        int r=sc.nextInt();

        int[]  rotatearray=rotation_array(arr,r);
    }
    public static int[] getInteger(int N)
    {
        int[] a=new int[N];
        System.out.println("enter numbers");
        for(int i=0;i<N;i++)
            a[i]=sc.nextInt();

        return a;
    }
    public static int[] printAarry(int[] a)
    {
        System.out.println("your arrray");
        //System.out.println(a.length);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n");
        return a;
    }
    public static int[] rotation_array(int [] a,int ro)
    {
        int[] b=new int[a.length];
        //System.out.printf(a.length+"");
        int j=ro;
        for(int i=0;i<a.length-ro;i++)
        {
            b[i]=a[j];
            j=j+1;
        }

        int m=0;
        for(int k=b.length-ro;k<b.length;k++)
        {
            b[k]=a[m];
            m=m+1;
        }

        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");

        return b;
    }
}
