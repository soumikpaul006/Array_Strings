package com.soumik;
import java.util.Scanner;
public class Main {
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter number of strings to be entered");
        int N=sc.nextInt();
        String[] a=getInput(N);


        for(int i=1;i<a.length;i++)
        {
            boolean ans=check(a[i]);
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static String[] getInput(int N)
    {
        System.out.println("enter strings");
        String[] s=new String[N+1];
        for(int i=0;i<s.length;i++)
        {
            s[i] = sc.nextLine();
        }
        return s;
    }
    public static boolean check(String str)
    {

            int j = 0, k = str.length() - 1;
            while (j < k)
            {
                if (str.charAt(j) != str.charAt(k))
                    return false;
                j++;
                k--;
            }
            return true;

    }

}
