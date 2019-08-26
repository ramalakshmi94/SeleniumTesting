package week1.day1.hw;

import week3.day1.Auto;
import week3.day1.Car;

public class MyCar extends Car
{
	public static void main(String[] args) 
	{
		MyCar mc= new MyCar();
		//Object of MyCar class can be used to acces method of Car class 
		//since Inheritance concept is used(MyCar Class Inherits Car Class)
		
		//below line will give err since StartHandle class is not inherited and we need an object to access the same
		//mc.StartHandle();
		Auto a1=new Auto();
		a1.StartHandle();
	}
	
}
