package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest 
{
public static void main(String[] args) 
{
	String toBeMatched;
	Pattern p;
	Matcher match;
	boolean ismatches;
	String str= "This is the string to be searched for the occurence of the word is";
	
	toBeMatched="  This is";
	p= Pattern.compile(toBeMatched);
	match = p.matcher(str);
	boolean lookingAt = match.lookingAt();
	System.out.println(lookingAt); // false since the beginning of the string doesnt match having extra spaces
	
	toBeMatched="This is";
	p= Pattern.compile(toBeMatched);
	match = p.matcher(str);
	ismatches = match.matches();
	System.out.println(ismatches); //false will be returned since pattern and the string are not exactly same
	
	 lookingAt = match.lookingAt();
	System.out.println(lookingAt); // true since the beginning of the string matches with the given pattern4
	
	int count=0;
	toBeMatched=" is";
	p= Pattern.compile(toBeMatched);
	String[] split = p.split(str);
	for(String strng: split)
	{
		System.out.println(strng);
	}
	match = p.matcher(str);
	System.out.println(split.length);
	System.out.println("Group count"+match.groupCount());
	boolean find = match.find(); //returns true if there is atlease one match for the pattern within the string
	int start = match.start(); //returns the beginning index of the match
	int end = match.end();	//returns the ending index of the match
	System.out.println(find);
	System.out.println(start);
	System.out.println(end);	
	
	//to find count of matching occurences
	match.reset(); // resets the matcher count to zero
	while(match.find())
	{
		++count;
		start = match.start();
		end = match.end();	
		System.out.println(start);
		System.out.println(end);
		System.out.println("count"+count);
		System.out.println(match.group()); //return the group of characters matching the pattern
		System.out.println("Group count"+match.groupCount());
	}
	System.out.println("number of occurences"	+count);
	
	String replaceFirst = match.replaceFirst(" was"); //replace first occurence
	System.out.println(replaceFirst);
	String replaceAll = match.replaceAll(" was"); //replace all occurences
	System.out.println(replaceAll);
	
	}
	
	
}
