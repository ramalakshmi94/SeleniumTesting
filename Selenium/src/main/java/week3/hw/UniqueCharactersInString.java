package week3.hw;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharactersInString 
{
	public static void main(String[] args) 
	{
		UniqueCharactersInString obj=new UniqueCharactersInString();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("Enter Y if you want to ignore case while comparison");
		String ignoreCase=sc.next();
		if((ignoreCase.toUpperCase()).equals("Y"))
			input=input.toUpperCase();
		char[] String1 = input.toCharArray();
		obj.findUniqueLetters(String1);
		obj.findDuplicateLetters(String1);
		obj.findMostRepeatingCharacter(String1);
		sc.close();
		//String inputUpperCase=input.toUpperCase();
		//char[] String2 = inputUpperCase.toCharArray();
		/*Map<Character,Integer> uniqueletters2=obj.findUniqueLetters(String2);
		Map<Character,Integer> duplicateletters2=obj.findDuplicateLetters(String1);
		obj.findMostRepeatingCharacter(uniqueletters2);*/
	}	
	public void findUniqueLetters(char[] StringAsArray)
	{
		System.out.println("Printing Unique letters in the String");
		Map<Character, Integer> letters = getCountOfOccurence(StringAsArray);
		for(Entry<Character,Integer> eachletter:letters.entrySet())
		{
			if(eachletter.getValue()<=1)
			{
				System.out.print(eachletter.getKey());
			}
		}
		System.out.println();
	}
	
	public void findDuplicateLetters(char[] StringAsArray)
	{
		System.out.println("Printing Duplicate letters in the String");
		Map<Character, Integer> letters = getCountOfOccurence(StringAsArray);
		for(Entry<Character,Integer> eachletter:letters.entrySet())
		{
			if(eachletter.getValue()>1)
			{
				System.out.print(eachletter.getKey());
			}
		}
		System.out.println();
	}
	
	public Map<Character, Integer> getCountOfOccurence(char[] StringAsArray)
	{
		Map<Character, Integer> letters = new LinkedHashMap<Character,Integer>();
		for(Character ch:StringAsArray)
		{
			if(ch!=' ')
			{
				if(letters.containsKey(ch))
				{
					int count=letters.get(ch);
					//count++;
					letters.put(ch,++count);
				}
				else
				{
					letters.put(ch,1);
				}
			}
		}
		return letters;
	}
	
	public void findMostRepeatingCharacter(char[] StringAsArray)
	{
		Map<Character, Integer> letters = getCountOfOccurence(StringAsArray);
		Collection<Integer> values = letters.values();
		Set<Integer> valueSet=new TreeSet<Integer>(values);
		System.out.println(valueSet);
		ArrayList<Integer> arrayListvalues = new ArrayList<Integer>(valueSet);
		int size=arrayListvalues.size();
		int secondHighestValue=arrayListvalues.get(size-2); //-2 because index starts from 0 and we want second highest
		System.out.println(secondHighestValue);
		for(Entry<Character,Integer> eachletter:letters.entrySet())
		{
			if(eachletter.getValue().equals(secondHighestValue))
			{
				System.out.println("the character with second most occurence is "+eachletter.getKey());
			}
		}
	}
	/*Collection<Integer> values = letters.values();
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.addAll(values);
	Collections.sort(list);
	System.out.println(list);
	System.out.println(list.get(1));
	System.out.println(Collections.max(list));*/
}

