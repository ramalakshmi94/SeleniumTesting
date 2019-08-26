package week8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.exception.ZeroException;

public class Sort 
{
	int zeroMoved=0;
	public int findTotalZeros(int data[])
	{
		int totalZero=0;
		for(int a=0;a<data.length;a++)
		{
			if(data[a]==0)
				totalZero++;
		}	
		return totalZero;
	}
	public int[] moveZerosToEnd(int data[])
	{
		for(int i=0;i<data.length;i++)
		{
			if(i>=data.length-zeroMoved)
				break;
			if(data[i]==0)
			{
				zeroMoved++;
				for(int j=i;j<data.length-1;j++)
				data[j]=data[j+1];
				data[data.length-1]=0;
			}	
		}
		printArray(data);
		System.out.println(zeroMoved+"Moved");
		return data;
	}
	
	public void printArray(int data[])
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+",");
		
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) 
	{
		int data[]={0,0,2,1,0,7,0,7,0,3};
		Sort s =new Sort();
		int totalZero=s.findTotalZeros(data);
		System.out.println("Total zeros:"+totalZero);
		do
		{
			int zeroMovedAfterSort[]=s.moveZerosToEnd(data);
			s.moveZerosToEnd(zeroMovedAfterSort);
		}while(s.zeroMoved!=totalZero);
}}