package week3.day1;

import week3.day1.Auto;
import week3.day1.Car;

public class MyVehicle
{
	public static void main(String[] args) 
	{
		Car mc= new Car();
		//Object of MyCar class can be used to acces method of Car class 
		//since Inheritance concept is used(MyCar Class Inherits Car Class)
		mc.airBag();
		mc.applyBrake();
		mc.pressHorn();
		
		//below line will give err since StartHandle class is not inherited and we need an object to access the same
		//mc.StartHandle();
		Auto a1=new Auto();
		a1.StartHandle();
		a1.applyBrake();
		a1.pressHorn();
	}
	
}
