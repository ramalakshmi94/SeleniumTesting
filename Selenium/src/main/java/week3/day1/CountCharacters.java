package week3.day1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountCharacters 
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		String CompanyName="TEMENOS";
		Map<Character, Integer> Count = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<CompanyName.length();i++)
		{
			char ch=CompanyName.charAt(i);
			if(Count.containsKey(ch))
			{
				int num=Count.get(ch);
				num++;
				Count.put(ch,num);		
			}
			else
			{
				Count.put(ch,1);
			}
		}
		System.out.println(Count);
		System.out.println("Count of each character in the string");
		for(Entry<Character,Integer> eachCharacter:Count.entrySet())
		{
			System.out.print(eachCharacter.getKey()+"\t");
			System.out.println(eachCharacter.getValue());
		}
		//map Methods
		HashMap<Character, Integer> MapMethods = new HashMap<Character,Integer>(Count);
		System.out.println("Map Methods");
		MapMethods.put('A', 100);
		System.out.println("Comparing two Map variables:"+MapMethods.equals(Count));
		System.out.println("Keys"+MapMethods.keySet());
		System.out.println("Values"+MapMethods.values());
		System.out.println("Entry set"+MapMethods.entrySet());
		System.out.println("Contains key"+MapMethods.containsKey('T'));
		System.out.println(MapMethods.containsKey('5'));
		
		System.out.println("Contains value"+MapMethods.containsValue(1));
		System.out.println(MapMethods.containsKey('B'));
		//check why syso outputs zero for below case
		System.out.println("Remove"+MapMethods.remove('A'));
		System.out.println("equals methods"+MapMethods.equals(Count));
		System.out.println(MapMethods);
		MapMethods.clear();
		System.out.println("clear and check isempty:"+MapMethods.isEmpty());
		MapMethods.putIfAbsent('T', 10);
		System.out.println(MapMethods);
		Object clone = MapMethods.clone();
		System.out.println(clone);
		//clone.add('Z',1);
		System.out.println(MapMethods);
		System.out.println(clone);
		MapMethods.putAll(Count);
		System.out.println(MapMethods.getOrDefault('Y', 999));
		System.out.println(MapMethods);
	}
}
