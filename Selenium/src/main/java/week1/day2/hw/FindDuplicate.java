package week1.day2.hw;

import java.util.Arrays;
import java.util.Scanner;

	public class FindDuplicate
	{
		//method to get input from the user	
		public int[] getElements()
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
			scanner.close();
			return myArray;
		}
		
		//method to check for duplicate elements and eliminate them
		public int[] checkDuplicate(int[] array)
		{
			int length=array.length;
			int[] newArray=new int[length];
			int x=0;
			int duplicatecount=0;
			for(int i=0;i<array.length;i++)
			{
				boolean duplicate=false;
				for(int j=i+1;j<array.length;j++)
				{
					while(!duplicate)
					{
					//	System.out.println("i:"+i+" j: "+j);
						if(array[i]==(array[j]))
						{
							duplicate = true;
							duplicatecount++;
							//System.out.println("position"+j+":"+myArray[i]+"is duplicate");
							break;
						}
						else
						{
							break;	
						}
					}
					if(duplicate)
						break;
				}
				if(!duplicate) 
				{
					//System.out.println(myArray[i]);
					newArray[x]=array[i]; //assign unique elements to a new array
					x++;
				}
			}
			System.out.println(duplicatecount+" duplicate element found");
			return newArray;
		}
		
		//method to display the elements in an array
		public void displayArray(int[] input)
		{
			for(int n:input)
			{
				
				if(n!=0)
					System.out.println(n);
			}
		}	
		
		public static void main(String[] args) 
		{
			FindDuplicate fd =new FindDuplicate();
			int input[]=fd.getElements();
			int result[]=fd.checkDuplicate(input);
			System.out.println("List of elements After eliminating the duplicate values:");
			fd.displayArray(result);
	//		System.out.println(Arrays.toString(result));
	//		System.out.println(Arrays.toString(newArray));
		}	
}