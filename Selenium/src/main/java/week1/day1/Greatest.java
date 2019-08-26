package week1.day1;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class Greatest {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Program to print greatest of three numbers");
			int a=1200, b=6000, c=6000,greatest=0;
			
			if(a>b) 
			{
				if(a>c)
				{
					System.out.println("a is greater");
				}
				else
				{
					System.out.println("c is greater");
				}
				
			}
			else if (b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
			
		/*	if((a>b) && (a>c))
			{
				System.out.println("a is greater");
			}
			else if (b>c)
			{
				System.out.println("b is greater");
			}
			else if(c>b)
			{
				System.out.println("c is greater");
			}else {
				System.out.println("no answer");
			}*/	
			}
		
}
