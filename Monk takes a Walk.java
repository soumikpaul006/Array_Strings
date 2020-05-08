package com.soumik;
import java.util.Scanner;
public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.printf("Enter number:");
        int N=sc.nextInt();

        int k=0;

        while(k<N)
        {
            search();
            ++k;
        }
	}
	public static void search()
    {
        String str;

        System.out.println("\nenter string");

        str=sc.nextLine();

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.printf("Vowels: "+count);
    }
}
