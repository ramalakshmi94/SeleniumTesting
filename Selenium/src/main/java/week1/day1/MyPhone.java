package week1.day1;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile();
		
		m.sendSMS();
		String dialNumber = m.dialNumber();
		//String brand = m.brand;
		String model = m.model;
		
		System.out.println(dialNumber);
		System.out.println(m.brand);
		System.out.println(model);
	}
	
	}
