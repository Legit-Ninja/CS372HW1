package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your circle's radius");
	int radius = input.nextInt();
	final double PI = 3.14;
	    //PT -- radius * radius * PI; -2
    double area = radius * PI;
    System.out.println("The area of your circle is: " + area);}
}
