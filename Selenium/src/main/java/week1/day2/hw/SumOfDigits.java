package week1.day2.hw;

import java.util.*;

public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=Integer.parseInt(sc.next()); //Integer.parseInt --> converts string value to int
		//int num=sc.nextInt();
		sc.close();
		while(num%10!=0)
		{
			sum+=num%10; //sum=sum+num%10
			num/=10; //num=num/10
		}
		System.out.println(sum);
	}
}
