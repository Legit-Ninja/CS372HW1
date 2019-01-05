package com.company;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = 300;
        while (x < 1 || x > 100)
        {
            System.out.println("Enter a number between 1 and 99");
            x = input.nextInt();
        }
        for (int i = 0; i < x; i++)
        {
            if (i%2 != 0)
                System.out.println(i + " is an odd number");
            else
                System.out.println(i + " is an even number");
        }
    }
}
