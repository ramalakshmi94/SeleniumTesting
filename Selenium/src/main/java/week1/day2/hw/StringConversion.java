package week1.day2.hw;

import java.util.Scanner;

public class StringConversion
{
	public static void main(String[] args) 
	{
		StringConversion sc=new StringConversion(); //create an object of the class 
		System.out.println(sc.convert());
	}
	public String convert()
	{
		String str,converted="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
			converted+=Character.toUpperCase(str.charAt(i));
			}
			else 
			{
				converted+=str.charAt(i);
			}
		}
		//using toCharArray method
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) //.length is property for array and not a method
		{
			if(i%2!=0)
			{
			converted+=Character.toUpperCase(ch[i]);
			}
			else 
			{
				converted+=str.charAt(i);
			}
		}
		sc.close(); // scanner object has to be closed within the main method.
		return converted;
	}
}
