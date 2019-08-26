package week1.day1;

import java.util.Scanner;
//program to find prime number
//using user defined methods
public class Primenumber1 
{
	public static String checkNext;
	//scanner has to defined as static if you want to access it within static main method
	//or define scanner within the required method if you dont want to declare it static
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		do 
		{
			Primenumber1 pr =new Primenumber1();
			pr.checkPrime();
			System.out.println("Enter Y to check for another input or N to quit");
			//when we use same scanner object for nextLine() after nextInt() use the below line to move to next line. 
			//otherwise input will not be read. 
			//when next() method is used to read value, scanner.nextLine() is not needed
			//two different scanner objects will also resolve the issue.
			scanner.nextLine();
			if(scanner.hasNext())
				checkNext = scanner.nextLine();
			if(!checkNext.equals("Y")) 
			{
				System.out.println("Terminating the program");
				scanner.close();
			}
		}while(checkNext.equals("Y"));
	
			
//	method to check if a number is prime or not	
	}
	public void checkPrime()
	{
		System.out.print("Enter the number");
		int num=scanner.nextInt();
		{
			int i=2;
			boolean prime=true;
			while((i<num) &&(prime))
			{
				if(num%i!=0)
				{
					i++;
				}
				else prime=false;
			}	
			if(prime)
				System.out.println(num+" is a prime number");
				else 
				System.out.println(num+" is not a prime number");
		}
	}
	//cant define outside the method. will throw error. moving this line within main method
	//scanner.close();
}
