package com.soumik;
//easy//array
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        int[] a = {7,1,2,5};
        int target = 9;

        int arr[] = twoSum(a, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "");

        }
    }
    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);

        }
        for(int i=0;i<nums.length;i++)
        {

            int comp=target-nums[i];
            if(map.containsKey(comp) && map.get(comp)!=i)
            {
                return new int[] {i,map.get(comp)};
            }
        }
        throw new IllegalArgumentException("NO solution");
    }
}
