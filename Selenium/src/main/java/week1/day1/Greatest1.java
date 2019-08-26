package week1.day1;
import java.util.Scanner;

public class Greatest1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program to find the greatest of three numbers");
		int a,n,greatest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide the count of numbers you want to compare:");
		n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.println("Enter the number "+ i);
			a=sc.nextInt();
			if(i==1)
			{	
				greatest=a;
			}
			else if(a>greatest)
				{
					greatest=a;
				}
		}
		sc.close();
		System.out.println("Greatest among the entered number is"+greatest);
	}
}
