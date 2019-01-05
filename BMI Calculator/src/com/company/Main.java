package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter your height(inches), followed by your weight(pounds)");
	    int heightInches = input.nextInt();
	    int weightPounds = input.nextInt();

	    double heightMeter = heightInches / 39.37;
	    double weightKilo = weightPounds / 2.205;
	    double BMI = weightKilo / (heightMeter * heightMeter);
	    System.out.println("Your BMI is: " + BMI);
    }
}
