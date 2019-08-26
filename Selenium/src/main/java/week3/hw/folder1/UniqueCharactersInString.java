package week3.hw.folder1;

import java.util.Scanner;

public class UniqueCharactersInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.delimiter());
		System.out.println("Enter your String:");
		String input=sc.nextLine();
		System.out.println("Enter Y if you want to ignore case while comparison");
		String ignoreCase=sc.next();
		if((ignoreCase.toUpperCase()).equals("Y"))
			input=input.toUpperCase();
		char[] String1 = input.toCharArray();
		FindUniqueLetters unique= new FindUniqueLetters();
		unique.findUniqueLetters(String1);		
		FindDuplicateLetters duplicate= new FindDuplicateLetters();
		duplicate.findDuplicateLetters(String1);
		FindMostRepeatingCharacter repeat =new FindMostRepeatingCharacter();
		repeat.findMostRepeatingCharacter(String1);
		sc.close();
	}	
	/*Collection<Integer> values = letters.values();
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.addAll(values);
	Collections.sort(list);
	System.out.println(list);
	System.out.println(list.get(1));
	System.out.println(Collections.max(list));*/
}

