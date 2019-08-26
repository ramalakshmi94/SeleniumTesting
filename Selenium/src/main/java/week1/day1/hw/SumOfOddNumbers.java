package week1.day1.hw;

import java.util.Scanner;

//program to find the sum of n odd numbers
public class SumOfOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number upto which you want to calculate the sum of odd numbers");
		int number=scanner.nextInt();
		scanner.close();
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
			sum=sum+i;
		}
		System.out.println("Sum of odd numbers present upto "+number+" is "+sum);
		
	}
}
