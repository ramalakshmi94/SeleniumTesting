package week3.hw;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheValues
{
	public static void main(String[] args) 
	{
		ArrayList<String> companies = new ArrayList<String>();
		companies.add("HCL");
		companies.add("CTS");
		companies.add("Aspire Systems");
		companies.add("Temenos");
		System.out.println(companies);
		Collections.sort(companies);
		System.out.println(companies);
		Collections.reverse(companies);
		System.out.println(companies);
	}
	
}
