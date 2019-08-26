package week1.day1.hw;

import java.util.Scanner;

public class Primewithin100 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number upto which the prime numbers have to be identified");
		int maxrange=scanner.nextInt();
		for(int x=2;x<=maxrange;x++)
		{
			int num=x;
			int i=2;
			boolean prime=true;
			while((i<=num) &&(prime))
			{
				if((num%i!=0)||(num==i))
				{
					i++;
				}
				else prime=false;
			}	
			
			if(prime)
			System.out.println(num+" is a prime number");
			//else 
			//System.out.println(num+" is not a prime number");
		}
}
}

