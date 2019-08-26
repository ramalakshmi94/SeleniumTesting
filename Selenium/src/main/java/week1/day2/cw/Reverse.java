package week1.day2.cw;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String str="Testleaf";
		System.out.println(str.length());
		//Program to reverse using charAt function
		System.out.println("Revesed string using charAt function");
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		//Program to reverse using toCharArray function
		System.out.println("\nReversed string using charAt function");
		char[] charArray = str.toCharArray();

		for(int j=charArray.length-1;j>=0;j--)
		{
			System.out.print(charArray[j]);
		}
		
	}
}
