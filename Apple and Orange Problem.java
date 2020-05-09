import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) 
    {

         int[] A_res=new int[apples.length];
        int[] O_res=new int[oranges.length];
        int[] res=new int[2];
        int count_apple=0;
        int count_orange=0;

        for(int i=0;i<apples.length;i++)
        {
            A_res[i]=a+apples[i];
        }
        for(int i=0;i<oranges.length;i++)
        {
            O_res[i]=b+oranges[i];
        }
        for(int i=0;i<A_res.length;i++)
        {
            if(s<=A_res[i] && A_res[i]<=t)
            {
                count_apple=count_apple+1;

            }
        }
        res[0]=count_apple;
        for(int i=0;i<O_res.length;i++)
        {
            if(s<=O_res[i] && O_res[i]<=t)
            {
                count_orange=count_orange+1;

            }
        }
        res[1]=count_orange;

        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]+" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
