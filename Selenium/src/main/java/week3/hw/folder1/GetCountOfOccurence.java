package week3.hw.folder1;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCountOfOccurence 
{
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
}
