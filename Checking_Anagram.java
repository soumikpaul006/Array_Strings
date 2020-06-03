package com.soumik;

import java.util.HashMap;
import java.util.Map;

//Write a program to check whether given two strings are anagram or not.;
public class Main {

    public static void main(String[] args)
    {
        String s="cat";
        String s1="act";

        Map<Character,Integer> l=new HashMap<>();
        Map<Character,Integer> l2=new HashMap<>();

        int v;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            v=!l.containsKey(c)? 0: l.get(c);
            l.put(c,v+1);
        }
        int v1;
        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            v1=!l2.containsKey(c1)? 0: l2.get(c1);
            l2.put(c1,v1+1);
        }

        System.out.print(l);
        System.out.println("");
        System.out.print(l2);
        System.out.println("");

        if(l.equals(l2))
            System.out.print("ANAGRAM");
        else
            System.out.print("Not ANAGRAM");

    }
}
