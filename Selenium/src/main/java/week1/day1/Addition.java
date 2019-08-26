package week1.day1;

import java.util.Scanner;

public class Addition {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int b=0;
		for (int a =1;a<=10;a++) {
			b= a+b;
			
			}
		System.out.println(b);*/
		
		int sum=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which the addition has to be performed:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of numbers upto "+ n +" is "+ sum);
		sc.close();
	}

}
