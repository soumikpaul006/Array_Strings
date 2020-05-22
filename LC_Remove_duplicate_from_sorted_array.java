//easy//array
package com.soumik;
import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args)
    {
        int[] a={1,1,2};
        int x=removeDuplicates(a);
        System.out.printf(x+" ");
    }
    public static int removeDuplicates(int[] nums)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!arr.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
        }
        System.out.println(arr+"");
        return arr.size();
    }
}
