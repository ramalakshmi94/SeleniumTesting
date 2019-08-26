package week1.day1;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scanner.nextInt();
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
			else 
			System.out.println(num+" is not a prime number");
		scanner.close();
	}

}
