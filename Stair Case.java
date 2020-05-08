package com.soumik;

public class Main {

    public static void main(String[] args)
    {

        int n=6;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.printf("*");

            }
            System.out.printf("\n");
        }
    }
}
