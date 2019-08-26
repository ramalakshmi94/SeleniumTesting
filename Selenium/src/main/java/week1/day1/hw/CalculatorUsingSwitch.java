package week1.day1.hw;

import java.util.Scanner;

public class CalculatorUsingSwitch 
{
	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose the operation you want to perform");
		System.out.println("1.Addition \t\t2. Subtraction \n3.Multiplication \t4.Division");
		int option =sc.nextInt();
		System.out.println("Please provide two integers for the selected arithmetic operation\nFirst number:");
		int a=sc.nextInt();
		System.out.println("Second number");
		int b=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.print("Sum of the given numbers is:");
			System.out.println(cal.add(a,b));
			break;
			
		case 2:
			System.out.print("Difference of the given numbers is:");
			System.out.println(cal.sub(a,b));
			break;
		
		case 3:
			System.out.print("Product of the given numbers is:");
			System.out.println(cal.multiply(a,b));
			break;
		
		case 4:
			System.out.print("Division of the given numbers is:");
			System.out.println(cal.div(a,b));
			break;
		
		default:
			System.out.println("option chosen is not valid");
			sc.close();
		}
		
	}
}
