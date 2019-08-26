package week1.day1.hw;

import java.util.Scanner;

public class PrintMonth 
{
	public static String checkNext="Y";
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		PrintMonth pm=new PrintMonth();
		while(checkNext.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter a month in number to print its name");
			if(scanner.hasNextInt())
			{
			int monthNum=scanner.nextInt();
			System.out.println(monthNum);
			pm.PrintMonthName(monthNum);
			}
			else 
			{
			checkNext = "N";
			System.out.println("Value entered is not a valid number");
			}
		}
		System.out.println("Terminating the program");
		scanner.close();
		
	}
	public void PrintMonthName(int month)
	{
		switch(month)
		{
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			System.out.println("February");
			break;
		case 3: 
			System.out.println("March");
			break;
		case 4: 
			System.out.println("April");
			break;
		case 5: 
			System.out.println("May");
			break;
		case 6: 
			System.out.println("June");
			break;
		case 7: 
			System.out.println("July");
			break;			
		case 8: 
			System.out.println("August");
			break;
		case 9: 
			System.out.println("September");
			break;
		case 10: 
			System.out.println("OCtober");
			break;
		case 11: 
			System.out.println("November");
			break;
		case 12: 
			System.out.println("December");
			break;
		default:
			System.out.println("The entered number is not a valid month");
		}
		System.out.println("Do you want to continue? Press N to exit or any other key to continue");
//		scanner.nextLine();
		checkNext = scanner.next();
	}
}

