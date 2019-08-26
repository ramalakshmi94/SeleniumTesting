package week1.day2.cw;

public class TestForEach {

	public static void main(String[] args) 
	{
		String carmodel[]= {"Ford","Hyundai","Tata","Suzuki"};
		System.out.println("Displaying the values in array using foreach:");
		for(String car:carmodel)
		{
			System.out.println(car);
		}
		
		System.out.println("Displaying the values in array using For loop:");
		for(int i=0;i<carmodel.length;i++)
		{
			System.out.println(carmodel[i]);
		}
		
	}

}
