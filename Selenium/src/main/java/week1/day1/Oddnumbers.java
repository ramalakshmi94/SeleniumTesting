package week1.day1;

import java.util.Scanner;

public class Oddnumbers {

	public static void main(String[] args) {
		/*System.out.println("Program to print odd numbers from 10 to 20");
		for (int i=10;i<=20;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i+" is an odd number");	
			}
			
		}*/
		System.out.println("Program to find the odd numbers within a range of numbers");
		Scanner scanner = new Scanner(System.in);
		int from,to;
		System.out.println("Enter the range of numbers to be checked:\nFrom:");
		from=scanner.nextInt();
		System.out.println("To:");
		to=scanner.nextInt();
		scanner.close();
		for(int i=from;i<=to;i++)
		{
		if(i%2!=0)
			System.out.println(i+" is an odd number");
		}
		}
}
