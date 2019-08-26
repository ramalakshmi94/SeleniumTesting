package week1.day2.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElements 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to compare");
		int numOfElements=scanner.nextInt();
		int[] myArray= new int[numOfElements];
		System.out.println("Enter the "+numOfElements+" numbers");
		for(int ele=0;ele<numOfElements;ele++)
		{
			myArray[ele]=scanner.nextInt();
		}
		
		int length=myArray.length;
		int[] newArray=new int[length];
		int x=0;
		for(int i=0;i<myArray.length;i++)
		{
			boolean duplicate=false;
			for(int j=i+1;j<myArray.length;j++)
			{
				while(!duplicate)
				{
				//	System.out.println("i:"+i+" j: "+j);
					if(myArray[i]==(myArray[j]))
					{
						duplicate = true;
						int position=j;
						//System.out.println("position"+position+":"+myArray[i]+"is duplicate");
						break;
	
					}
					else
					{
						break;	
					}
				}
				
				}
			if(!duplicate) 
			{
				System.out.println(myArray[i]);
				newArray[x]=myArray[i];
				x++;
			}

			}
		System.out.println(Arrays.toString(newArray));
		for(int n:newArray)
		{
			if(n!=0)
				System.out.println(n);
		}
//		System.out.println(Arrays.toString(newArray));
		}
	
}
