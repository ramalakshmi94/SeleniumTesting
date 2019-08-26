package week3.hw.folder1;

import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateLetters extends GetCountOfOccurence
{
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
}
