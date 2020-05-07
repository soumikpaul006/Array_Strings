package com.soumik;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<List<Integer>> group = new ArrayList<List<Integer>>();
        group.add(Arrays.asList(11, 2, 4));
        group.add(Arrays.asList(4, 5, 6));
        group.add(Arrays.asList(10, 8, -12));

        int a=diagonalDifference(group);
        System.out.printf(a+" ");
    }
    public static int diagonalDifference(List<List<Integer>> arr)
    {
        int sum_l=0;
        int sum_r=0;
        int result;
        for(int i=0;i<arr.size();i++)
        {

            for(int j=0;j<arr.get(i).size();j++)
            {

                if(i==j)
                {

                    sum_l=sum_l+arr.get(i).get(j);
                }
                if((i+j)==(arr.size()-1))
                {

                    sum_r=sum_r+arr.get(i).get(j);
                }
            }
        }
        result=Math.abs(sum_l-sum_r);
        return result;
    }
}

