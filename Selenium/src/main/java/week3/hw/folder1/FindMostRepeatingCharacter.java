package week3.hw.folder1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class FindMostRepeatingCharacter extends GetCountOfOccurence
{
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
}
