package week1.day1.hw;

import java.util.Scanner;

public class Callcalculator 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		Calculator cal=new Calculator();
		System.out.println("Sum is "+cal.add(a,b));
		System.out.println("Differnce is "+cal.sub(a,b));
		System.out.println("Product is "+cal.multiply(a,b));
		System.out.println("Division is "+cal.div(a,b));
	}
}
