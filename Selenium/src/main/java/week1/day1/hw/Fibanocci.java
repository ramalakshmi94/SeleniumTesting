package week1.day1.hw;

import java.util.Scanner;
//program to generate n number of values in fibanocci series
public class Fibanocci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values of fibanocci series do you want to generate?");
		int num=sc.nextInt();
		int a=0,b=1,i=1;
		int f=0;
		for(i=1;i<=num;i++)
		{
			if(i==1)
			{
				System.out.println(a);
			}
			else if(i==2)
			{
				System.out.println(b);	
			}
			else
			{
				f=a+b;
				a=b;
				b=f;
				System.out.println(f);
			}
		}
	}
}
